package me.kevind.utils;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ArmorUtils {
    public static void clearArmor(Player player) {
        player.getInventory().setArmorContents(new ItemStack[4]);
    }
}

