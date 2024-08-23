package tfar.rerollenchants;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.EnchantmentScreen;
import net.neoforged.neoforge.client.event.ScreenEvent;
import tfar.rerollenchants.client.ModClient;

public class REClient {
    public static void guiOpen(ScreenEvent.Init.Post e) {
        Screen screen = e.getScreen();
        if (screen instanceof EnchantmentScreen enchantmentScreen) {
            e.addListener(ModClient.BUTTON_FUNCTION.apply(enchantmentScreen));
        }
    }

}
