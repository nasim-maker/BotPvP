package com.example.examplemod.bot;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.level.Level;

public class TrainingBotEntity extends PathfinderMob {

    private final TrainingBot bot = new TrainingBot();

    public TrainingBotEntity(EntityType<? extends PathfinderMob> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
    }

    public TrainingBot getBot() {
        return bot;
    }
}
