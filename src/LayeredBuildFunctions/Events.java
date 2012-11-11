package LayeredBuildFunctions;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import at.grevinelveck.layeredbuild.LayeredBuild;

public class Events implements Listener {
	FileConfiguration config = LayeredBuild.plugin.getConfig();

	@EventHandler
	public void bHight(BlockBreakEvent event) {

		final Player player = event.getPlayer();
		String bBreak = config.getString("Messages.WhenBlockBroken").replaceAll(
				"%player%", player.getName());
		if (!player.isOp()) {
			if (event.getBlock().getLocation().getY() <= 20) {
				if (!player.hasPermission("LayeredBuild.20")) {
					event.setCancelled(true);
					player.sendMessage(
							ChatColor.DARK_RED.toString()+bBreak);
				}
			}
			if (event.getBlock().getLocation().getY() > 20
					&& event.getBlock().getLocation().getY() <= 40) {
				if (!player.hasPermission("LayeredBuild.40")) {
					event.setCancelled(true);
					player.sendMessage(
							ChatColor.DARK_RED.toString()+bBreak);
				}
			}
			if (event.getBlock().getLocation().getY() > 40
					&& event.getBlock().getLocation().getY() <= 60) {
				if (!player.hasPermission("LayeredBuild.60")) {
					event.setCancelled(true);
					player
							.sendMessage(
									ChatColor.DARK_RED.toString()+bBreak);
				}
			}
			if (event.getBlock().getLocation().getY() > 60
					&& event.getBlock().getLocation().getY() <= 80) {
				if (!player.hasPermission("LayeredBuild.80")) {
					event.setCancelled(true);
					player
							.sendMessage(
									ChatColor.DARK_RED.toString()+bBreak);
				}
			}
			if (event.getBlock().getLocation().getY() > 80
					&& event.getBlock().getLocation().getY() <= 100) {
				if (!player.hasPermission("LayeredBuild.100")) {
					event.setCancelled(true);
					player.sendMessage(
							ChatColor.DARK_RED.toString()+bBreak);
				}
			}
			if (event.getBlock().getLocation().getY() > 100
					&& event.getBlock().getLocation().getY() <= 120) {
				if (!player.hasPermission("LayeredBuild.120")) {
					event.setCancelled(true);
					player.sendMessage(
							ChatColor.DARK_RED.toString()+bBreak);
				}
			}
			if (event.getBlock().getLocation().getY() > 120
					&& event.getBlock().getLocation().getY() <= 140) {
				if (!player.hasPermission("LayeredBuild.140")) {
					event.setCancelled(true);
					player.sendMessage(
							ChatColor.DARK_RED.toString()+bBreak);
				}
			}
			if (event.getBlock().getLocation().getY() > 140
					&& event.getBlock().getLocation().getY() <= 160) {
				if (!player.hasPermission("LayeredBuild.160")) {
					event.setCancelled(true);
					player.sendMessage(
							ChatColor.DARK_RED.toString()+bBreak);
				}
			}
			if (event.getBlock().getLocation().getY() > 160
					&& event.getBlock().getLocation().getY() <= 180) {
				if (!player.hasPermission("LayeredBuild.180")) {
					event.setCancelled(true);
					player.sendMessage(
							ChatColor.DARK_RED.toString()+bBreak);
				}
			}
			if (event.getBlock().getLocation().getY() > 180
					&& event.getBlock().getLocation().getY() <= 200) {
				if (!player.hasPermission("LayeredBuild.200")) {
					event.setCancelled(true);
					player.sendMessage(
							ChatColor.DARK_RED.toString()+bBreak);
				}
			}
			if (event.getBlock().getLocation().getY() > 200
					&& event.getBlock().getLocation().getY() <= 220) {
				if (!player.hasPermission("LayeredBuild.220")) {
					event.setCancelled(true);
					player.sendMessage(
							ChatColor.DARK_RED.toString()+bBreak);
				}
			}
			if (event.getBlock().getLocation().getY() > 220
					&& event.getBlock().getLocation().getY() <= 240) {
				if (!player.hasPermission("LayeredBuild.240")) {
					event.setCancelled(true);
					player.sendMessage(
							ChatColor.DARK_RED.toString()+bBreak);
				}
			}
			if (event.getBlock().getLocation().getY() > 240
					&& event.getBlock().getLocation().getY() <= 260) {
				if (!player.hasPermission("LayeredBuild.260")) {
					event.setCancelled(true);
					player.sendMessage(
							ChatColor.DARK_RED.toString()+bBreak);
				}
			}
		}
	}

	@EventHandler
	public void pHight(BlockPlaceEvent event) {
		
		final Player player = event.getPlayer();
		String bPlace = config.getString("Messages.WhenBlockPlaced").replaceAll(
				"%player%", player.getName());
		if (!player.isOp()) {
			if (event.getBlock().getLocation().getY() <= 20) {
				if (!player.hasPermission("LayeredBuild.20")) {
					event.setCancelled(true);
					player.sendMessage(
							ChatColor.DARK_RED.toString()+bPlace);
				}
			}
			if (event.getBlock().getLocation().getY() > 20
					&& event.getBlock().getLocation().getY() <= 40) {
				if (!player.hasPermission("LayeredBuild.40")) {
					event.setCancelled(true);
					player.sendMessage(
							ChatColor.DARK_RED.toString()+bPlace);
				}
			}
			if (event.getBlock().getLocation().getY() > 40
					&& event.getBlock().getLocation().getY() <= 60) {
				if (!player.hasPermission("LayeredBuild.60")) {
					event.setCancelled(true);
					player
							.sendMessage(
									ChatColor.DARK_RED.toString()+bPlace);
				}
			}
			if (event.getBlock().getLocation().getY() > 60
					&& event.getBlock().getLocation().getY() <= 80) {
				if (!player.hasPermission("LayeredBuild.80")) {
					event.setCancelled(true);
					player
							.sendMessage(
									ChatColor.DARK_RED.toString()+bPlace);
				}
			}
			if (event.getBlock().getLocation().getY() > 80
					&& event.getBlock().getLocation().getY() <= 100) {
				if (!player.hasPermission("LayeredBuild.100")) {
					event.setCancelled(true);
					player.sendMessage(
							ChatColor.DARK_RED.toString()+bPlace);
				}
			}
			if (event.getBlock().getLocation().getY() > 100
					&& event.getBlock().getLocation().getY() <= 120) {
				if (!player.hasPermission("LayeredBuild.120")) {
					event.setCancelled(true);
					player.sendMessage(
							ChatColor.DARK_RED.toString()+bPlace);
				}
			}
			if (event.getBlock().getLocation().getY() > 120
					&& event.getBlock().getLocation().getY() <= 140) {
				if (!player.hasPermission("LayeredBuild.140")) {
					event.setCancelled(true);
					player.sendMessage(
							ChatColor.DARK_RED.toString()+bPlace);
				}
			}
			if (event.getBlock().getLocation().getY() > 140
					&& event.getBlock().getLocation().getY() <= 160) {
				if (!player.hasPermission("LayeredBuild.160")) {
					event.setCancelled(true);
					player.sendMessage(
							ChatColor.DARK_RED.toString()+bPlace);
				}
			}
			if (event.getBlock().getLocation().getY() > 160
					&& event.getBlock().getLocation().getY() <= 180) {
				if (!player.hasPermission("LayeredBuild.180")) {
					event.setCancelled(true);
					player.sendMessage(
							ChatColor.DARK_RED.toString()+bPlace);
				}
			}
			if (event.getBlock().getLocation().getY() > 180
					&& event.getBlock().getLocation().getY() <= 200) {
				if (!player.hasPermission("LayeredBuild.200")) {
					event.setCancelled(true);
					player.sendMessage(
							ChatColor.DARK_RED.toString()+bPlace);
				}
			}
			if (event.getBlock().getLocation().getY() > 200
					&& event.getBlock().getLocation().getY() <= 220) {
				if (!player.hasPermission("LayeredBuild.220")) {
					event.setCancelled(true);
					player.sendMessage(
							ChatColor.DARK_RED.toString()+bPlace);
				}
			}
			if (event.getBlock().getLocation().getY() > 220
					&& event.getBlock().getLocation().getY() <= 240) {
				if (!player.hasPermission("LayeredBuild.240")) {
					event.setCancelled(true);
					player.sendMessage(
							ChatColor.DARK_RED.toString()+bPlace);
				}
			}
			if (event.getBlock().getLocation().getY() > 240
					&& event.getBlock().getLocation().getY() <= 260) {
				if (!player.hasPermission("LayeredBuild.260")) {
					event.setCancelled(true);
					player.sendMessage(
							ChatColor.DARK_RED.toString()+bPlace);
				}
			}
		}
	}

}
