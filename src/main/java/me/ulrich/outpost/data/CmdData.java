package me.ulrich.outpost.data;

import java.util.UUID;

import me.ulrich.outpost.data.OutpostEnum.CmdType;

public class CmdData {


	private CmdType type;
	private String cmd;
	private UUID kothUUID;
	private UUID id;

	public CmdData(UUID id, UUID kothUUID, String cmd, CmdType type) {
		this.setId(id);
		this.setCmd(cmd);
		this.setType(type);
		this.setOutpostUUID(kothUUID);
	}

	public CmdType getType() {
		return type;
	}

	public void setType(CmdType type) {
		this.type = type;
	}

	public UUID getOutpostUUID() {
		return kothUUID;
	}

	public void setOutpostUUID(UUID kothUUID) {
		this.kothUUID = kothUUID;
	}

	public String getCmd() {
		return cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}
}
