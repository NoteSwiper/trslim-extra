
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package git.noteswiper.trslimex.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import git.noteswiper.trslimex.world.features.ores.SlimeGrassBlockFeature;
import git.noteswiper.trslimex.TrslimexMod;

@Mod.EventBusSubscriber
public class TrslimexModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, TrslimexMod.MODID);
	public static final RegistryObject<Feature<?>> SLIME_GRASS_BLOCK = REGISTRY.register("slime_grass_block", SlimeGrassBlockFeature::new);
}
