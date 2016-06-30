package me.dubdesigns.sbmenu;

import java.util.ArrayList;
import java.util.List;

import me.clip.placeholderapi.PlaceholderAPI;
import net.md_5.bungee.api.ChatColor;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class MenuManager {
	public Main plugin;

	public static void openMenu(Player player){
		
		String menuhead = PlaceholderAPI.setPlaceholders(player, Main.getPlugin().getConfig().getString("menu"));
        Inventory inv = Bukkit.createInventory(null, InventoryType.HOPPER, ChatColor.translateAlternateColorCodes('&', menuhead));

		String itemid1 = Main.getPlugin().getConfig().getString("menus.1.id");
		int itemamount1 = Main.getPlugin().getConfig().getInt("menus.1.amount");
		int itemdata1 = Main.getPlugin().getConfig().getInt("menus.1.data");
		ItemStack item1 = new ItemStack(Material.getMaterial(itemid1), itemamount1, (short)itemdata1);
        ItemMeta item1meta = item1.getItemMeta();
        if(!Main.getPlugin().getConfig().getBoolean("menus.1.disable") == true) {
            String menu1placeholder = PlaceholderAPI.setPlaceholders(player, Main.getPlugin().getConfig().getString("menus.1.name"));
        	item1meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', menu1placeholder));		
        	
        	List<String> item1lore = new ArrayList<String>();
            for(String lorelist1 : Main.getPlugin().getConfig().getStringList("menus.1.lore")){
            	String m = PlaceholderAPI.setPlaceholders(player, lorelist1);
            	item1lore.add(ChatColor.translateAlternateColorCodes('&', m));
            }

            item1meta.setLore(item1lore);
        	item1.setItemMeta(item1meta);
        	}
        
		String itemid2 = Main.getPlugin().getConfig().getString("menus.2.id");
		int itemamount2 = Main.getPlugin().getConfig().getInt("menus.2.amount");
		int itemdata2 = Main.getPlugin().getConfig().getInt("menus.2.data");
		ItemStack item2 = new ItemStack(Material.getMaterial(itemid2), itemamount2, (byte)itemdata2);
		ItemMeta item2meta = item2.getItemMeta();
		
		 if(!Main.getPlugin().getConfig().getBoolean("menus.2.disable") == true) {
		     String menu2placeholder = PlaceholderAPI.setPlaceholders(player, Main.getPlugin().getConfig().getString("menus.2.name"));
		     
			 item2meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', menu2placeholder));	
			 List<String> item2lore = new ArrayList<String>();
			 
			 for(String lorelist2 : Main.getPlugin().getConfig().getStringList("menus.2.lore")){
		     String m = PlaceholderAPI.setPlaceholders(player, lorelist2);
           	 item2lore.add(ChatColor.translateAlternateColorCodes('&', m));
        }
		
		item2meta.setLore(item2lore);
		item2.setItemMeta(item2meta);
	}
		String itemid3 = Main.getPlugin().getConfig().getString("menus.3.id");
		int itemamount3 = Main.getPlugin().getConfig().getInt("menus.3.amount");
		int itemdata3 = Main.getPlugin().getConfig().getInt("menus.3.data");
		ItemStack item3 = new ItemStack(Material.getMaterial(itemid3), itemamount3, (short)itemdata3);
		ItemMeta item3meta = item3.getItemMeta();
		 if(!Main.getPlugin().getConfig().getBoolean("menus.3.disable")== (true)) {
		     String menu3placeholder = PlaceholderAPI.setPlaceholders(player, Main.getPlugin().getConfig().getString("menus.3.name"));
		     item3meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', menu3placeholder));	
		     List<String> item3lore = new ArrayList<String>();
		     for(String lorelist3 : Main.getPlugin().getConfig().getStringList("menus.3.lore")){
        	 String m = PlaceholderAPI.setPlaceholders(player, lorelist3);
        	 item3lore.add(ChatColor.translateAlternateColorCodes('&', m));
        }
		
		item3meta.setLore(item3lore);
		item3.setItemMeta(item3meta);
	}
		String itemid4 = Main.getPlugin().getConfig().getString("menus.4.id");
		int itemamount4 = Main.getPlugin().getConfig().getInt("menus.4.amount");
		int itemdata4 = Main.getPlugin().getConfig().getInt("menus.4.data");
		ItemStack item4 = new ItemStack(Material.getMaterial(itemid4), itemamount4, (short)itemdata4);
		ItemMeta item4meta = item4.getItemMeta();
		 if(!Main.getPlugin().getConfig().getBoolean("menus.4.disable") == true) {

		     String menu4placeholder = PlaceholderAPI.setPlaceholders(player, Main.getPlugin().getConfig().getString("menus.4.name"));
		     item4meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', menu4placeholder));	
		     List<String> item4lore = new ArrayList<String>();
		     for(String lorelist4 : Main.getPlugin().getConfig().getStringList("menus.4.lore")){
		     String m = PlaceholderAPI.setPlaceholders(player, lorelist4);
        	 item4lore.add(ChatColor.translateAlternateColorCodes('&', m));
        }
		item4meta.setLore(item4lore);
		item4.setItemMeta(item4meta);
	}
		String itemid5 = Main.getPlugin().getConfig().getString("menus.5.id");
		int itemamount5 = Main.getPlugin().getConfig().getInt("menus.5.amount");
		int itemdata5 = Main.getPlugin().getConfig().getInt("menus.5.data");
		ItemStack item5 = new ItemStack(Material.getMaterial(itemid5), itemamount5, (short)itemdata5);
		ItemMeta item5meta = item5.getItemMeta();
		 if(!Main.getPlugin().getConfig().getBoolean("menus.5.disable") == true) {

		     String menu5placeholder = PlaceholderAPI.setPlaceholders(player, Main.getPlugin().getConfig().getString("menus.5.name"));
		     item5meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', menu5placeholder));	
		     List<String> item5lore = new ArrayList<String>();
		     for(String lorelist5 : Main.getPlugin().getConfig().getStringList("menus.5.lore")){
        	 String m = PlaceholderAPI.setPlaceholders(player, lorelist5);
        	 item5lore.add(ChatColor.translateAlternateColorCodes('&', m));
        }
		item5meta.setLore(item5lore);
		item5.setItemMeta(item5meta);
	}
		inv.setItem(0, item1);
		inv.setItem(1, item2);
		inv.setItem(2, item3);
		inv.setItem(3, item4);
		inv.setItem(4, item5);
		
        player.openInventory(inv);
	}

}
