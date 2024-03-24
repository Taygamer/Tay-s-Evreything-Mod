
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.taysevreythingmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.taysevreythingmod.item.SteelSwordItem;
import net.mcreator.taysevreythingmod.item.SteelShovelItem;
import net.mcreator.taysevreythingmod.item.SteelPlateItem;
import net.mcreator.taysevreythingmod.item.SteelPickaxeItem;
import net.mcreator.taysevreythingmod.item.SteelIngotItem;
import net.mcreator.taysevreythingmod.item.SteelHoeItem;
import net.mcreator.taysevreythingmod.item.SteelElectronicsItem;
import net.mcreator.taysevreythingmod.item.SteelAxeItem;
import net.mcreator.taysevreythingmod.item.SteelArmorItem;
import net.mcreator.taysevreythingmod.item.CompressedSteelPlateItem;
import net.mcreator.taysevreythingmod.item.CircuitItem;
import net.mcreator.taysevreythingmod.TaysEvreythingModMod;

public class TaysEvreythingModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TaysEvreythingModMod.MODID);
	public static final RegistryObject<Item> CIRCUIT = REGISTRY.register("circuit", () -> new CircuitItem());
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> STEEL_PLATE = REGISTRY.register("steel_plate", () -> new SteelPlateItem());
	public static final RegistryObject<Item> COMPRESSED_STEEL_PLATE = REGISTRY.register("compressed_steel_plate", () -> new CompressedSteelPlateItem());
	public static final RegistryObject<Item> STEEL_BLOCK = block(TaysEvreythingModModBlocks.STEEL_BLOCK);
	public static final RegistryObject<Item> STEEL_AXE = REGISTRY.register("steel_axe", () -> new SteelAxeItem());
	public static final RegistryObject<Item> STEEL_PICKAXE = REGISTRY.register("steel_pickaxe", () -> new SteelPickaxeItem());
	public static final RegistryObject<Item> STEEL_SWORD = REGISTRY.register("steel_sword", () -> new SteelSwordItem());
	public static final RegistryObject<Item> STEEL_SHOVEL = REGISTRY.register("steel_shovel", () -> new SteelShovelItem());
	public static final RegistryObject<Item> STEEL_HOE = REGISTRY.register("steel_hoe", () -> new SteelHoeItem());
	public static final RegistryObject<Item> STEEL_ARMOR_HELMET = REGISTRY.register("steel_armor_helmet", () -> new SteelArmorItem.Helmet());
	public static final RegistryObject<Item> STEEL_ARMOR_CHESTPLATE = REGISTRY.register("steel_armor_chestplate", () -> new SteelArmorItem.Chestplate());
	public static final RegistryObject<Item> STEEL_ARMOR_LEGGINGS = REGISTRY.register("steel_armor_leggings", () -> new SteelArmorItem.Leggings());
	public static final RegistryObject<Item> STEEL_ARMOR_BOOTS = REGISTRY.register("steel_armor_boots", () -> new SteelArmorItem.Boots());
	public static final RegistryObject<Item> STEEL_ELECTRONICS = REGISTRY.register("steel_electronics", () -> new SteelElectronicsItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
