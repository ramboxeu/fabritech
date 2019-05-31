package eu.rambox.factorization;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Factorization implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("factorization");

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Factorization mod!");
    }
}
