package me.ulrich.outpost.data;

import java.util.List;
import java.util.UUID;

import me.ulrich.outpost.data.OutpostEnum.InteractionsList;

public class InteractionsData {

	private UUID id;
	private boolean enabled;
	private int multiplier;
	private List<String> whitelist;
	private InteractionsList type;
	private UUID outpostUUID;
	private String customData;
	private String typeId;

	public InteractionsData(UUID id, UUID outpostUUID, String typeId, InteractionsList type, boolean enabled, int multiplier, List<String> whitelist, String customData) {
		this.setId(id);
		this.setTypeId(typeId);
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

	public int getMultiplier() {
		return multiplier;
	}

	public void setMultiplier(int multiplier) {
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

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
}
