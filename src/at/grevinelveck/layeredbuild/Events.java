package at.grevinelveck.layeredbuild;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class Events implements Listener {

	@EventHandler
	public void breakDeath(BlockBreakEvent event) {

		final Player player = event.getPlayer();
		if (!player.isOp()) {
			if (event.getBlock().getLocation().getY() <= 20) {
				if (!player.hasPermission("LayeredBuild.20")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(
							"It is to dark for you to mine here.");
				}
			}
			if (event.getBlock().getLocation().getY() > 20
					&& event.getBlock().getLocation().getY() <= 40) {
				if (!player.hasPermission("LayeredBuild.40")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(
							"It is to dark for you to mine here.");
				}
			}
			if (event.getBlock().getLocation().getY() > 40
					&& event.getBlock().getLocation().getY() <= 60) {
				if (!player.hasPermission("LayeredBuild.60")) {
					event.setCancelled(true);
					event.getPlayer()
							.sendMessage(
									"This land is protected by the Home owners accociation.");
				}
			}
			if (event.getBlock().getLocation().getY() > 60
					&& event.getBlock().getLocation().getY() <= 80) {
				if (!player.hasPermission("LayeredBuild.80")) {
					event.setCancelled(true);
					event.getPlayer()
							.sendMessage(
									"This land is protected by the Home owners accociation.");
				}
			}
			if (event.getBlock().getLocation().getY() > 80
					&& event.getBlock().getLocation().getY() <= 100) {
				if (!player.hasPermission("LayeredBuild.100")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(
							"The air is to thin to mine here.");
				}
			}
			if (event.getBlock().getLocation().getY() > 100
					&& event.getBlock().getLocation().getY() <= 120) {
				if (!player.hasPermission("LayeredBuild.120")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(
							"The air is to thin to mine here.");
				}
			}
			if (event.getBlock().getLocation().getY() > 120
					&& event.getBlock().getLocation().getY() <= 140) {
				if (!player.hasPermission("LayeredBuild.140")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(
							"The air is to thin to mine here.");
				}
			}
			if (event.getBlock().getLocation().getY() > 140
					&& event.getBlock().getLocation().getY() <= 160) {
				if (!player.hasPermission("LayeredBuild.160")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(
							"The air is to thin to mine here.");
				}
			}
			if (event.getBlock().getLocation().getY() > 160
					&& event.getBlock().getLocation().getY() <= 180) {
				if (!player.hasPermission("LayeredBuild.180")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(
							"The air is to thin to mine here.");
				}
			}
			if (event.getBlock().getLocation().getY() > 180
					&& event.getBlock().getLocation().getY() <= 200) {
				if (!player.hasPermission("LayeredBuild.200")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(
							"The air is to thin to mine here.");
				}
			}
			if (event.getBlock().getLocation().getY() > 200
					&& event.getBlock().getLocation().getY() <= 220) {
				if (!player.hasPermission("LayeredBuild.220")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(
							"The air is to thin to mine here.");
				}
			}
			if (event.getBlock().getLocation().getY() > 220
					&& event.getBlock().getLocation().getY() <= 240) {
				if (!player.hasPermission("LayeredBuild.240")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(
							"The air is to thin to mine here.");
				}
			}
			if (event.getBlock().getLocation().getY() > 240
					&& event.getBlock().getLocation().getY() <= 260) {
				if (!player.hasPermission("LayeredBuild.260")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(
							"The air is to thin to mine here.");
				}
			}
		}
	}

	@EventHandler
	public void placeDeath(BlockPlaceEvent event) {
		final Player player = event.getPlayer();
		if (!player.isOp()) {
			if (event.getBlock().getLocation().getY() <= 20) {
				if (!player.hasPermission("LayeredBuild.20")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(
							"It is to dark for you to build here.");
				}
			}
			if (event.getBlock().getLocation().getY() > 20
					&& event.getBlock().getLocation().getY() <= 40) {
				if (!player.hasPermission("LayeredBuild.40")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(
							"It is to dark for you to build here.");
				}
			}
			if (event.getBlock().getLocation().getY() > 40
					&& event.getBlock().getLocation().getY() <= 60) {
				if (!player.hasPermission("LayeredBuild.60")) {
					event.setCancelled(true);
					event.getPlayer()
							.sendMessage(
									"This land is protected by the Home owners accociation.");
				}
			}
			if (event.getBlock().getLocation().getY() > 60
					&& event.getBlock().getLocation().getY() <= 80) {
				if (!player.hasPermission("LayeredBuild.80")) {
					event.setCancelled(true);
					event.getPlayer()
							.sendMessage(
									"This land is protected by the Home owners accociation.");
				}
			}
			if (event.getBlock().getLocation().getY() > 80
					&& event.getBlock().getLocation().getY() <= 100) {
				if (!player.hasPermission("LayeredBuild.100")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(
							"The air is to thin to build here.");
				}
			}
			if (event.getBlock().getLocation().getY() > 100
					&& event.getBlock().getLocation().getY() <= 120) {
				if (!player.hasPermission("LayeredBuild.120")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(
							"The air is to thin to build here.");
				}
			}
			if (event.getBlock().getLocation().getY() > 120
					&& event.getBlock().getLocation().getY() <= 140) {
				if (!player.hasPermission("LayeredBuild.140")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(
							"The air is to thin to build here.");
				}
			}
			if (event.getBlock().getLocation().getY() > 140
					&& event.getBlock().getLocation().getY() <= 160) {
				if (!player.hasPermission("LayeredBuild.160")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(
							"The air is to thin to build here.");
				}
			}
			if (event.getBlock().getLocation().getY() > 160
					&& event.getBlock().getLocation().getY() <= 180) {
				if (!player.hasPermission("LayeredBuild.180")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(
							"The air is to thin to build here.");
				}
			}
			if (event.getBlock().getLocation().getY() > 180
					&& event.getBlock().getLocation().getY() <= 200) {
				if (!player.hasPermission("LayeredBuild.200")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(
							"The air is to thin to build here.");
				}
			}
			if (event.getBlock().getLocation().getY() > 200
					&& event.getBlock().getLocation().getY() <= 220) {
				if (!player.hasPermission("LayeredBuild.220")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(
							"The air is to thin to build here.");
				}
			}
			if (event.getBlock().getLocation().getY() > 220
					&& event.getBlock().getLocation().getY() <= 240) {
				if (!player.hasPermission("LayeredBuild.240")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(
							"The air is to thin to build here.");
				}
			}
			if (event.getBlock().getLocation().getY() > 240
					&& event.getBlock().getLocation().getY() <= 260) {
				if (!player.hasPermission("LayeredBuild.260")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(
							"The air is to thin to build here.");
				}
			}
		}
	}

}
