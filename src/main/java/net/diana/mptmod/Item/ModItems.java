package net.diana.mptmod.Item;

import net.diana.mptmod.Mptmod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Mptmod.MOD_ID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
    public  static final RegistryObject<Item> UNDERTALE = ITEMS.register("undertale",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.UNDERTALE_TAB)));
    public  static final RegistryObject<Item> OLD_TUTU = ITEMS.register("old_tutu",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.UNDERTALE_TAB)));
    public  static final RegistryObject<Item> FADED_RIBBON = ITEMS.register("faded_ribbon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.UNDERTALE_TAB)));
    public  static final RegistryObject<Item> SPIDER_DONUT = ITEMS.register("spider_donut",
            () -> new Item(new Item.Properties().food((new  FoodProperties.Builder())
                    .nutrition(5)
                    .saturationMod(0.5f)
                    .build()).tab(ModCreativeModeTab.UNDERTALE_TAB)));
    public  static final RegistryObject<Item> BUTTERSCOTCH_PIE = ITEMS.register("butterscotch_pie",
            () -> new Item(new Item.Properties().food((new FoodProperties.Builder())
                    .nutrition(10)
                    .saturationMod(0.5f)
                    .build()).tab(ModCreativeModeTab.UNDERTALE_TAB)));
}
