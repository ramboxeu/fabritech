package eu.rambox.factorization.item;

import net.minecraft.item.Item;

public abstract class FactorizationItem extends Item {
    public FactorizationItem(Settings settings) {
        super(settings);
    }

    public abstract String getItemName();
}
