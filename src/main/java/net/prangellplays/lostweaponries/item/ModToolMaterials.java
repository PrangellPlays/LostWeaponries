package net.prangellplays.lostweaponries.item;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;
import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    Plasmythic(5, -1, 10.0F, 15.0F, 15, () -> Ingredient.ofItems(new ItemConvertible[]{ModItems.PLASMYTHIC_CRYSTAL})),
    Potato(5, -1, 10.0F, 15.0F, 15, () -> Ingredient.ofItems(new ItemConvertible[]{ModItems.POTATO_INGOT})),
    Frostfire(5, -1, 10.0F, 15.0F, 15, () -> Ingredient.ofItems(new ItemConvertible[]{ModItems.FROSTFIRE_INGOT})),
    Assasinite(5, -1, 10.0F, 15.0F, 15, () -> Ingredient.ofItems(new ItemConvertible[]{ModItems.ASSASINITE_INGOT}));
        private final int miningLevel;
        private final int itemDurability;
        private final float miningSpeed;
        private final float attackDamage;
        private final int enchantability;
        private final Lazy<Ingredient> repairIngredient;

        private ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier repairIngredient) {
            this.miningLevel = miningLevel;
            this.itemDurability = itemDurability;
            this.miningSpeed = miningSpeed;
            this.attackDamage = attackDamage;
            this.enchantability = enchantability;
            this.repairIngredient = new Lazy(repairIngredient);
        }

        public int getDurability() {
            return this.itemDurability;
        }

        public float getMiningSpeedMultiplier() {
            return this.miningSpeed;
        }

        public float getAttackDamage() {
            return this.attackDamage;
        }

        public int getMiningLevel() {
            return this.miningLevel;
        }

        public int getEnchantability() {
            return this.enchantability;
        }

        public Ingredient getRepairIngredient() {
            return (Ingredient)this.repairIngredient.get();
        }
    }


