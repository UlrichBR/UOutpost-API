package me.ulrich.outpost.data;

import java.util.List;
import java.util.UUID;

import org.bukkit.Location;


public class OutpostData {
	
	private String name;
	private Location loc1;
	private Location loc2;
	private UUID uuid;
	private List<String> commands;
	private String icon;
	private KeySettings keySettings;
	private ProximitySettings proximitySettings;
	private GeneralSettings settings;
	private int captureTime;
	private LootSettings lootType;
	private PersistentEventData peristentData;

	public OutpostData(String name, UUID uuid, Location loc1, Location loc2, List<String> commands, String icon, int captureTime, KeySettings keySettings, ProximitySettings proximitySettings, GeneralSettings settings, LootSettings lootType, PersistentEventData peristentData) {
		this.setName(name);
		this.setUuid(uuid);
		this.setLoc1(loc1);
		this.setLoc2(loc2);
		this.setCommands(commands);
		this.setIcon(icon);
		this.setCaptureTime(captureTime);
		this.setKeySettings(keySettings);
		this.setProximitySettings(proximitySettings);
		this.setSettings(settings);
		this.setLootType(lootType);
		this.setPeristentData(peristentData);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLoc1() {
		return loc1;
	}

	public void setLoc1(Location loc1) {
		this.loc1 = loc1;
	}

	public Location getLoc2() {
		return loc2;
	}

	public void setLoc2(Location loc2) {
		this.loc2 = loc2;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public List<String> getCommands() {
		return commands;
	}

	public void setCommands(List<String> commands) {
		this.commands = commands;
	}


	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public KeySettings getKeySettings() {
		return keySettings;
	}

	public void setKeySettings(KeySettings keySettings) {
		this.keySettings = keySettings;
	}

	public ProximitySettings getProximitySettings() {
		return proximitySettings;
	}

	public void setProximitySettings(ProximitySettings proximitySettings) {
		this.proximitySettings = proximitySettings;
	}

	public GeneralSettings getSettings() {
		return settings;
	}

	public void setSettings(GeneralSettings settings) {
		this.settings = settings;
	}

	public int getCaptureTime() {
		return captureTime;
	}

	public void setCaptureTime(int captureTime) {
		this.captureTime = captureTime;
	}


	public LootSettings getLootType() {
		return lootType;
	}

	public void setLootType(LootSettings lootType) {
		this.lootType = lootType;
	}

	public PersistentEventData getPeristentData() {
		return peristentData;
	}

	public void setPeristentData(PersistentEventData peristentData) {
		this.peristentData = peristentData;
	}


}
