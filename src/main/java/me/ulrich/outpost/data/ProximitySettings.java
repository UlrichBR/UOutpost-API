package me.ulrich.outpost.data;

import me.ulrich.outpost.data.OutpostEnum.ProximityType;

public class ProximitySettings {

	private int size;
	private ProximityType type;

	public ProximitySettings(int size, ProximityType type) {
		this.setSize(size);
		this.setType(type);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public ProximityType getType() {
		return type;
	}

	public void setType(ProximityType type) {
		this.type = type;
	}
}
