package org.lod.etc;

import net.fabricmc.api.ModInitializer;

public class Lod implements ModInitializer {
    public static int i = 0;
    @Override
    public void onInitialize() {
        Led.EVENT.register(new Led());
    }
}
