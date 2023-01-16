package me.kevind;
import org.bukkit.plugin.java.JavaPlugin;

public class KevinUtils extends JavaPlugin {
    private static KevinUtils instance;
    public static KevinUtils getInstance() {
        return instance;
    }
    @Override
    public void onEnable() {
        instance = this;
    }
    public void onDisable() {

    }
}
