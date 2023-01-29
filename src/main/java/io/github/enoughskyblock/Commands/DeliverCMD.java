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
    if(cmd.getName().equalsIgnoreCase("deliverhelm")){
      player.sendMessage("Delivering" + ChatColor.GRAY + "Dctr's Space Helm...");
      player.getInventory ().addItem(spacehelm);
    }
    if(cmd.getName().equalsIgnoreCase("deliverkloonboat")){
      player.sendMessage("Delivering" + ChatColor.GRAY + "Kloonboat...");
      player.getInventory ().addItem(kloonboat);
    }
    if(cmd.getName().equalsIgnoreCase("deliverbuilderclay")){
      player.sendMessage("Delivering" + ChatColor.GRAY + "The Builder's Clay...");
      player.getInventory ().addItem(builderclay);
    }
    if(cmd.getName().equalsIgnoreCase("delivercreativemind")){
      player.sendMessage("Delivering" + ChatColor.GRAY + "A Creative Mind...");
      player.getInventory ().addItem(creativemind);
    }
    return true;
  }
}