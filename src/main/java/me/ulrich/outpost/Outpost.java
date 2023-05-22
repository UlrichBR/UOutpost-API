package me.ulrich.outpost;

import java.util.HashMap;

import org.bukkit.plugin.java.JavaPlugin;

import me.ulrich.outpost.api.OutpostAPIManager;
import me.ulrich.outpost.data.Addon;
import me.ulrich.outpost.data.Extension;
import net.kyori.adventure.platform.bukkit.BukkitAudiences;

public class Outpost extends JavaPlugin{

	private static Outpost Core;
	private BukkitAudiences adventure;
	private OutpostAPIManager outpostAPI;
	
	//addon usage
	private HashMap<Addon, Boolean> addonEnabledList = new HashMap<Addon, Boolean>();
	//extension usage
	private HashMap<Extension, Boolean> extensionEnabledList = new HashMap<Extension, Boolean>();
	private HashMap<Extension, Boolean> extensionDisabledList = new HashMap<Extension, Boolean>();
	
	public static Outpost getCore() {
		return Core;
	}

	public BukkitAudiences getAdventure() {
		return adventure;
	}

	public OutpostAPIManager getOutpostAPI() {
		return outpostAPI;
	}

	public HashMap<Addon, Boolean> getAddonEnabledList() {
		return addonEnabledList;
	}

	public void setAddonEnabledList(HashMap<Addon, Boolean> addonEnabledList) {
		this.addonEnabledList = addonEnabledList;
	}

	public HashMap<Extension, Boolean> getExtensionEnabledList() {
		return extensionEnabledList;
	}

	public void setExtensionEnabledList(HashMap<Extension, Boolean> extensionEnabledList) {
		this.extensionEnabledList = extensionEnabledList;
	}

	public HashMap<Extension, Boolean> getExtensionDisabledList() {
		return extensionDisabledList;
	}

	public void setExtensionDisabledList(HashMap<Extension, Boolean> extensionDisabledList) {
		this.extensionDisabledList = extensionDisabledList;
	}






	


}
