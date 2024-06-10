package net.diana.mptmod.block;

import net.diana.mptmod.Item.ModCreativeModeTab;
import net.diana.mptmod.Item.ModItems;
import net.diana.mptmod.Mptmod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Mptmod.MOD_ID);

    public static <T extends Block>RegistryObject<T> registryBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturns = BLOCKS.register(name, block);
        registryBlockItem(name, toReturns, tab);
        return toReturns;
    }
    public  static <T extends Block>RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

    public static final RegistryObject<Block> GOLDEN_FLOWERS = registryBlock("golden_flowers",
                () -> new LeavesBlock(BlockBehaviour.Properties.
                        of(Material.LEAVES)
                        .strength(3f)
                        .lightLevel(value -> 15)
                        .requiresCorrectToolForDrops()), ModCreativeModeTab.UNDERTALE_TAB);
    public static final RegistryObject<Block> ECHO_FLOWERS = registryBlock("echo_flowers",
            () -> new Block(BlockBehaviour.Properties
                    .of(Material.LEAVES)
                    .lightLevel(value -> 10)
                    .strength(3f).
                    requiresCorrectToolForDrops()), ModCreativeModeTab.UNDERTALE_TAB);
    public static final RegistryObject<CarpetBlock> ECHO_FLOWERS_CARPET = registryBlock("echo_flowers_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES)
                    .lightLevel(value -> 8)
                    .strength(3f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.UNDERTALE_TAB);
    public static final RegistryObject<Block> LAMP = registryBlock("lamp",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND)
                    .strength(3f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.UNDERTALE_TAB);
}
