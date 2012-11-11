package at.grevinelveck.layeredbuild;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import LayeredBuildFunctions.Events;

public class LayeredBuild extends JavaPlugin {
	public final Logger logger = Logger.getLogger("Minecraft");
	private Events checkEvents;
	public static LayeredBuild plugin;
	
	public void loadConfiguration() {
		getConfig().options().copyDefaults(true);
		saveConfig();
	}

	
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " is offline");
	}
	
		@Override
		public void onEnable() {

			PluginDescriptionFile pdfFile = this.getDescription();
			this.logger.info(pdfFile.getName() + " is online");
			plugin=this;
			loadConfiguration();
			checkEvents = new Events();
			getServer().getPluginManager().registerEvents(checkEvents, this);

	
	}
}
