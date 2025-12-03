package main.java.com.max.rjmcmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RJmcmod implements ModInitializer {
    // Juliet's Flower item
    public static final Item JULIETS_FLOWER = new Item(new Item.Settings().maxCount(64).group(ItemGroup.MISC));

    @Override
    public void onInitialize() {
        // Register the item
        Registry.register(Registries.ITEM, new Identifier("rjmcmod", "juliets_flower"), JULIETS_FLOWER);

        // Startup message
        System.out.println("RJmcmod hath enter'd the stage!");
    }
}
