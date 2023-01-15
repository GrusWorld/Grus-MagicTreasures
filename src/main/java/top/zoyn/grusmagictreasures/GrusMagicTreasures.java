package top.zoyn.grusmagictreasures;

import org.bukkit.plugin.java.JavaPlugin;

public final class GrusMagicTreasures extends JavaPlugin {

    private static GrusMagicTreasures instance;

    @Override
    public void onEnable() {
        instance = this;

        // 本地数据
        saveDefaultConfig();
    }
}
