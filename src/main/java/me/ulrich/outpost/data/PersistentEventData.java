package me.ulrich.outpost.data;

import java.util.Optional;
import java.util.UUID;

public class PersistentEventData {

	private Optional<UUID> lastPlayerCapture;
	private Long startedControl;

	public PersistentEventData(Optional<UUID> lastPlayerCapture, Long startedControl) {
		this.setLastPlayerCapture(lastPlayerCapture);
		this.setStartedControl(startedControl);
	}

	public Optional<UUID> getLastPlayerCapture() {
		return lastPlayerCapture;
	}

	public void setLastPlayerCapture(Optional<UUID> lastPlayerCapture) {
		this.lastPlayerCapture = lastPlayerCapture;
	}

	public Long getStartedControl() {
		return startedControl;
	}

	public void setStartedControl(Long startedControl) {
		this.startedControl = startedControl;
	}
}
