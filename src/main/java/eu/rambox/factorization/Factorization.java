package eu.rambox.factorization;

import eu.rambox.factorization.block.FactorizationBlocks;
import eu.rambox.factorization.item.FactorizationItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Factorization implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("factorization");

    public static final String MOD_ID = "factorization";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier(MOD_ID, "item_group")).icon(() -> new ItemStack(FactorizationBlocks.RHODIUM_ORE)).build();

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Factorization mod!");

        // Register mod's blocks and ores
        FactorizationBlocks.register();
        FactorizationBlocks.addOres();

        //Register mod's items
        FactorizationItems.register();
    }
}
