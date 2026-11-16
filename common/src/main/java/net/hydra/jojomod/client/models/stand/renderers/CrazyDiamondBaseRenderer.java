package net.hydra.jojomod.client.models.stand.renderers;

import com.mojang.blaze3d.vertex.PoseStack;
import net.hydra.jojomod.Roundabout;
import net.hydra.jojomod.client.models.stand.StandModel;
import net.hydra.jojomod.entity.stand.CrazyDiamondEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;

public class CrazyDiamondBaseRenderer extends StandRenderer<CrazyDiamondEntity> {
    public static final ResourceLocation PART_4 = new ResourceLocation(Roundabout.MOD_ID, "textures/stand/gold_experience/base.png");
    //public static final ResourceLocation BETA = new ResourceLocation(Roundabout.MOD_ID, "textures/stand/gold_experience/beta.png");

    public CrazyDiamondBaseRenderer(EntityRendererProvider.Context context, StandModel<CrazyDiamondEntity> entityModel, float f) {
        super(context, entityModel, f);
        //this.addLayer(new GoldExperienceLifePunchLayer(this));
    }

    public static ResourceLocation getSkin(byte bt) {
        /*if (bt == CrazyDiamondEntity.BETA) {
            return BETA;
        }*/
        return PART_4;
    }

    @Override
    public void render(CrazyDiamondEntity mobEntity, float f, float g, PoseStack matrixStack, MultiBufferSource vertexConsumerProvider, int i) {
        float factor = 0.5F + (mobEntity.getSizePercent()/2);
        if(mobEntity.isBaby()){
            matrixStack.scale(0.50f * factor, 0.50f * factor, 0.50f * factor);
        } else {
            matrixStack.scale(0.87f * factor, 0.87f * factor, 0.87f * factor);
        }
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Nullable
    @Override
    protected RenderType getRenderType(CrazyDiamondEntity entity, boolean showBody, boolean translucent, boolean showOutline) {
        return super.getRenderType(entity, showBody, true, showOutline);
    }

    @Override
    public ResourceLocation getTextureLocation(CrazyDiamondEntity entity) {
        return getSkin(entity.getSkin());
    }
}