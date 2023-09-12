package com.modsjuan.primermodjuan.init;

import com.modsjuan.primermodjuan.Primermodjuan;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ThrowablePotionItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Inititems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, Primermodjuan.MODID
    );

    public static final RegistryObject<Item> POKEBOLA = ITEMS.register(
            "pokebola", () -> new ThrowablePotionItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC).fireResistant())
    );



}
