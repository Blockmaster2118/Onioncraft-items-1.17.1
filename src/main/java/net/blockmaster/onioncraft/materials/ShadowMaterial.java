package net.blockmaster.onioncraft.materials;

import net.blockmaster.onioncraft.item.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ShadowMaterial implements ToolMaterial {

    public static final ShadowMaterial INSTANCE = new ShadowMaterial();

    public int getDurability() {
        return 2032;
    }

    public float getMiningSpeedMultiplier() {
        return 10;
    }

    public float getAttackDamage() {
        return 5;
    }

    public int getMiningLevel() {
        return 4;
    }

    public int getEnchantability() {
        return 22;
    }

    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.SHADOW_ESSENCE);
    }
}