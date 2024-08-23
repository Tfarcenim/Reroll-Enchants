package tfar.rerollenchants.network;

import net.minecraft.resources.ResourceLocation;
import tfar.rerollenchants.RerollEnchants;
import tfar.rerollenchants.network.server.C2SButtonPacket;
import tfar.rerollenchants.platform.Services;

import java.util.Locale;

public class PacketHandler {

    public static void registerPackets() {

        Services.PLATFORM.registerServerPacket(C2SButtonPacket.class, C2SButtonPacket::new);

    }

    public static ResourceLocation packet(Class<?> clazz) {
        return RerollEnchants.id(clazz.getName().toLowerCase(Locale.ROOT));
    }


}
