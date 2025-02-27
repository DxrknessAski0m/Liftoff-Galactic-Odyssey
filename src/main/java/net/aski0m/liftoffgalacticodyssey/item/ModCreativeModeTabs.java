package net.aski0m.liftoffgalacticodyssey.item;

import net.aski0m.liftoffgalacticodyssey.GalacticOdyssey;
import net.aski0m.liftoffgalacticodyssey.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GalacticOdyssey.MOD_ID);

    public static final Supplier<CreativeModeTab> GALACTIC_ODYSSEY_TAB = CREATIVE_MODE_TAB.register("galactic_odyssey_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SCREAMER_FLESH.get()))
                    .title(Component.translatable("creativetab.liftoffgalacticodyssey.galacticodyssey"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.SCREAMERTOOTH);
                        output.accept(ModItems.SCREAMER_FLESH);
                        output.accept(ModItems.SCREAMER_TOOTH_SPEAR);
                        output.accept(ModItems.SCREAMER_TOOTH_NECKLACE);
                        output.accept(ModBlocks.BLOCK_OF_SCREAMER_SCALE);
                    }).build());

    public static final Supplier<CreativeModeTab> GALACTIC_ODYSSEY_MOB_TAB = CREATIVE_MODE_TAB.register("galactic_odyssey_mob_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SCREAMER_FLESH.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(GalacticOdyssey.MOD_ID, "galactic_odyssey_tab"))
                    .title(Component.translatable("creativetab.liftoffgalacticodyssey.galacticodyssey.mobs"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.BLOCK_OF_SCREAMER_SCALE);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
