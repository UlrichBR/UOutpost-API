package me.ulrich.outpost.data;

import java.util.List;

import me.ulrich.outpost.data.OutpostEnum.AdvantageList;

public class ConfigAdvantage {

	private boolean enabled;
	private double multiplier;
	private List<String> whitelist;
	private AdvantageList type;
	private String name;
	private String icon;
	private String customData;

	public ConfigAdvantage(AdvantageList type, boolean enabled, String name, String icon, String customData) {
		this.setType(type);
		this.setEnabled(enabled);
		this.setName(name);
		this.setIcon(icon);
		this.setCustomData(customData);
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

	public AdvantageList getType() {
		return type;
	}

	public void setType(AdvantageList type) {
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

}
