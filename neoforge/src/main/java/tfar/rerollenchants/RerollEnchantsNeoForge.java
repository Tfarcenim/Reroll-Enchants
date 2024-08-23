package tfar.rerollenchants;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(RerollEnchants.MOD_ID)
public class RerollEnchantsNeoForge {
    public RerollEnchantsNeoForge(IEventBus bus) {
        bus.addListener(this::setup);
        bus.addListener(this::clientSetup);
        bus.addListener(REDatagen::gatherData);
        bus.addListener(PacketHandlerNeoForge::register);
        RerollEnchants.init();
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        NeoForge.EVENT_BUS.addListener(REClient::guiOpen);
    }
}
