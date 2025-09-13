package net.amagitsyne.nexismod.item;

import net.amagitsyne.nexismod.NexisMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NexisMod.MOD_ID);

    public static final DeferredItem<Item> ENDERIUM_INGOT = ITEMS.registerItem("enderium_ingot",
            Item::new, new Item.Properties());
    public static final DeferredItem<Item> RAW_ENDERIUM = ITEMS.registerItem("raw_enderium",
            Item::new, new Item.Properties());
        public static final DeferredItem<Item> NETHERINE = ITEMS.registerItem("netherine",
            Item::new, new Item.Properties());


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
