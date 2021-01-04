package com.saksham.nofalldamage;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;


@Mod("nofalldamage")
public class NoFallDamageMod
{
	
	public static final String MOD_ID = "nofalldamage";
    public NoFallDamageMod() {
        MinecraftForge.EVENT_BUS.register(this);
    }

  
}
