package tfar.rerollenchants;

import net.fabricmc.api.ModInitializer;
import tfar.rerollenchants.network.PacketHandler;

public class RerollEnchantsFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        
        // This method is invoked by the Fabric mod loader when it is ready
        // to load your mod. You can access Fabric and Common code in this
        // project.

        // Use Fabric to bootstrap the Common mod.
        PacketHandler.registerPackets();
        RerollEnchants.init();
    }
}
