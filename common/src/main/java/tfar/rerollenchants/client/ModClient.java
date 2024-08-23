package tfar.rerollenchants.client;

import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.Tooltip;
import net.minecraft.client.gui.screens.inventory.EnchantmentScreen;
import net.minecraft.network.chat.Component;
import tfar.rerollenchants.RerollEnchants;
import tfar.rerollenchants.network.server.C2SButtonPacket;

import java.util.function.Function;

public class ModClient {
    public static final Function<EnchantmentScreen, Button> BUTTON_FUNCTION = enchantmentScreen -> Button.builder(Component.literal("R"), pButton -> C2SButtonPacket.send())
            .pos(enchantmentScreen.leftPos+5,enchantmentScreen.topPos+20).size(14,14)
            .tooltip(Tooltip.create(Component.translatable(RerollEnchants.MOD_ID + ".tooltip"))).build();
}
