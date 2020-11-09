package ch.brokencode.chatloader;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	/**
	 * author Brokencode
	 * @param e
	 */
	
	@Override
	public void onEnable() {
		System.out.println("ChatLoader started up !");
		getServer().getPluginManager().registerEvents(new Event(), this);
		getServer().getPluginManager().registerEvents(new Chatlistener(), this);
	}
	
	@Override
	public void onDisable() {
		System.out.println("ChatLoader is now shutdowned !");
	}

}
