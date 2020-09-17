package net.CodeError.vanillascoreboards;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.plugin.java.JavaPlugin;

public class VanillaScoreboards extends JavaPlugin implements CommandExecutor, TabCompleter {
	
	private List<String> blank = new ArrayList<>();
	
	@Override
	public void onEnable() {
		
		if (!Bukkit.getServer().getPluginManager().isPluginEnabled("HolographicDisplays")) {
			
			this.getLogger().severe("Dependant plugin HolographicDisplays could not be found or is not enabled!");
			this.getLogger().severe("Disabling VanilaScoreboards v1.0...");
			
			this.setEnabled(false);
			
			return;
			
		}
		
		this.getLogger().info("VanillaScoreboards v1.0 has been successfully enabled! Created by CodeError.");
		
	}
	
	@Override
	public void onDisable() {
		
		this.getLogger().info("VanillaScoreboards v1.0 has been disabled.");
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		return true;
		
	}
	
	@Override
	public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
		
		return blank;
		
	}

}
