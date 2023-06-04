package me.ulrich.outpost.data;

import java.util.List;
import java.util.UUID;

import me.ulrich.outpost.data.OutpostEnum.AdvantageList;

public class AdvantageData {

	private UUID id;
	private boolean enabled;
	private double multiplier;
	private List<String> whitelist;
	private AdvantageList type;
	private UUID outpostUUID;
	private String customData;

	public AdvantageData(UUID id, UUID outpostUUID, AdvantageList type, boolean enabled, double multiplier, List<String> whitelist, String customData) {
		this.setId(id);
		this.setOutpostUUID(outpostUUID);
		this.setType(type);
		this.setEnabled(enabled);
		this.setMultiplier(multiplier);
		this.setWhitelist(whitelist);
		this.setCustomData(customData);
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
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

	public UUID getOutpostUUID() {
		return outpostUUID;
	}

	public void setOutpostUUID(UUID outpostUUID) {
		this.outpostUUID = outpostUUID;
	}

	public String getCustomData() {
		return customData;
	}

	public void setCustomData(String customData) {
		this.customData = customData;
	}
}
