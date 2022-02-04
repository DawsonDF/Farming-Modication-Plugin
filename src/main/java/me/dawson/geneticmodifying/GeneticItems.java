package me.dawson.geneticmodifying;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class GeneticItems extends BreakBlock {

    public static ItemStack legendaryWheatSeeds;
    public static ItemStack legendaryGene;

    public static void init(){
        createLegendaryWheatSeeds();

    }

    private static void createLegendaryWheatSeeds() {

        ItemStack item = new ItemStack(Material.WHEAT_SEEDS, 10);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Legendary Wheat Seeds");
        List<String> lore = new ArrayList<>();
        lore.add("This is a legendary wheat seed.");
        meta.setLore(lore);
        item.setItemMeta(meta);

        legendaryWheatSeeds = item;

    }
}
