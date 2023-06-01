package com.justice.test;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class BroadcastCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (commandSender instanceof Player){
            ((Player) commandSender).sendMessage(ChatColor.RED + "This command can only be executed by the console!");
        } else {
            Bukkit.broadcastMessage(ChatColor.RED + "This is a broadcast message!");
        }

       return false;
    }
}
