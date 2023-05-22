package me.ulrich.outpost.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.ulrich.outpost.data.CubRegionLoc;
import me.ulrich.outpost.data.IslandJoinLeaveData;
import me.ulrich.outpost.data.OutpostData;

public interface OutpostAPI {

	void addGroupImplement(GroupAPI impl);
	
	boolean hasGroupImplemented();

	void addScoreboardImplement(ScoreboardAPI impl);
	
	boolean hasScoreboardImplemented();

	void addHoloImplement(HologramAPI impl);
	
	boolean hasHoloImplemented();
	
	boolean startOutpostEvent(String outpostName);

	boolean startOutpostEvent(UUID outpostUUID);

	boolean endOutpostEvent(String outpostName);

	boolean endOutpostEvent(UUID outpostUUID);

	boolean endOutpostEvent(UUID outpostUUID, Player winner);

	Set<UUID> getAllOutpostEvent();

	boolean hasOutpostStarted(String outpostName);

	boolean hasOutpostStarted(UUID outpostUUID);

	UUID getOutpostUUID(String outpostName);

	String getOutpostName(UUID outpostUUID);

	String getTag();

	OutpostData getOutpost(UUID outpostUUID);

	CubRegionLoc getOutpost(Location location);

	List<Player> getAdminMode();

	HashMap<UUID, IslandJoinLeaveData> getPlayerRegion();

	HashMap<UUID, OutpostData> getOutpostData();

	boolean startOutpostEvent(UUID outpostUUID, Player sender);

	String parseText(OutpostData outpost, String text);

	String parseText(UUID playerUUID, String text);

	


}
