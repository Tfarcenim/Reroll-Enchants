package tfar.rerollenchants;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import tfar.rerollenchants.network.PacketHandler;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(RerollEnchants.MODID)
public class RerollEnchants {
    public static final String MODID = "rerollenchants";

    public RerollEnchants() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(REDatagen::gatherData);
    }

    private void setup(final FMLCommonSetupEvent event) {
        PacketHandler.registerMessages();
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        MinecraftForge.EVENT_BUS.addListener(REClient::guiOpen);
    }
}
