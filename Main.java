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
	}
	
	@Override
	public void onDisable() {
		System.out.println("ChatLoader is now shutdowned !");
	}

}
