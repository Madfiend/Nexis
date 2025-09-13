package net.amagitsyne.nexismod.item;

import net.amagitsyne.nexismod.NexisMod;
import net.amagitsyne.nexismod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NexisMod.MOD_ID);

    public static final Supplier<CreativeModeTab> Nexis = CREATIVE_MODE_TAB.register("nexis",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ENDERIUM_INGOT.get()))
                            .title(Component.translatable("Nexis"))
                    .displayItems((parameters, output) -> {

                        output.accept(ModBlocks.NETHERINE_ORE);
                        output.accept(ModBlocks.ENDERIUM_ORE);
                        output.accept(ModBlocks.ENDERIUM_DEEPSLATE_ORE);
                        output.accept(ModItems.RAW_ENDERIUM);
                        output.accept(ModBlocks.RAW_ENDERIUM_BLOCK);
                        output.accept(ModItems.NETHERINE);
                        output.accept(ModItems.ENDERIUM_INGOT);
                        output.accept(ModBlocks.NETHERINE_BLOCK);
                        output.accept(ModBlocks.ENDERIUM_BLOCK);

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
