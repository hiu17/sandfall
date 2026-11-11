package hiu17.sandfall;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sandfall implements ModInitializer {
    public static final String MOD_ID = "sandfall";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Sandfall initialized: sand, red sand, and gravel will no longer fall.");
    }
}
