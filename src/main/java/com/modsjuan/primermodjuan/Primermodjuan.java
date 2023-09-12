package com.modsjuan.primermodjuan;
import com.modsjuan.primermodjuan.init.Inititems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Primermodjuan.MODID)
public class Primermodjuan {
    public static final String MODID = "primermodjuan";

    public Primermodjuan(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        Inititems.ITEMS.register(bus);
    }
}