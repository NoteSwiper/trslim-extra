
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package git.noteswiper.trslimex.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import git.noteswiper.trslimex.TrslimexMod;

public class TrslimexModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TrslimexMod.MODID);
	public static final RegistryObject<CreativeModeTab> GENERAL_CREATIVE_TAB = REGISTRY.register("general_creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.trslimex.general_creative_tab")).icon(() -> new ItemStack(Items.CREEPER_HEAD)).displayItems((parameters, tabData) -> {
				tabData.accept(TrslimexModBlocks.SLIME_GRASS_BLOCK.get().asItem());
			}).withSearchBar().build());
}
