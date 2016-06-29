package me.dubdesigns.sbmenu;

import me.dubdesigns.sbmenu.Main;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.Overridden;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener  {
    
    @Override
    public void onEnable() {
    	//this.saveDefaultConfig();
    	new Events(this);
    } 
	
	@Overridden
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        Player player = (Player) sender;
        if(commandLabel.equalsIgnoreCase("server")){
            ItemStack slot1 = new ItemStack(Material.getMaterial(getConfig().getString("1.item")));
            slot1.getItemMeta().setDisplayName(getConfig().getString("1.name"));
            slot1.getItemMeta().setLore(getConfig().getStringList("1.lore"));
            
            ItemStack slot2 = new ItemStack(Material.getMaterial(getConfig().getString("2.item")));
            slot1.getItemMeta().setDisplayName(getConfig().getString("2.name"));
            slot1.getItemMeta().setLore(getConfig().getStringList("2.lore"));
            
            ItemStack slot3 = new ItemStack(Material.getMaterial(getConfig().getString("3.item")));
            slot1.getItemMeta().setDisplayName(getConfig().getString("3.name"));
            slot1.getItemMeta().setLore(getConfig().getStringList("3.lore"));
            
            ItemStack slot4 = new ItemStack(Material.getMaterial(getConfig().getString("4.item")));
            slot1.getItemMeta().setDisplayName(getConfig().getString("4.name"));
            slot1.getItemMeta().setLore(getConfig().getStringList("4.lore"));
            
            ItemStack slot5 = new ItemStack(Material.getMaterial(getConfig().getString("5.item")));
            slot1.getItemMeta().setDisplayName(getConfig().getString("5.name"));
            slot1.getItemMeta().setLore(getConfig().getStringList("5.lore"));
            
            Inventory inv = Bukkit.createInventory(null, InventoryType.HOPPER, getConfig().getString("menu"));
            
        	inv.addItem(slot1);
        	inv.addItem(slot2);
        	inv.addItem(slot3);
        	inv.addItem(slot4);
        	inv.addItem(slot5);
            player.openInventory(inv);
 
        }
        return false;
    }
}
