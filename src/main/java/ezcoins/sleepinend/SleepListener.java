package ezcoins.sleepinend;

import org.bukkit.Material;
import org.bukkit.Tag;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class SleepListener implements Listener {

    @EventHandler
    public final void Listener(PlayerInteractEvent event) {
        Block block = event.getClickedBlock();
        Player player = event.getPlayer();
        assert block != null;
        if(player.getWorld().getName().endsWith("_end")) {
            for(Material beds : Tag.BEDS.getValues()) {
                if(block.getType().equals(beds) && event.getAction().isRightClick()) {
                    player.setBedSpawnLocation(block.getLocation());
                    player.sendMessage("Respawn point set");
                    event.setCancelled(true);
                }
            }
        }
    }
}
