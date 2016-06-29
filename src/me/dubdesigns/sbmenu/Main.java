package me.dubdesigns.sbmenu;

import me.dubdesigns.sbmenu.commands.Server;
import me.dubdesigns.sbmenu.listeners.PlayerListeners;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener  {
    public Main plugin;
    
    public void onEnable() {
    	Bukkit.getPluginManager().registerEvents(this, plugin);
    	//this.saveDefaultConfig();
    	
    	getCommand("server").setExecutor(new Server(this));
    	
    	new PlayerListeners(this);
    }
	
}
