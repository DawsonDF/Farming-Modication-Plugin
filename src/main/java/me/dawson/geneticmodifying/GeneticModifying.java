package me.dawson.geneticmodifying;

import org.bukkit.plugin.java.JavaPlugin;

public final class GeneticModifying extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Hello World!");
        GeneticItems.init();

        getServer().getPluginManager().registerEvents(new BreakBlock(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
