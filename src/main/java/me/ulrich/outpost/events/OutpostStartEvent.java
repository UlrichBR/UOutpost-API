package me.ulrich.outpost.events;

import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class OutpostStartEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
	private UUID outpostUUID;
	private Player player;
    
    public OutpostStartEvent(UUID outpostUUID, Player player) {
    	this.setOutpostUUID(outpostUUID);
    	this.setPlayer(player);
    }
    
	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}
	
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

	public UUID getOutpostUUID() {
		return outpostUUID;
	}

	public void setOutpostUUID(UUID outpostUUID) {
		this.outpostUUID = outpostUUID;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}



}
