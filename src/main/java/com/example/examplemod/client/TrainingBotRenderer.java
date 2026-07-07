package com.example.examplemod.client;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.bot.TrainingBotEntity;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.resources.ResourceLocation;

public class TrainingBotRenderer extends HumanoidMobRenderer<TrainingBotEntity, PlayerModel<TrainingBotEntity>> {

    public TrainingBotRenderer(EntityRendererProvider.Context context) {
        super(
                context,
                new PlayerModel<>(context.bakeLayer(ModelLayers.PLAYER), false),
                0.5F
        );
    }

    @Override
    public ResourceLocation getTextureLocation(TrainingBotEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(
                ExampleMod.MODID,
                "textures/entity/training_bot.png"
        );
    }
}
