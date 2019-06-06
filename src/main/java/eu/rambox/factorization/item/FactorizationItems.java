package eu.rambox.factorization.item;

import eu.rambox.factorization.Factorization;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashSet;

public class FactorizationItems {
    public static final HashSet<FactorizationItem> ITEMS = new HashSet<>();

    public static final FactorizationItem RHODIUM_INGOT = new RhodiumIngotItem();

    public static void register(){
        Factorization.LOGGER.info("Registering {} items", ITEMS.size());

        for (FactorizationItem item : ITEMS){
            Registry.register(Registry.ITEM, new Identifier(Factorization.MOD_ID, item.getItemName()), item);
        }
    }
}
