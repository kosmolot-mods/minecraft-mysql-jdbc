package net.minecraftforge.fml.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Fake Forge Mod annotation class capable of targeting both
 * old-style 1.12 loader and new-style 1.13 loader. This puppy
 * both saves us the PAIN of loading the entire Forge toolchain
 * (and hours of waiting) and the PAIN of Forge doing its bad
 * heuristics to block the mod from being universal.
 *
 * Of course, the entire net package is later excluded from
 * build on the jar stage.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Mod {
    String modid();
    String value();
}
