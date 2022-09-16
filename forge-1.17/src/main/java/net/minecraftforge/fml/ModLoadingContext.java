package net.minecraftforge.fml;

import java.lang.Record;
import java.util.function.Supplier;

public class ModLoadingContext {
    public static ModLoadingContext get() {
        return new ModLoadingContext();
    }

    public <T extends Record & IExtensionPoint<T>> void registerExtensionPoint(Class<? extends IExtensionPoint<T>> point, Supplier<T> extension) {
    }
}
