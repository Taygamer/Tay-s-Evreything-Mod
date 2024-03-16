
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.taysevreythingmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.taysevreythingmod.block.SteelBlockBlock;
import net.mcreator.taysevreythingmod.TaysEvreythingModMod;

public class TaysEvreythingModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TaysEvreythingModMod.MODID);
	public static final RegistryObject<Block> STEEL_BLOCK = REGISTRY.register("steel_block", () -> new SteelBlockBlock());
}
