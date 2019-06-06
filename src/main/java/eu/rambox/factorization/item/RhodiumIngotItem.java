package eu.rambox.factorization.item;

import eu.rambox.factorization.Factorization;

public class RhodiumIngotItem extends FactorizationItem {
    public RhodiumIngotItem() {
        super(new Settings().maxCount(64).group(Factorization.ITEM_GROUP));
        FactorizationItems.ITEMS.add(this);
    }

    @Override
    public String getItemName() {
        return "rhodium_ingot";
    }
}
