package net.blockmaster.onioncraft.item;

import net.blockmaster.onioncraft.OnionCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item DRACONIA_CRYSTAL = registerItem("draconia_crystal",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name,Item item) {
        return Registry.register(Registry.ITEM, new Identifier(OnionCraft.Mod_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for "+ OnionCraft.Mod_ID);
    }

}
