package tfar.rerollenchants.network.server;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.EnchantmentMenu;
import net.minecraft.world.item.ItemStack;
import tfar.rerollenchants.network.PacketHandler;
import tfar.rerollenchants.network.util.C2SPacketHelper;


public class C2SButtonPacket implements C2SPacketHelper {


    public C2SButtonPacket() {
    }

    public C2SButtonPacket(FriendlyByteBuf buf) {
    }

    public static void send() {
        PacketHandler.sendToServer(new C2SButtonPacket());
    }

    public static int cost = 1;

    public void handleServer(ServerPlayer player) {
        AbstractContainerMenu container = player.containerMenu;
        if (container instanceof EnchantmentMenu enchantmentMenu) {
            if (!enchantmentMenu.enchantSlots.getItem(0).isEmpty() && !enchantmentMenu.enchantSlots.getItem(1).isEmpty()) {
                player.onEnchantmentPerformed(ItemStack.EMPTY, 0);
                enchantmentMenu.enchantmentSeed.set(player.getEnchantmentSeed());
                enchantmentMenu.enchantSlots.removeItem(1, cost);
            }
        }
    }

    public void encode(FriendlyByteBuf buf) {
    }
}
