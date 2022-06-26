package ezcoins.sleepinend;

import org.bukkit.plugin.java.JavaPlugin;

public final class SleepInEnd extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new SleepListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
