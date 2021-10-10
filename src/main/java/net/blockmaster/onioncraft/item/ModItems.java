package net.blockmaster.onioncraft.item;

import net.blockmaster.onioncraft.OnionCraft;
import net.blockmaster.onioncraft.materials.DraconiaMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item FIRE_DRACONIA_CRYSTAL = registerItem("fire_draconia_crystal",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final ToolItem INFERNO = new SwordItem(DraconiaMaterial.INSTANCE, 7, 2.6f, new FabricItemSettings().group(ItemGroup.COMBAT));

    private static Item registerItem(String name,Item item) {
        return Registry.register(Registry.ITEM, new Identifier(OnionCraft.Mod_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for "+ OnionCraft.Mod_ID);
    }

}
