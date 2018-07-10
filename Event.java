package ch.brokencode.chatloader.event;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Event {
	
	private Map<String, Long> cooldowns = new HashMap<>();
	
	/**
	 * author Brokencode
	 * @param e
	 */
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		Player p = e.getPlayer();
		//cooldown anti spam
		if(!p.isOp()) {
			if(cooldowns.containsKey(p.getName())){
                int seconds = 3;
                long timeleft = ((cooldowns.get(p.getName())) / 1000 + seconds) - (System.currentTimeMillis() / 1000) ;
                if(timeleft > 0){
                    e.getPlayer().sendMessage("§cNe spammez pas.");
                    e.setCancelled(true);
                    return;
                }
            }
            cooldowns.put(p.getName(), System.currentTimeMillis());
		}
	}
}
