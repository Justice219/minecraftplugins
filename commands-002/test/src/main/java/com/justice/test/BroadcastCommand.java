package com.justice.test;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class BroadcastCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (!(commandSender instanceof Player)) return false;
        Player player = (Player) commandSender;
        player.sendMessage(ChatColor.RED + "Message publicly sent!");

        // get command arguments
        String message = "";
        for (String str : strings) {
            message += str + " ";
        }

        // send the message to all players
        for (Player p : player.getServer().getOnlinePlayers()) {
            p.sendMessage(message);
        }

       return false;
    }
}
