package me.ultrusmods.spleaves.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;

public class SpleavesClientFabric implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        SpleavesClient.registerBlockRenderTypes(BlockRenderLayerMap.INSTANCE::putBlock);
    }
}
