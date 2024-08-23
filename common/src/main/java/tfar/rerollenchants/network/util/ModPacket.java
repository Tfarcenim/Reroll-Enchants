package tfar.rerollenchants.network.util;

import net.minecraft.network.FriendlyByteBuf;

public interface ModPacket {
    void write(FriendlyByteBuf buf);
}
