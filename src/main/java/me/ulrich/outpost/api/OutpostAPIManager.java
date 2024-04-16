package me.ulrich.outpost.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.ulrich.outpost.Outpost;
import me.ulrich.outpost.data.AdvantageData;
import me.ulrich.outpost.data.ConfigAdvantage;
import me.ulrich.outpost.data.ConfigInteractions;
import me.ulrich.outpost.data.CubRegionLoc;
import me.ulrich.outpost.data.EventData;
import me.ulrich.outpost.data.InteractionsData;
import me.ulrich.outpost.data.IslandJoinLeaveData;
import me.ulrich.outpost.data.OutpostData;
import me.ulrich.outpost.data.OutpostEnum.AdvantageList;
import me.ulrich.outpost.data.OutpostEnum.TranslatableKey;
import me.ulrich.outpost.interfaces.GroupAPI;
import me.ulrich.outpost.interfaces.HologramAPI;
import me.ulrich.outpost.interfaces.OutpostAPI;
import me.ulrich.outpost.interfaces.ScoreboardAPI;

public class OutpostAPIManager implements OutpostAPI {

	public static OutpostAPIManager getInstance() {
		return Outpost.getCore().getOutpostAPI();
	}
	
	@Override
	public String getTag() {
		return null;
	}
	
	@Override
	public boolean hasHoloImplemented() {
		return false;
	}
	
	@Override
	public void addHoloImplement(HologramAPI impl) {}
	
	@Override
	public boolean hasGroupImplemented() {
		return false;
	}
	
	@Override
	public void addGroupImplement(GroupAPI impl) {}
	
	@Override
	public boolean hasScoreboardImplemented() {
		return false;
	}
	
	@Override
	public void addScoreboardImplement(ScoreboardAPI impl) {}
	
	@Override
	public boolean hasOutpostStarted(String outpostName) {
		return false;
	}
	
	@Override
	public boolean hasOutpostStarted(UUID outpostUUID) {
		return false;
	}
	
	@Override
	public String getOutpostName(UUID outpostUUID) {
		return null;
	}
	
	@Override
	public UUID getOutpostUUID(String outpostName) {
		return null;
	}
	
	@Override
	public OutpostData getOutpost(UUID outpostUUID) {
		return null;
	}
	
	@Override
	public CubRegionLoc getOutpost(Location location) {
		return null;
	}
	
	@Override
	public List<Player> getAdminMode() {
		return null;
	}
	
	@Override
	public HashMap<UUID, IslandJoinLeaveData> getPlayerRegion() {
		return null;
	}
	
	@Override
	public HashMap<UUID, OutpostData> getOutpostData() {
		return null;
	}
	
	@Override
	public Set<UUID> getAllOutpostEvent(){
		return null;
	}
	
	@Override
	public String parseText(OutpostData outpost, String text) {
		return null;
	}
	
	@Override
	public String parseText(UUID playerUUID, String text) {
		return null;
	}

	@Override
	public List<Entry<UUID, EventData>> getControlPlayers() {
		return null;
	}

	@Override
	public boolean inControlPlayer(Player player) {
		return false;
	}

	@Override
	public boolean inControlPlayer(UUID playerUUID) {
		return false;
	}

	@Override
	public List<Entry<UUID, EventData>> getControlPlayer(UUID playerUUID) {
		return null;
	}

	@Override
	public void checkAllOutpostAdvantages() {
		
	}

	@Override
	public void checkoutpostAdvantages(UUID outpostUUID) {
		
	}

	@Override
	public Optional<AdvantageData> getAdvantageOutpostByType(UUID outpostUUID, String type) {
		return Optional.empty();
	}

	@Override
	public List<AdvantageData> getAllOutpostAdvantage(UUID outpostUUID) {
		return null;
	}

	@Override
	public void deleteAllOutpostAdvantage(UUID outpostUUID) {
		
	}

	@Override
	public boolean updateAdvantageOutpost(UUID outpostUUID, AdvantageData advantage) {
		return false;
	}

	@Override
	public boolean deleteAdvantage(UUID advantageId) {
		return false;
	}

	@Override
	public HashMap<UUID, List<AdvantageData>> getAdvantageData() {
		return null;
	}

	@Override
	public HashMap<String, ConfigAdvantage> getConfigAdvantage() {
		return null;
	}

	@Override
	public Optional<ConfigAdvantage> getConfigAdvanges(String type) {
		return Optional.empty();
	}	

	@Override
	public String translate(TranslatableKey trans, String object, String... args) {
		return null;
	}
	
	@Override
	@Deprecated
	public String translateOutReference(String key, String object, String... args) {
		return null;
	}
	
	@Override
	public String translateWithFindKey(AdvantageList type, String object) {
		return null;
	}
	
	@Override
	public Optional<TranslatableKey> findTranslateType(AdvantageList type) {
		return Optional.empty();
	}

	@Override
	public void checkAllOutpostInteractions() {
		
	}

	@Override
	public void checkoutpostInteractions(UUID outpostUUID) {
		
	}

	@Override
	public Optional<InteractionsData> getInteractionsOutpostByType(UUID outpostUUID, String type) {
		return Optional.empty();
	}

	@Override
	public List<InteractionsData> getAllOutpostInteractions(UUID outpostUUID) {
		return null;
	}

	@Override
	public void deleteAllOutpostInteractions(UUID outpostUUID) {
		
	}

	@Override
	public boolean updateInteractionsOutpost(UUID outpostUUID, InteractionsData Interactions) {
		return false;
	}

	@Override
	public boolean deleteInteractions(UUID InteractionsId) {
		return false;
	}

	@Override
	public HashMap<UUID, List<InteractionsData>> getInteractionsData() {
		return null;
	}

	@Override
	public HashMap<String, ConfigInteractions> getConfigInteractions() {
		return null;
	}

	@Override
	public Optional<ConfigInteractions> getConfigInteractions(String type) {
		return Optional.empty();
	}

}
