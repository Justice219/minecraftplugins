package com.justice.test;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ConfigCommand implements CommandExecutor {

    private TestPlugin testPlugin;

    public ConfigCommand(TestPlugin testPlugin){
        this.testPlugin = testPlugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

    if (commandSender instanceof Player){
        Player player = (Player) commandSender;

        player.sendMessage("Your config value is: " + testPlugin.getConfig().getString("Word"));
        if (testPlugin.getConfig().getBoolean("Boolean")){
            player.sendMessage("Your config value is true");
        } else {
            player.sendMessage("Your config value is false");
        }

        for(String string : testPlugin.getConfig().getStringList("String-list")){
            player.sendMessage(string);
        }

        player.sendMessage("Thank you for using this command!");
    } else {
        commandSender.sendMessage("You must be a player to use this command");
    }


        return false;
    }
}
