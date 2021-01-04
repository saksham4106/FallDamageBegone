package com.saksham.nofalldamage;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = NoFallDamageMod.MOD_ID, bus = Bus.FORGE)
public class EntityHurtEvents {
	@SubscribeEvent
	public static void entityGetsHurt(LivingHurtEvent event) {
		if(event.getSource() == DamageSource.FALL) {
			if(!(event.getEntity() instanceof PlayerEntity)) {
				event.setCanceled(true);
			}
			
		}
		
	}
}
