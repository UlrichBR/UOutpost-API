package me.ulrich.outpost.interfaces;

import java.util.EnumMap;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import me.ulrich.outpost.Outpost;
import me.ulrich.outpost.data.Flag;

public interface OutpostCommand {

    boolean execute(final Outpost plugin, final CommandSender sender, final Command command, final String label, String[] args, EnumMap<Flag, String> info);

}
