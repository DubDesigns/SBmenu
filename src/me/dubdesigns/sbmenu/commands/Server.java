package me.dubdesigns.sbmenu.commands;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

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
        if(cmd.getName().equalsIgnoreCase("server")){
        	MenuManager.openMenu(player);
        }
        if(cmd.getName().equalsIgnoreCase("sbmenureload")) {
        	plugin.reloadConfig();
        	sender.sendMessage("§aSBmenu is reloaded.");
        }
        if(cmd.getName().equalsIgnoreCase("joinserver")) {
    		ByteArrayOutputStream b = new ByteArrayOutputStream();
    		DataOutputStream out = new DataOutputStream(b);
            try {
            	out.writeUTF("Connect");
            	out.writeUTF(args[0]);
            } catch (Exception e1) {
            	e1.printStackTrace();
            }
            player.sendPluginMessage(plugin, "BungeeCord", b.toByteArray());
        }
        return true;
    }

}
