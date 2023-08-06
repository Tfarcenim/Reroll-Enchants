package tfar.rerollenchants.network.util;

import net.minecraft.network.FriendlyByteBuf;

public interface PacketHelper {
    void encode(FriendlyByteBuf buf);
}
