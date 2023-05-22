package me.ulrich.outpost.data;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.player.PlayerEvent;

import me.ulrich.outpost.data.OutpostEnum.MovementWay;



public class IslandEnterEvent extends RegionEvent implements Cancellable {
    private boolean cancelled = false;
    private boolean cancellable = true;

    public IslandEnterEvent(IslandJoinLeaveData region, Player player, MovementWay movement, PlayerEvent parent) {
        super(region, player, movement, parent);
        if (movement == MovementWay.SPAWN || movement == MovementWay.DISCONNECT) {
            this.cancellable = false;
        }
    }

    public void setCancelled(boolean cancelled) {
        if (!this.cancellable) {
            return;
        }
        this.cancelled = cancelled;
    }

    public boolean isCancelled() {
        return this.cancelled;
    }

    public boolean isCancellable() {
        return this.cancellable;
    }

    protected void setCancellable(boolean cancellable) {
        this.cancellable = cancellable;
        if (!this.cancellable) {
            this.cancelled = false;
        }
    }
}
