package net.hydra.jojomod.stand.powers;

import com.google.common.collect.Lists;
import net.hydra.jojomod.client.ClientNetworking;
import net.hydra.jojomod.entity.ModEntities;
import net.hydra.jojomod.entity.stand.CrazyDiamondEntity;
import net.hydra.jojomod.entity.stand.StandEntity;
import net.hydra.jojomod.event.powers.StandPowers;
import net.hydra.jojomod.event.powers.StandUser;
import net.hydra.jojomod.stand.powers.presets.BlockGrabPreset;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;

import java.util.List;

public class PowersCrazyDiamond extends BlockGrabPreset {
    public PowersCrazyDiamond(LivingEntity self) {super(self);}

    @Override
    public StandPowers generateStandPowers(LivingEntity entity) {return new PowersCrazyDiamond(entity);}

    @Override
    public boolean isStandEnabled(){return true;}

    // skins and entity start

    @Override
    public Component getSkinName(byte skinId) {
        switch (skinId) {
            default -> {
                return Component.translatable("skins.roundabout.diver_down.base");
            }
        }
    }

    @Override
    public List<Byte> getSkinList() {
        List<Byte> l = Lists.newArrayList();
        l.add(CrazyDiamondEntity.PART_4);
        /*if (this.getSelf() instanceof Player PE) {
            byte Level = ((IPlayerEntity) PE).roundabout$getStandLevel();
            ItemStack goldDisc = ((StandUser) PE).roundabout$getStandDisc();
            boolean bypass = PE.isCreative() || (!goldDisc.isEmpty() && goldDisc.getItem() instanceof MaxStandDiscItem);
            if (Level > 1 || bypass) {
            }
            if (Level > 2 || bypass) {
            }
            if (Level > 3 || bypass) {
            }
            if (Level > 4 || bypass) {
            }
            if (Level > 5 || bypass) {
            }
            if (Level > 6 || bypass) {
            }
            if (((IPlayerEntity) PE).roundabout$getUnlockedBonusSkin() || bypass) {
            }
        }*/

        return l;
    }

    @Override
    public StandEntity getNewStandEntity() {
        byte skin = ((StandUser) this.getSelf()).roundabout$getStandSkin();
        return ModEntities.CRAZY_DIAMOND.create(this.getSelf().level());
    }

    // skins and entity end

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
