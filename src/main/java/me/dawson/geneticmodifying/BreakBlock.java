package me.dawson.geneticmodifying;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BreakBlock implements Listener {

    @EventHandler
    public void onPlayerBreakBlock(BlockBreakEvent event){
        Block blockBroken = event.getBlock();

        Random r = new Random();

        if (blockBroken.getType() == Material.WHEAT){
            int chance = r.nextInt(100);
            if (chance < 5){
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack diamonds = new ItemStack(Material.WHEAT, 10);
                ItemStack gWheatSeed= new ItemStack(Material.WHEAT_SEEDS, 3);

            }


        }


    }

}
