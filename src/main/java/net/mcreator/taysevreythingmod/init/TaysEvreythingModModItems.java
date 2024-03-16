
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

import net.mcreator.taysevreythingmod.item.SteelPlateItem;
import net.mcreator.taysevreythingmod.item.SteelIngotItem;
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

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
