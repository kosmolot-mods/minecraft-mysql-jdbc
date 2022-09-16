package pl.kosma.mysql_jdbc;

import java.lang.Record;
import net.minecraftforge.fml.IExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fmllegacy.network.FMLNetworkConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ForgeSetup117 {
    private static final Logger LOGGER = LogManager.getLogger(ForgeSetup117.class.getName());

    public ForgeSetup117() {
        // Prevent "incompatible mod list" errors.
        // This will work in 1.17.1 and above.
        LOGGER.info("Trying to configure DisplayTest...");
        ModLoadingContext.get().registerExtensionPoint(IExtensionPoint.DisplayTest.class,
            () -> new IExtensionPoint.DisplayTest(() -> FMLNetworkConstants.IGNORESERVERONLY, (incoming, isNetwork) -> true));
        LOGGER.info("Successfully configured DisplayTest.");
    }
}
