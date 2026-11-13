package net.hydra.jojomod.stand.powers;

import net.hydra.jojomod.client.ClientNetworking;
import net.hydra.jojomod.event.powers.StandPowers;
import net.hydra.jojomod.stand.powers.presets.BlockGrabPreset;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;

public class PowersCrazyDiamond extends BlockGrabPreset {
    public PowersCrazyDiamond(LivingEntity self) {super(self);}

    @Override
    public StandPowers generateStandPowers(LivingEntity entity) {return new PowersCrazyDiamond(entity);}

    @Override
    public boolean isStandEnabled(){return true;}



    @Override
    public boolean isWip() {
        return true;
    }

    @Override
    public Component ifWipListDevStatus() {
        return Component.translatable("roundabout.dev_status.active").withStyle(ChatFormatting.AQUA);
    }

    @Override
    public Component ifWipListDev() {
        return Component.literal("b4cku").withStyle(ChatFormatting.GOLD);
    }
}
