package me.ulrich.outpost.data;

import java.util.List;

import me.ulrich.outpost.data.OutpostEnum.InteractionsList;

public class ConfigInteractions {

	private boolean enabled;
	private double multiplier;
	private List<String> whitelist;
	private InteractionsList type;
	private String name;
	private String icon;
	private String customData;
	private String id;

	public ConfigInteractions(String id, InteractionsList type, boolean enabled, String name, String icon, List<String> whitelist, String customData) {
		this.setId(id);
		this.setType(type);
		this.setEnabled(enabled);
		this.setName(name);
		this.setIcon(icon);
		this.setCustomData(customData);
		this.setWhitelist(whitelist);
	}


	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public double getMultiplier() {
		return multiplier;
	}

	public void setMultiplier(double multiplier) {
		this.multiplier = multiplier;
	}

	public List<String> getWhitelist() {
		return whitelist;
	}

	public void setWhitelist(List<String> whitelist) {
		this.whitelist = whitelist;
	}

	public InteractionsList getType() {
		return type;
	}

	public void setType(InteractionsList type) {
		this.type = type;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getIcon() {
		return icon;
	}


	public void setIcon(String icon) {
		this.icon = icon;
	}


	public String getCustomData() {
		return customData;
	}


	public void setCustomData(String customData) {
		this.customData = customData;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

}
