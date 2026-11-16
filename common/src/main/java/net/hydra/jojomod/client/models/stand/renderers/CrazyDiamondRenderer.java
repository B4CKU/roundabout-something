package net.hydra.jojomod.client.models.stand.renderers;

import net.hydra.jojomod.client.models.layers.ModEntityRendererClient;
import net.hydra.jojomod.client.models.stand.CrazyDiamondModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class CrazyDiamondRenderer extends CrazyDiamondBaseRenderer {
    public CrazyDiamondRenderer(EntityRendererProvider.Context context) {
        super(context, new CrazyDiamondModel<>(context.bakeLayer(ModEntityRendererClient.CRAZY_DIAMOND_LAYER)), 0f);
    }
}
