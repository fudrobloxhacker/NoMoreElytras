package wtf.pathos.noElytras.manager;

import org.bukkit.entity.Player;
import wtf.pathos.noElytras.NoElytrasPlugin;

public class ElytraManager {
    private final NoElytrasPlugin plugin;

    public ElytraManager(NoElytrasPlugin plugin) {
        this.plugin = plugin;
    }

    public void disableElytra(Player player) {
        if (player.isGliding()) {
            player.setGliding(false);
            player.sendMessage(plugin.getDisableMessage());
        }
    }
}
