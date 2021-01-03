package fr.skylined.shopgui.utils;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GuiUtils{
	
	public static void addItem(Material block, List<String> lore, int quantity, Inventory inv, String name, int place) {
		ItemStack item = new ItemStack(block, quantity);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(name);
		itemMeta.setLore(lore);
		item.setItemMeta(itemMeta);
		inv.setItem(place, item);
	}
	
	public static void addItem(Material block, List<String> lore, int quantity, Inventory inv, int place) {
		ItemStack item = new ItemStack(block, quantity);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName("§0");
		itemMeta.setLore(lore);
		item.setItemMeta(itemMeta);
		inv.setItem(place, item);
	}
	
	public static void addItem(Material block, List<String> lore, Inventory inv, String name, int place) {
		ItemStack item = new ItemStack(block, 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(name);
		itemMeta.setLore(lore);
		item.setItemMeta(itemMeta);
		inv.setItem(place, item);
	}
	
	public static void addItem(Material block, List<String> lore, Inventory inv, int place) {
		ItemStack item = new ItemStack(block, 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName("§0");
		itemMeta.setLore(lore);
		item.setItemMeta(itemMeta);
		inv.setItem(place, item);
	}
	
	public static void fillBackground(Material block, List<String> lore, Inventory inv) {
		ItemStack item = new ItemStack(block, 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName("§0");
		itemMeta.setLore(lore);
		item.setItemMeta(itemMeta);
		for(int slot = 0; slot < inv.getSize(); slot++) {
			if(inv.getItem(slot) == null) {
				inv.setItem(slot, item);
			}
		}
	}
	
	public static void fillItemBackground(Material block, List<String> lore, Inventory inv, int quantity, String name, int slot, int slot2) {
		ItemStack item = new ItemStack(block, quantity);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(name);
		itemMeta.setLore(lore);
		item.setItemMeta(itemMeta);
		for(int i = slot; i < slot2; slot++) {
			if(inv.getItem(slot) == null) {
				inv.setItem(slot, item);
			}
		}
	}
	
	public static void fillItem(Material block, List<String> lore, Inventory inv, int quantity, String name, int slot, int slot2) {
		ItemStack item = new ItemStack(block, quantity);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(name);
		itemMeta.setLore(lore);
		item.setItemMeta(itemMeta);
		for(int i = slot; i < slot2; slot++) {
				inv.setItem(slot, item);
		}
	}
	
	public static Inventory addGui(String name, int size) {
		Inventory inv = Bukkit.createInventory(null, size, name);
		return inv;
	}
	
	public static void openGui(Player player, Inventory inv) {
		player.openInventory(inv);
	}

}
