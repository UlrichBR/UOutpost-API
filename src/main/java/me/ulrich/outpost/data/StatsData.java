package me.ulrich.outpost.data;

import java.util.UUID;

import me.ulrich.outpost.data.OutpostEnum.TopType;

public class StatsData {

	private UUID id;
	private long winDate;
	private TopType type;
	private String data;
	private UUID kothUUID;
	private int maxTime;

	public StatsData(UUID id, String data, long winDate, TopType type, UUID kothUUID, int maxTime) {
		this.setId(id);
		this.setData(data);
		this.setWinDate(winDate);
		this.setType(type);
		this.setOutpostUUID(kothUUID);
		this.setMaxTime(maxTime);
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public TopType getType() {
		return type;
	}

	public void setType(TopType type) {
		this.type = type;
	}

	public long getWinDate() {
		return winDate;
	}

	public void setWinDate(long winDate) {
		this.winDate = winDate;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public UUID getOutpostUUID() {
		return kothUUID;
	}

	public void setOutpostUUID(UUID kothUUID) {
		this.kothUUID = kothUUID;
	}

	public int getMaxTime() {
		return maxTime;
	}

	public void setMaxTime(int maxTime) {
		this.maxTime = maxTime;
	}
}
