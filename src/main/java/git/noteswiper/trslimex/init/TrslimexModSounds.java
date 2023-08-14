
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package git.noteswiper.trslimex.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import git.noteswiper.trslimex.TrslimexMod;

public class TrslimexModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TrslimexMod.MODID);
	public static final RegistryObject<SoundEvent> SLIMEDZOMBIE_AMBIENT = REGISTRY.register("slimedzombie.ambient", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("trslimex", "slimedzombie.ambient")));
	public static final RegistryObject<SoundEvent> SLIMEDZOMBIE_HURT = REGISTRY.register("slimedzombie.hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("trslimex", "slimedzombie.hurt")));
	public static final RegistryObject<SoundEvent> SLIMEDZOMBIE_DEATH = REGISTRY.register("slimedzombie.death", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("trslimex", "slimedzombie.death")));
}
