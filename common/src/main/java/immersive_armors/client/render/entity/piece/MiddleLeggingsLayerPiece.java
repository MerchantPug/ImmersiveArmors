package immersive_armors.client.render.entity.piece;

import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.LivingEntity;

public class MiddleLeggingsLayerPiece extends LayerPiece {
    private static final BipedEntityModel<LivingEntity> model = new BipedEntityModel<>(1.0f);

    public MiddleLeggingsLayerPiece() {
        texture("layer_2_middle");
    }

    @Override
    protected BipedEntityModel<LivingEntity> getModel() {
        return model;
    }
}