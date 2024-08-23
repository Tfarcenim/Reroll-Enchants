package tfar.rerollenchants.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.fabric.api.client.screen.v1.Screens;
import net.minecraft.client.gui.screens.inventory.EnchantmentScreen;

public class ModClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenEvents.AFTER_INIT.register((client, screen, scaledWidth, scaledHeight) -> {
            if (screen instanceof EnchantmentScreen enchantmentScreen) {
                Screens.getButtons(enchantmentScreen).add(ModClient.BUTTON_FUNCTION.apply(enchantmentScreen));
            }
        });
    }
}
