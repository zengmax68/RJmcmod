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
    public static Item JULIETS_FLOWER;

    @Override
    public void onInitialize() {
        // Use Identifier.of instead of new Identifier
        JULIETS_FLOWER = Registry.register(
                Registries.ITEM,
                Identifier.of("rjmcmod", "juliets_flower"),
                new Item(new Item.Settings().maxCount(64))
        );

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(new ItemStack(JULIETS_FLOWER));
        });
    }
}
