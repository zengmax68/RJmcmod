package com.max.rjmcmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RJmcmod implements ModInitializer {
    // Juliet's Flower item
    public static final Item JULIETS_FLOWER = new Item(
            new Item.Settings().maxCount(64)
    );

    @Override
    public void onInitialize() {
        // Register the item
        Registry.register(
                Registries.ITEM,
                Identifier.of("rjmcmod", "juliets_flower"),
                JULIETS_FLOWER
        );

        // Add to creative tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(new ItemStack(JULIETS_FLOWER));
        });
    }
}
