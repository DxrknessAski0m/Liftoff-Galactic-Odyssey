package net.aski0m.liftoffgalacticodyssey.item;

import net.aski0m.liftoffgalacticodyssey.GalacticOdyssey;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GalacticOdyssey.MOD_ID);

    public static final DeferredItem<Item> SCREAMERTOOTH = ITEMS.register("screamertooth",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SCREAMER_FLESH = ITEMS.register("screamer_flesh",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SCREAMER_FLESH)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.liftoffgalacticodyssey.screamer_flesh"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> SCREAMER_TOOTH_SPEAR = ITEMS.register("screamer_tooth_spear",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SCREAMER_TOOTH_NECKLACE = ITEMS.register("screamer_tooth_necklace",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
