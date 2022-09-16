package pl.kosma.mysql_jdbc;

import net.minecraftforge.fml.ExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.network.FMLNetworkConstants;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ForgeSetup113 {
    private static final Logger LOGGER = LogManager.getLogger(ForgeSetup113.class.getName());

    public ForgeSetup113() {
        // Prevent "incompatible mod list" errors.
        // This will work in 1.13.2 to 1.16.5.
        LOGGER.info("Trying to configure DisplayTest...");
        ModLoadingContext.get().registerExtensionPoint(ExtensionPoint.DISPLAYTEST,
                () -> Pair.of(() -> FMLNetworkConstants.IGNORESERVERONLY, (incoming, isNetwork) -> true));
        LOGGER.info("Successfully configured DisplayTest.");
    }

}
