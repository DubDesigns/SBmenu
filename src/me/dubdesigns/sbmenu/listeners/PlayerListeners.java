package me.dubdesigns.sbmenu.listeners;

import me.dubdesigns.sbmenu.Main;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class PlayerListeners implements Listener {
	
	public Main plugin;
	public PlayerListeners(Main instance){
		plugin = instance;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
    public void InventoryClick(InventoryClickEvent e) {
    	if (e.getInventory().getName().equalsIgnoreCase("Server Menu")) return;
    	e.setCancelled(true);
    }

}
