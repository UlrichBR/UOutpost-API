package me.ulrich.outpost.data;

import java.util.UUID;

public class NextEventData {

	private UUID kothId;
	private UUID schedulerId;

	public NextEventData(UUID kothId, UUID schedulerId) {
		this.setOutpostId(kothId);
		this.setSchedulerId(schedulerId);
	}

	public UUID getOutpostId() {
		return kothId;
	}

	public void setOutpostId(UUID kothId) {
		this.kothId = kothId;
	}

	public UUID getSchedulerId() {
		return schedulerId;
	}

	public void setSchedulerId(UUID schedulerId) {
		this.schedulerId = schedulerId;
	}
}
