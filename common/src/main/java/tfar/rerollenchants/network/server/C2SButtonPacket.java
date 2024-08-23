package tfar.rerollenchants.network.server;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.EnchantmentMenu;
import net.minecraft.world.item.ItemStack;
import tfar.rerollenchants.network.util.C2SModPacket;
import tfar.rerollenchants.platform.Services;


public class C2SButtonPacket implements C2SModPacket {


    public C2SButtonPacket() {
    }

    public C2SButtonPacket(FriendlyByteBuf buf) {
    }

    public static void send() {
        Services.PLATFORM.sendToServer(new C2SButtonPacket());
    }

    public static int cost = 1;

    public void handleServer(ServerPlayer player) {
        AbstractContainerMenu container = player.containerMenu;
        if (container instanceof EnchantmentMenu enchantmentMenu) {
            boolean creative = player.getAbilities().instabuild;
            boolean hasLapis = creative || !enchantmentMenu.enchantSlots.getItem(1).isEmpty();
            if (!enchantmentMenu.enchantSlots.getItem(0).isEmpty() && hasLapis) {
                //player.onEnchantmentPerformed(ItemStack.EMPTY,0);
                 player.enchantmentSeed = player.getRandom().nextInt();
                enchantmentMenu.enchantmentSeed.set(player.getEnchantmentSeed());
                if (!creative) {
                    enchantmentMenu.enchantSlots.removeItem(1, cost);
                } else {
                    enchantmentMenu.slotsChanged(enchantmentMenu.enchantSlots);//need to sync any changes
                }
            }
        }
    }

    public void write(FriendlyByteBuf buf) {
    }
}
