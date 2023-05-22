package me.ulrich.outpost.data;

import me.ulrich.outpost.data.OutpostEnum.CubLoc;

public class CubRegionLoc {

	private CubLoc loc;
	private OutpostData koth;

	public CubRegionLoc(CubLoc loc, OutpostData koth) {
		this.setLoc(loc);
		this.setOutpost(koth);
	}

	public CubLoc getLoc() {
		return loc;
	}

	public void setLoc(CubLoc loc) {
		this.loc = loc;
	}

	public OutpostData getOutpost() {
		return koth;
	}

	public void setOutpost(OutpostData koth) {
		this.koth = koth;
	}
}
