package me.ulrich.outpost.data;

public class OutpostEnum {

	public enum OutpostLangs{
		EN;
	}
	
	public enum OutpostSchedulerError{
		MINPLAYER;
	}
	
	public enum CmdType{
		CAPTURE, ENABLE, DISABLE, ABANDON;
	}
	
	public enum OutpostExtensions {
		BetterTeams, 
		CMI, 
		DecentHolograms, 
		FactionsUUID, 
		Holograms, 
		HolographicDisplays, 
		SimpleClans, 
		TAB, 
		UltimateClans, 
		UltimateClansLite,
		IridiumSkyblock,
		MedievalFactions,
		AnimatedScoreboard,
		SuperiorSkyblock2,
		Lands,
		SternalBoard,
		GangsPlus,
		SaberFactions,
		FeatherBoard,
		KingdomsX,
		TownyAdvanced;
	}
	
	public enum ExtensionsReturn {
		ERROR_REPO, ALREADY_UPDATED, ERROR_DOWNLOAD, SUCCESS_DOWNLOAD, ALREADY_EXISTS, NEED_RELOAD_ADDONS, GENERAL_ERROR
		
		
	}
	
	public enum MsgUsage{
		help, usage, error, success;
	}
	
	public enum ChatDataType {
		ADDOUTPOSTCOMMAND, 
		COMMANDUNKNOWNPLAYER, 
		COMMANDUNKNOWNADMIN, 
		SENDOUTPOSTINSIDEENTER, 
		SENDOUTPOSTOUTSIDEENTER, 
		SENDPRECAPTURE,
		SENDLOSINGCAPTURE,
		SENDOUTPOSTCAPTURE, 
		SENDOUTPOSTCAPTUREALL, 
		ADDOUTPOSTSTATS, 
		SENDOUTPOSTCREATE;
	}
	
	public enum ProximityType{
		BLOCKS, WORLD, DISABLED, ALLWORLDS;
	}

	
	public enum HoloPreference{
		ANY, CMI, HOLOGRAPHICDISPLAYS, HOLOGRAMS, DECENTHOLOGRAMS;
	}
	
	public enum GroupPreference{
		ANY, ULTIMATECLANS;
	}
	
	public enum ScoreboardPreference{
		ANY, TAB;
	}
	
	public enum MoneyType{
		VAULT, PLAYERPOINTS, CLANSOULS, TOKENENCHANT, DISABLED, CLANBANK;
	}

	
	public enum MovementWay {
		MOVE, TELEPORT, SPAWN, DISCONNECT, CHANGEWORLD, CHANGEREGION;
	}
	
	public enum CubLoc {
		DENTRO, FORA;
	}
	
	public enum EventFrequency{
		DAILY, WEEKLY, MONTHLY;
	}
	
	public enum SchedulerFlag{
		MINPLAYERS;
	}
	
	public enum EndAction{
		END, CREATEBORDER;
	}
	
	public enum BorderColors{
		RED, GREEN, BLUE;
	}
	
	public enum LootType{
		KEY, DROP, INV, DISABLED;
	}
	
	public enum TopType{
		TOPPLAYER, TOPGROUP;
	}
	
	public enum TopFind{
		NAME, AMOUNT;
	}
	
	public enum TopTime{
		ALL, DAILY, WEEKLY, MONTHLY, YEARLY,
	}
	
}
