package tfar.rerollenchants;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;

public class REDatagen {

    public static void gatherData(GatherDataEvent e) {
        DataGenerator generator = e.getGenerator();
        generator.addProvider(e.includeClient(),new RELangProvider(generator.getPackOutput()));
    }
}
