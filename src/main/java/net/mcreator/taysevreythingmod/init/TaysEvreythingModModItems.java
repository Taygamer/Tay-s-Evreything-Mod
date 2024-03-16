
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.taysevreythingmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.taysevreythingmod.item.CircuitItem;
import net.mcreator.taysevreythingmod.TaysEvreythingModMod;

public class TaysEvreythingModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TaysEvreythingModMod.MODID);
	public static final RegistryObject<Item> CIRCUIT = REGISTRY.register("circuit", () -> new CircuitItem());
}
