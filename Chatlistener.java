package ch.neosia.yannouw;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Chatlistener implements Listener {
	
	private Map<String, Long> cooldowns = new HashMap<>();

	
	@EventHandler
	 
    public void onchat(AsyncPlayerChatEvent e){
        
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("ez")){
            e.setMessage("GG");
            p.sendMessage("§4Veuillez respecter les autres joueurs !");
        }
    }
	
	@EventHandler
	public void onChat2(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("e z")) {
			e.setMessage("GG");
			
			p.sendMessage("§4Veuillez respecter les autres joueurs !");
		}
	}
	
	@EventHandler
	public void onChat3(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("facile")){
			e.setMessage("Bien joué");
			p.sendMessage("§4Veuillez respecter les autres joueurs !");
		}
	}
	
	@EventHandler
	public void onChat4(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("ta mère")){
			e.setMessage("ma mère");
			p.sendMessage("§4évitez d'envoyer des insultes si vous voulez éviter un ban");
		}
	}
	
	@EventHandler
	public void onChat5(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("ta gueule")){
			e.setMessage("mais heuu");
			p.sendMessage("§4évitez d'envoyer des insultes si vous voulez éviter le ban");
		}
	}
	@EventHandler
	public void onChat6(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("pd")){
			e.setMessage("je suis homosexuel");
			p.sendMessage("§4évitez les insultes sur le serveur si vous voulez éviter un ban !");
		}
	}
	@EventHandler
	public void onChat7(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("fdp")){
			e.setMessage("je suis un fdp");
			p.sendMessage("§4évitez les insultes sur le serveur si vous voulez éviter un ban !");
		}
	}
	@EventHandler
	public void onChat8(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("battard")){
			e.setMessage("Désolé :)");
			p.sendMessage("§4évitez les insultes sur le serveur si vous voulez éviter un ban !");
		}
	}
	@EventHandler
	public void onChat9(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("sale pute")){
			e.setMessage("[Insulte removed]");
			p.sendMessage("§4évitez les insultes sur le serveur si vous voulez éviter un ban !");
		}
	}
	@EventHandler
	public void onChat12(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("grosse pute")){
			e.setMessage("[Insulte removed]");
			p.sendMessage("§4évitez les insultes sur le serveur si vous voulez éviter un ban !");
		}
	}
	@EventHandler
	public void onChat11(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("fils de pute")){
			e.setMessage("[Insulte removed]");
			p.sendMessage("§4évitez les insultes sur le serveur si vous voulez éviter un ban !");
		}
	}
	@EventHandler
	public void onChat10(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("pute")) {
			e.setMessage("[Insulte removed]");
			p.sendMessage("§4évitez les insultes sur le serveur si vous voulez éviter un ban !");
		}
	}
	@EventHandler
	public void onChat13(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("salope")) {
			e.setMessage("[Insulte removed]");
			p.sendMessage("|| §4évitez les insultes sur le serveur si vous voulez éviter un ban ! §f||");
		}
	}
	@EventHandler
	public void onChat14(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("putes")) {
			e.setMessage("[Insulte removed]");
			p.sendMessage("|| §4évitez les insultes sur le serveur si vous voulez éviter un ban ! §f||");
		}
	}
	@EventHandler
	public void onChat15(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("nul")) {
			e.setMessage("[Insulte removed]");
			p.sendMessage("|| §4évitez les insultes sur le serveur si vous voulez éviter un ban ! §f||");
		}
	}
	@EventHandler
	public void onChat16(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("t nul")) {
			e.setMessage("[Insulte removed]");
			p.sendMessage("|| §4évitez les insultes sur le serveur si vous voulez éviter un ban ! §f||");
		}
	}
	@EventHandler
	public void onChat17(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("tu pue")) {
			e.setMessage("[Insulte removed]");
			p.sendMessage("|| §4évitez les insultes sur le serveur si vous voulez éviter un ban ! §f||");
		}
	}
	@EventHandler
	public void onChat18(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("tu pues")) {
			e.setMessage("[Insulte removed]");
			p.sendMessage("|| §4évitez les insultes sur le serveur si vous voulez éviter un ban ! §f||");
		}
	}
	@EventHandler
	public void onChat19(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("easy")) {
			e.setMessage("gg");
			p.sendMessage("|| §4évitez les insultes sur le serveur si vous voulez éviter un ban ! §f||");
		}
	}
	@EventHandler
	public void onChat20(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("easy win")) {
			e.setMessage("gg");
			p.sendMessage("|| §4évitez les insultes sur le serveur si vous voulez éviter un ban ! §f||");
		}
	}
	@EventHandler
	public void onChat21(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("e_z")) {
			e.setMessage("gg");
			p.sendMessage("|| §4évitez les insultes sur le serveur si vous voulez éviter un ban ! §f||");
		}
	}
	@EventHandler
	public void onChat22(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("e.z")) {
			e.setMessage("gg");
			p.sendMessage("|| §4évitez les insultes sur le serveur si vous voulez éviter un ban ! §f||");
		}
	}
	@EventHandler
	public void onChat23(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("e-z")) {
			e.setMessage("gg");
			p.sendMessage("|| §4évitez les insultes sur le serveur si vous voulez éviter un ban ! §f||");
		}
	}
	
	@EventHandler
	public void onChat01(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("ez.")) {
			e.setMessage("gg");
			p.sendMessage("|| §4évitez les insultes sur le serveur si vous voulez éviter un ban ! §f||");
		}
	}
	
	@EventHandler
    public void onChat(AsyncPlayerChatEvent event){
       
        Player player = event.getPlayer(); 
        if(cooldowns.containsKey(player.getName())){
           
            int seconds = 3;
            long timeleft = ((cooldowns.get(player.getName()) / 1000) + seconds) - (System.currentTimeMillis() / 1000);
            if(timeleft > 0){
                player.sendMessage("§cTu dois encore attendre §a" + timeleft + "§c secondes !");
                event.setCancelled(true);
                return;
            }
           
        }
       
        cooldowns.put(player.getName(), System.currentTimeMillis());
       
    }
	@EventHandler
	public void onChat02(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("ta-mère")) {
			e.setMessage("ma mère");
			p.sendMessage("|| §4évitez les insultes sur le serveur si vous voulez éviter un ban ! §f||");
		}
	}
	@EventHandler
	public void onChat03(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("ta.mère")) {
			e.setMessage("ma mère");
			p.sendMessage("|| §4évitez les insultes sur le serveur si vous voulez éviter un ban ! §f||");
		}
	}
	@EventHandler
	public void onChat04(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("tamère")) {
			e.setMessage("ma mère");
			p.sendMessage("|| §4évitez les insultes sur le serveur si vous voulez éviter un ban ! §f||");
		}
	}
	
	@EventHandler
	public void onChat05(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("ta mere")) {
			e.setMessage("ma mère");
			p.sendMessage("|| §4évitez les insultes sur le serveur si vous voulez éviter un ban ! §f||");
		}
	}
	@EventHandler
	public void onChat06(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("ta.mere")) {
			e.setMessage("ma mère");
			p.sendMessage("|| §4évitez les insultes sur le serveur si vous voulez éviter un ban ! §f||");
		}
	}
}
