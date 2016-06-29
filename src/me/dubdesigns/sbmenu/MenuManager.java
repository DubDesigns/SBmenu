package me.dubdesigns.sbmenu;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MenuManager {
	
	public static void openMenu(Player player){
        Inventory inv = Bukkit.createInventory(null, InventoryType.HOPPER, "Server Menu");
        
        // First item
		ItemStack item1 = new ItemStack(Material.STONE_SWORD);
		ItemMeta item1meta = item1.getItemMeta();
		item1meta.setDisplayName("item 1");	
		List<String> item1lore = new ArrayList<String>();
		item1lore.add("lore line 1");
		item1lore.add("lore line 2");
		item1lore.add("lore line 3");
		
		item1meta.setLore(item1lore);
		item1.setItemMeta(item1meta);
		
		// Second item
		ItemStack item2 = new ItemStack(Material.CARROT);
		ItemMeta item2meta = item1.getItemMeta();
		item1meta.setDisplayName("item 2");	
		List<String> item2lore = new ArrayList<String>();
		item2lore.add("lore line 1");
		item2lore.add("lore line 2");
		item2lore.add("lore line 3");
		
		item2meta.setLore(item2lore);
		item2.setItemMeta(item2meta);
		
		inv.setItem(1, item1);
		inv.setItem(2, item2);
		
        player.openInventory(inv);
	}

}
