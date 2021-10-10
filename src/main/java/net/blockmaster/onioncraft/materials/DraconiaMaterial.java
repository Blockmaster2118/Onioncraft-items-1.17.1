package net.blockmaster.onioncraft.materials;

import net.blockmaster.onioncraft.item.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class    DraconiaMaterial implements ToolMaterial {

    public static final DraconiaMaterial INSTANCE = new DraconiaMaterial();

    public int getDurability() {
        return 4063;
    }

    public float getMiningSpeedMultiplier() {
        return 12;
    }

    public float getAttackDamage() {
        return 7;
    }

    public int getMiningLevel() {
        return 4;
    }

    public int getEnchantability() {
        return 30;
    }

    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.FIRE_DRACONIA_CRYSTAL);
    }
}
