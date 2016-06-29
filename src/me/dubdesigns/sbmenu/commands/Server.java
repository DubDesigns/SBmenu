package me.dubdesigns.sbmenu.commands;

import me.dubdesigns.sbmenu.Main;
import me.dubdesigns.sbmenu.MenuManager;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Server implements CommandExecutor {
	
	public Main plugin;
	public Server(Main instance){
		plugin = instance;
	}
	
	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        Player player = (Player) sender;
        if(commandLabel.equalsIgnoreCase("server")){
        	MenuManager.openMenu(player);
        }
        return false;
    }

}
