package net.diana.mptmod.Item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab UNDERTALE_TAB = new CreativeModeTab("Undertale Tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.UNDERTALE.get());
        }
    };
}
