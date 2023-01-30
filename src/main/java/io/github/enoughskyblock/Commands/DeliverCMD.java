package io.github.enoughskyblock.Commands;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;

import static io.github.enoughskyblock.ItemCreator.EnoughItems.builderclay;
import static io.github.enoughskyblock.ItemCreator.EnoughItems.creativemind;
import static io.github.enoughskyblock.ItemCreator.EnoughItems.kloonboat;
import static io.github.enoughskyblock.ItemCreator.EnoughItems.spacehelm;

public class DeliverCMD implements CommandExecutor{

  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String s, String[] strings) {

    Player player = (Player) sender;
  sender.sendMessage(ChatColor.RED + "Coming Soon!");
    return true;
  }
}