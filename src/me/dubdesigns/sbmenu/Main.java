package me.dubdesigns.sbmenu;

import me.dubdesigns.sbmenu.commands.Server;
import me.dubdesigns.sbmenu.listeners.PlayerListeners;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener  {
    public static Main plugin;
    
    public void onEnable() {
    	getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
    	registerEvents(); 	
    	registerCommands();
    	registerPlaceholders();
    	this.saveDefaultConfig();
    	plugin = this;
    	
    }
    
    public static Plugin getPlugin() {
        return plugin;
    }
    
    private void registerEvents() {
    	new PlayerListeners(this);
    }
    
    private void registerCommands() {
    	getCommand("server").setExecutor(new Server(this));
    	getCommand("sbmenureload").setExecutor(new Server(this));
    	getCommand("joinserver").setExecutor(new Server(this));
    }
    
    private void registerPlaceholders() {
        if (Bukkit.getPluginManager().isPluginEnabled("PlaceholderAPI")) {
            Bukkit.getPluginManager().registerEvents(this, this);
        } else {
            throw new RuntimeException("Could not find PlaceholderAPI!! Plugin can not work without it!");
        }
    }

}