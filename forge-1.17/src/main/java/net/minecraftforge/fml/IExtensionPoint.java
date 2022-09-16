package net.minecraftforge.fml;

import java.lang.Record;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

@SuppressWarnings("all")
public interface IExtensionPoint<T extends Record> {
    /* Can't suppress this error in IDEA */
    class DisplayTest extends Record implements IExtensionPoint<DisplayTest> {
        public DisplayTest(Supplier<String> suppliedVersion, BiPredicate<String, Boolean> remoteVersionTest) {
        }
    }
}
