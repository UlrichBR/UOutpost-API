package me.ulrich.outpost.data;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.bukkit.plugin.java.JavaPlugin;

import me.ulrich.outpost.extension.ExtensionClassloader;
import me.ulrich.outpost.extension.ExtensionSerializer;

public abstract class Extension {
	private boolean enabled;
	private ExtensionSerializer dataSerializer;
	private ExtensionSerializer configSerializer;
	private JavaPlugin instance;
	private String name;
	private String author;
	private String version;
	private String require;
	private String description;
	private ExtensionClassloader classLoader;
	private File addonDataFolder;
	private HashMap<String, InputStream> addonFiles;

	public boolean isEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public JavaPlugin getInstance() {
		return this.instance;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ExtensionClassloader getClassLoader() {
		return this.classLoader;
	}

	public void setClassLoader(ExtensionClassloader classLoader) {
		this.classLoader = classLoader;
	}

	public File getAddonDataFolder() {
		return this.addonDataFolder;
	}

	public void enable(JavaPlugin instance, File addonDataFolder, ExtensionSerializer dataSerializer,
			ExtensionSerializer configSerializer) {


	}

	protected boolean logThis(Exception e) {
	

		return false;

	}

	public void disable() {
		if (!isEnabled())
			throw new IllegalStateException("Cannot disable the extension when it isn't enabled");
		onDisable();
		setEnabled(false);
	}

	public abstract void onEnable();

	public abstract void onDisable();

	public ExtensionSerializer getDataSerializer() {
		return this.dataSerializer;
	}

	public ExtensionSerializer getConfigSerializer() {
		return this.configSerializer;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public HashMap<String, InputStream> getAddonFiles() {
		return addonFiles;
	}

	public void setAddonFiles(HashMap<String, InputStream> addonFiles) {
		this.addonFiles = addonFiles;
	}

	public String getRequire() {
		return require;
	}

	public void setRequire(String require) {
		this.require = require;
	}
}

