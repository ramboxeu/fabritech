package eu.rambox.factorization;

        import eu.rambox.factorization.block.FactorizationBlocks;
        import net.fabricmc.api.ModInitializer;
        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;

public class Factorization implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("factorization");

    public static final String MOD_ID = "factorization";

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Factorization mod!");

        // Register mod's blocks and ores
        FactorizationBlocks.register();
        FactorizationBlocks.addOres();
    }
}
