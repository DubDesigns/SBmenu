package me.dubdesigns.sbmenu;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class Events implements Listener{
    public Main plugin;
    public Events(Main instance){
    	plugin = instance;
    	Bukkit.getPluginManager().registerEvents(this, this.plugin);
    	}
    
    @EventHandler
    public void InventoryClick(InventoryClickEvent e) {
    	if (!e.getInventory().getName().equalsIgnoreCase("server menu")) return;
    	//Player p = (Player) e.getWhoClicked();
    	
    	
    	
    	e.setCancelled(true);
    }
}
