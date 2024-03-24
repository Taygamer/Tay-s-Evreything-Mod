
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.taysevreythingmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.taysevreythingmod.TaysEvreythingModMod;

public class TaysEvreythingModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TaysEvreythingModMod.MODID);
	public static final RegistryObject<CreativeModeTab> TAYS_EVREYTHING_MOD_CREATIVE_TAB = REGISTRY.register("tays_evreything_mod_creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.tays_evreything_mod.tays_evreything_mod_creative_tab")).icon(() -> new ItemStack(Blocks.AIR)).displayItems((parameters, tabData) -> {
				tabData.accept(TaysEvreythingModModItems.CIRCUIT.get());
				tabData.accept(TaysEvreythingModModItems.STEEL_INGOT.get());
				tabData.accept(TaysEvreythingModModItems.STEEL_PLATE.get());
				tabData.accept(TaysEvreythingModModItems.COMPRESSED_STEEL_PLATE.get());
				tabData.accept(TaysEvreythingModModBlocks.STEEL_BLOCK.get().asItem());
				tabData.accept(TaysEvreythingModModItems.STEEL_AXE.get());
				tabData.accept(TaysEvreythingModModItems.STEEL_PICKAXE.get());
				tabData.accept(TaysEvreythingModModItems.STEEL_SWORD.get());
				tabData.accept(TaysEvreythingModModItems.STEEL_SHOVEL.get());
				tabData.accept(TaysEvreythingModModItems.STEEL_HOE.get());
				tabData.accept(TaysEvreythingModModItems.STEEL_ARMOR_HELMET.get());
				tabData.accept(TaysEvreythingModModItems.STEEL_ARMOR_CHESTPLATE.get());
				tabData.accept(TaysEvreythingModModItems.STEEL_ARMOR_LEGGINGS.get());
				tabData.accept(TaysEvreythingModModItems.STEEL_ARMOR_BOOTS.get());
				tabData.accept(TaysEvreythingModModItems.STEEL_ELECTRONICS.get());
			})

					.build());
}
