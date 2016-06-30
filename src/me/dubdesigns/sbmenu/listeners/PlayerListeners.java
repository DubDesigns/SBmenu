package me.dubdesigns.sbmenu.listeners;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

import me.dubdesigns.sbmenu.Main;
import me.dubdesigns.sbmenu.MenuManager;
import net.md_5.bungee.api.ChatColor;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitScheduler;

public class PlayerListeners implements Listener {
	
	public Main plugin;
	public PlayerListeners(Main instance){
		plugin = instance;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	
	@EventHandler
	public void onJoin(final PlayerJoinEvent e) {
		if(Main.getPlugin().getConfig().getBoolean("onjoin") == true) {
	        BukkitScheduler scheduler = plugin.getServer().getScheduler();
	        scheduler.runTaskLater(plugin, new Runnable() {
	            @Override
	            public void run() {
	            	MenuManager.openMenu(e.getPlayer());
	            }
	        }, 1);
	    return;
		}
	}
	
	
	@EventHandler
    public void InventoryClick(InventoryClickEvent e) {
    	if (!e.getInventory().getName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("menu")))) return;
    	e.setCancelled(true);
    	
    		Player player = (Player) e.getWhoClicked();
    		
    		ByteArrayOutputStream b = new ByteArrayOutputStream();
    		DataOutputStream out = new DataOutputStream(b);
    		
    		if (e.getCurrentItem() == null) return;
    		
    		String name1 = Main.getPlugin().getConfig().getString("menus.1.name");
        	if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', name1))) {
                try {
                	out.writeUTF("Connect");
                	out.writeUTF(Main.getPlugin().getConfig().getString("menus.1.connect"));
                } catch (Exception e1) {
                	e1.printStackTrace();
                }
                player.sendPluginMessage(plugin, "BungeeCord", b.toByteArray());
        	}
        	
        	
    		String name2 = Main.getPlugin().getConfig().getString("menus.2.name");
        	if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', name2))) {
                try {
                	out.writeUTF("Connect");
                	out.writeUTF(Main.getPlugin().getConfig().getString("menus.2.connect"));
                } catch (Exception e1) {
                	e1.printStackTrace();
                }
                player.sendPluginMessage(plugin, "BungeeCord", b.toByteArray());
        	}
        	
        	
    		String name3 = Main.getPlugin().getConfig().getString("menus.3.name");
        	if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', name3))) {
                try {
                	out.writeUTF("Connect");
                	out.writeUTF(Main.getPlugin().getConfig().getString("menus.3.connect"));
                } catch (Exception e1) {
                	e1.printStackTrace();
                }
                player.sendPluginMessage(plugin, "BungeeCord", b.toByteArray());
        	}
        	
        	
    		String name4 = Main.getPlugin().getConfig().getString("menus.4.name");
        	if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', name4))) {
                try {
                	out.writeUTF("Connect");
                	out.writeUTF(Main.getPlugin().getConfig().getString("menus.4.connect"));
                } catch (Exception e1) {
                	e1.printStackTrace();
                }
                player.sendPluginMessage(plugin, "BungeeCord", b.toByteArray());
        	}
        	
    		String name5 = Main.getPlugin().getConfig().getString("menus.5.name");
        	if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', name5))) {
                try {
                	out.writeUTF("Connect");
                	out.writeUTF(Main.getPlugin().getConfig().getString("menus.5.connect"));
                } catch (Exception e1) {
                	e1.printStackTrace();
                }
                player.sendPluginMessage(plugin, "BungeeCord", b.toByteArray());
        	}
    	
    }

}
