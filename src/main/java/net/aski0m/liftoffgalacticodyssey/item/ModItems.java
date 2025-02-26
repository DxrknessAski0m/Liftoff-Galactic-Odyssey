package net.aski0m.liftoffgalacticodyssey.item;

import net.aski0m.liftoffgalacticodyssey.GalacticOdyssey;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GalacticOdyssey.MOD_ID);

    public static final DeferredItem<Item> SCREAMERTOOTH = ITEMS.register("screamertooth",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SCREAMER_FLESH = ITEMS.register("screamer_flesh",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SCREAMER_TOOTH_SPEAR = ITEMS.register("screamer_tooth_spear",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
