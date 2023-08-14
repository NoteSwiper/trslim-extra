
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package git.noteswiper.trslimex.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import git.noteswiper.trslimex.client.model.Modelzombie;
import git.noteswiper.trslimex.client.model.ModelslimeEntity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TrslimexModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelzombie.LAYER_LOCATION, Modelzombie::createBodyLayer);
		event.registerLayerDefinition(ModelslimeEntity.LAYER_LOCATION, ModelslimeEntity::createBodyLayer);
	}
}
