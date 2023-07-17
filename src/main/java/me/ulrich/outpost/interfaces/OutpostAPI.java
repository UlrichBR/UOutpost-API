package me.ulrich.outpost.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.ulrich.outpost.data.AdvantageData;
import me.ulrich.outpost.data.ConfigAdvantage;
import me.ulrich.outpost.data.CubRegionLoc;
import me.ulrich.outpost.data.EventData;
import me.ulrich.outpost.data.IslandJoinLeaveData;
import me.ulrich.outpost.data.OutpostData;
import me.ulrich.outpost.data.OutpostEnum.AdvantageList;
import me.ulrich.outpost.data.OutpostEnum.TranslatableKey;

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

	void checkAllOutpostAdvantages();

	void checkoutpostAdvantages(UUID outpostUUID);

	Optional<AdvantageData> getAdvantageOutpostByType(UUID outpostUUID, String type);

	List<AdvantageData> getAllOutpostAdvantage(UUID outpostUUID);

	void deleteAllOutpostAdvantage(UUID outpostUUID);

	boolean updateAdvantageOutpost(UUID outpostUUID, AdvantageData advantage);

	boolean deleteAdvantage(UUID advantageId);

	HashMap<UUID, List<AdvantageData>> getAdvantageData();

	HashMap<String, ConfigAdvantage> getConfigAdvantage();

	Optional<ConfigAdvantage> getConfigAdvanges(String type);

	String translate(TranslatableKey trans, String object, String... args);

	String translateOutReference(String key, String object, String... args);

	Optional<TranslatableKey> findTranslateType(AdvantageList type);

	String translateWithFindKey(AdvantageList type, String object);



	


}
