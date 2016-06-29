package me.dubdesigns.sbmenu;

import me.dubdesigns.sbmenu.main;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.Overridden;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin implements Listener  {
    public main plugin;
    @Override
    public void onEnable() {
    	Bukkit.getPluginManager().registerEvents(this, plugin);
    	//this.saveDefaultConfig();
    } 
	
	@Overridden
    public boolean onCommand(CommandSender sender, Command cmd,
            String commandLabel, String[] args) {
        Player player = (Player) sender;
        ItemStack item1 = new ItemStack(Material.STONE_SWORD);
        Inventory inv = Bukkit.createInventory(null, InventoryType.HOPPER, "server menu");
        if(commandLabel.equalsIgnoreCase("server")){
 
            inv.addItem(item1);
            player.openInventory(inv);
 
        }
        return false;
    }
    
    
    @EventHandler
    public void InventoryClick(InventoryClickEvent e) {
    	if (e.getInventory().getName().equalsIgnoreCase("server menu")) return;
    	e.setCancelled(true);
    }
}
