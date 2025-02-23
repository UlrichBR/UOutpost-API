package me.ulrich.outpost.data;

public class GeneralSettings {

	private boolean allowWithoutGroup;
	private boolean maintenance;
	private boolean expelWithoutRequirements;
	private boolean AbandonInDeath;
	private boolean abandonIfQuit;
	private boolean reloadPersistent;
	private boolean lockCapture;

	public GeneralSettings(boolean allowWithoutGroup, boolean maintenance, boolean expelWithoutRequirements, boolean AbandonInDeath, boolean abandonIfQuit, boolean reloadPersistent, boolean lockCapture) {
		this.setAllowWithoutGroup(allowWithoutGroup);
		this.setExpelWithoutRequirements(expelWithoutRequirements);
		this.setMaintenance(maintenance);
		this.setAbandonInDeath(AbandonInDeath);
		this.setAbandonIfQuit(abandonIfQuit);
		this.setReloadPersistent(reloadPersistent);
		this.setLockCapture(lockCapture);
	}

	public boolean isAllowWithoutGroup() {
		return allowWithoutGroup;
	}

	public void setAllowWithoutGroup(boolean allowWithoutGroup) {
		this.allowWithoutGroup = allowWithoutGroup;
	}

	public boolean isMaintenance() {
		return maintenance;
	}

	public void setMaintenance(boolean maintenance) {
		this.maintenance = maintenance;
	}

	public boolean isExpelWithoutRequirements() {
		return expelWithoutRequirements;
	}

	public void setExpelWithoutRequirements(boolean expelWithoutRequirements) {
		this.expelWithoutRequirements = expelWithoutRequirements;
	}

	public boolean isAbandonInDeath() {
		return AbandonInDeath;
	}

	public void setAbandonInDeath(boolean abandonInDeath) {
		AbandonInDeath = abandonInDeath;
	}

	public boolean isAbandonIfQuit() {
		return abandonIfQuit;
	}

	public void setAbandonIfQuit(boolean abandonIfQuit) {
		this.abandonIfQuit = abandonIfQuit;
	}

	public boolean isReloadPersistent() {
		return reloadPersistent;
	}

	public void setReloadPersistent(boolean reloadPersistent) {
		this.reloadPersistent = reloadPersistent;
	}

	public boolean isLockCapture() {
		return lockCapture;
	}

	public void setLockCapture(boolean lockCapture) {
		this.lockCapture = lockCapture;
	}
}
