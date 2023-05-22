package me.ulrich.outpost.data;

import org.bukkit.entity.Player;



public class EventData {

	private Player playerControl;
	private Long startedControl;
	private Long startedEvent;
	private Player preControl;
	private Long startedPre;

	public EventData(Player playerControl, Player preControl, Long startedControl, Long startedPre, Long startedEvent) {
		this.setPlayerControl(playerControl);
		this.setStartedControl(startedControl);
		this.setStartedEvent(startedEvent);
		this.setPreControl(preControl);
		this.setStartedPre(startedPre);
	}



	public Player getPlayerControl() {
		return playerControl;
	}

	public void setPlayerControl(Player playerControl) {
		this.playerControl = playerControl;
	}

	public Long getStartedControl() {
		return startedControl;
	}

	public void setStartedControl(Long startedControl) {
		this.startedControl = startedControl;
	}

	public Long getStartedEvent() {
		return startedEvent;
	}

	public void setStartedEvent(Long startedEvent) {
		this.startedEvent = startedEvent;
	}



	public Player getPreControl() {
		return preControl;
	}



	public void setPreControl(Player preControl) {
		this.preControl = preControl;
	}



	public Long getStartedPre() {
		return startedPre;
	}



	public void setStartedPre(Long startedPre) {
		this.startedPre = startedPre;
	}
}
