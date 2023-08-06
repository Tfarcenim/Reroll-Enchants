package tfar.rerollenchants;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class RELangProvider extends LanguageProvider {
    public RELangProvider(PackOutput output) {
        super(output, RerollEnchants.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("rerollenchants.tooltip","Reroll Enchants for 1 Lapis Lazuli");
    }
}
