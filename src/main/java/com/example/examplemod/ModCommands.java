package com.example.examplemod;

import com.example.examplemod.bot.TrainingBotEntity;
import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.RegisterCommandsEvent;

@EventBusSubscriber(modid = ExampleMod.MODID)
public class ModCommands {

    @SubscribeEvent
    public static void registerCommands(RegisterCommandsEvent event) {
        CommandDispatcher<CommandSourceStack> dispatcher = event.getDispatcher();

        dispatcher.register(
                Commands.literal("spawnbot")
                        .executes(context -> {

                            ServerPlayer player = context.getSource().getPlayerOrException();
                            ServerLevel level = player.serverLevel();

                            TrainingBotEntity bot =
                                    ModEntities.TRAINING_BOT.get().create(level);

                            if (bot != null) {
                                bot.moveTo(
                                        player.getX() + 2,
                                        player.getY(),
                                        player.getZ(),
                                        player.getYRot(),
                                        0
                                );

                                level.addFreshEntity(bot);

                                context.getSource().sendSuccess(
                                        () -> Component.literal("TrainingBot Spawned!"),
                                        false
                                );
                            }

                            return 1;
                        })
        );
    }
}
