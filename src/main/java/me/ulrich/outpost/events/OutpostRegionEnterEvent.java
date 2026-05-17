package me.ulrich.outpost.events;

import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class OutpostRegionEnterEvent extends Event {

	private static final HandlerList handlers = new HandlerList();
	private UUID kothUUID;
	private Player player;
    
    public OutpostRegionEnterEvent(UUID kothUUID, Player player) {
    	this.setOutpostUUID(kothUUID);
    	this.setPlayer(player);
    }
    
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

	public UUID getOutpostUUID() {
		return kothUUID;
	}

	public void setOutpostUUID(UUID kothUUID) {
		this.kothUUID = kothUUID;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}


}
