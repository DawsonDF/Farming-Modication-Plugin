package me.dawson.geneticmodifying;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.data.Ageable;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.block.data.BlockData;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BreakBlock implements Listener {

    @EventHandler
    public void onPlayerBreakBlock(BlockBreakEvent event){
        GeneticItems.init();
        GeneticItems geneticItems = new GeneticItems();
        Block blockBroken = event.getBlock();
        final Ageable ageable = (Ageable) event.getBlock().getState().getBlockData();
        Random r = new Random();

        if (blockBroken.getType() == Material.WHEAT){
            if (ageable.getAge() == 7) {
                int chance = r.nextInt(100);
                if (chance < 2) {
                    event.setCancelled(true);
                    blockBroken.setType(Material.AIR);
                    ItemStack LEGENDARY_WHEAT = new ItemStack(Material.WHEAT, 20);
                    blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), GeneticItems.legendaryWheatSeeds);
                    blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), LEGENDARY_WHEAT);

                }
            }
        }
    }
}
