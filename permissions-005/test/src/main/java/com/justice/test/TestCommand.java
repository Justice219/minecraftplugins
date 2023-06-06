package com.justice.test;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class TestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            @NotNull String permission = "test.test";
            if (player.hasPermission(permission)) {
                player.sendMessage(ChatColor.GREEN + "You have permission to use this command!");
            } else {
                player.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
            }
        }

        return false;
    }
}
