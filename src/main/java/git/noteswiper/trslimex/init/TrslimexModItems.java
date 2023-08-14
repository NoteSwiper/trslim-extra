
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package git.noteswiper.trslimex.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import git.noteswiper.trslimex.TrslimexMod;

public class TrslimexModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TrslimexMod.MODID);
	public static final RegistryObject<Item> SLIME_GRASS_BLOCK = block(TrslimexModBlocks.SLIME_GRASS_BLOCK);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
