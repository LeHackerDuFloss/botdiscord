package fr.skylined.shopgui.utils;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ShopUtils {
	

	public static void addItem(Material block, List<String> lore, int quantity, Inventory inv, String name, int place) {
		ItemStack item = new ItemStack(block, quantity);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(name);
		itemMeta.setLore(lore);
		item.setItemMeta(itemMeta);
		inv.setItem(place, item);
	}
	public static Inventory addGui(String name, int size) {
		Inventory inv = Bukkit.createInventory(null, size, name);
		return inv;
	}
	
	public static void openGui(Player player, Inventory inv) {
		player.openInventory(inv);
	}
}
