package wtf.pathos.noElytras.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityToggleGlideEvent;
import wtf.pathos.noElytras.NoElytrasPlugin;
import wtf.pathos.noElytras.manager.ElytraManager;

public class ElytraListener implements Listener {
    private final ElytraManager elytraManager;
    private final NoElytrasPlugin plugin;

    public ElytraListener(ElytraManager elytraManager, NoElytrasPlugin plugin) {
        this.elytraManager = elytraManager;
        this.plugin = plugin;
    }

    @EventHandler
    public void onGlide(EntityToggleGlideEvent event) {
        if (plugin.isMessageEnabled()) {
            if (event.getEntity() instanceof Player) {
                elytraManager.disableElytra((((Player) event.getEntity())));
            }
        }
    }
}
