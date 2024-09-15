package wtf.pathos.nme;

import org.bukkit.plugin.java.JavaPlugin;
import wtf.pathos.nme.listener.ElytraListener;
import wtf.pathos.nme.manager.ElytraManager;

public final class NoElytrasPlugin extends JavaPlugin {
    private ElytraManager elytraManager;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        elytraManager = new ElytraManager(this);
        getServer().getPluginManager().registerEvents(new ElytraListener(elytraManager, this), this);
    }

    public boolean isMessageEnabled() {
        return getConfig().getBoolean("disable-message", true);
    }

    public String getDisableMessage() {
        return getConfig().getString("disable-message", "Elytra use is disabled on this server.");
    }
}
