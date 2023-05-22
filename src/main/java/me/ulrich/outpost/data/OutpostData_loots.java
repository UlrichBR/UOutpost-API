package me.ulrich.outpost.data;


import org.bukkit.Location;

public class OutpostData_loots {

	private String id;
	private Location locs;



	public OutpostData_loots(String id, Location locs) {
		this.setId(id);
		this.setLocs(locs);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Location getLocs() {
		return locs;
	}

	public void setLocs(Location locs) {
		this.locs = locs;
	}
}
