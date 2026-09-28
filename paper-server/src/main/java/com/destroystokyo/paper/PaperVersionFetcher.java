package com.destroystokyo.paper;

import com.destroystokyo.paper.util.VersionFetcher;
import net.kyori.adventure.text.Component;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.framework.qual.DefaultQualifier;

import static net.kyori.adventure.text.Component.text;

@DefaultQualifier(NonNull.class)
public class PaperVersionFetcher implements VersionFetcher {
    @Override
    public long getCacheTime() {
        return 720000;
    }

    @Override
    public Component getVersionMessage() {
        return text("Automatic update checks are not configured for AstraSpigot.");
    }
}
