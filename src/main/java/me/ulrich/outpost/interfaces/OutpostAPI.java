package me.ulrich.outpost.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.ulrich.outpost.data.CubRegionLoc;
import me.ulrich.outpost.data.EventData;
import me.ulrich.outpost.data.IslandJoinLeaveData;
import me.ulrich.outpost.data.OutpostData;

public interface OutpostAPI {

	void addGroupImplement(GroupAPI impl);
	
	boolean hasGroupImplemented();

	void addScoreboardImplement(ScoreboardAPI impl);
	
	boolean hasScoreboardImplemented();

	void addHoloImplement(HologramAPI impl);
	
	boolean hasHoloImplemented();

	Set<UUID> getAllOutpostEvent();

	boolean hasOutpostStarted(String kothName);

	boolean hasOutpostStarted(UUID kothUUID);

	UUID getOutpostUUID(String kothName);

	String getOutpostName(UUID kothUUID);

	String getTag();

	OutpostData getOutpost(UUID kothUUID);

	CubRegionLoc getOutpost(Location location);

	List<Player> getAdminMode();

	HashMap<UUID, IslandJoinLeaveData> getPlayerRegion();

	HashMap<UUID, OutpostData> getOutpostData();

	String parseText(OutpostData koth, String text);

	String parseText(UUID playerUUID, String text);

	List<Entry<UUID, EventData>> getControlPlayers();

	boolean inControlPlayer(Player player);

	boolean inControlPlayer(UUID playerUUID);
	
	List<Entry<UUID, EventData>> getControlPlayer(UUID playerUUID);




	


}
