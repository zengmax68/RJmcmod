package com.max.rjmcmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class RJmcmod implements ModInitializer {
    public static Item JULIETS_FLOWER;
    public static final String MOD_ID = "rjmcmod";

    @Override
    public void onInitialize() {
        // Create identifier and registry key up front
        Identifier id = Identifier.of(MOD_ID, "juliets_flower");
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);

        // Construct the item with its registry key set (prevents "Item id not set")
        JULIETS_FLOWER = new Item(
                new Item.Settings()
                        .registryKey(key)
                        .maxCount(64)
        );

        // Register using the same key
        Registry.register(Registries.ITEM, key, JULIETS_FLOWER);

        //Add to Creative
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(new ItemStack(JULIETS_FLOWER));
        });
    }
}
