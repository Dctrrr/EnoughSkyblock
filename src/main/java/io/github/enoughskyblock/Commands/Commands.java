package io.github.enoughskyblock.Commands;

import io.github.enoughskyblock.GUI.ItemGUI;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;

public class Commands implements CommandExecutor{

  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String s, String[] strings) {

    Player player = (Player) sender;
    if(cmd.getName().equalsIgnoreCase("aic")){
      player.sendMessage("Opening catalogue..." + ChatColor.GRAY + "Skyblock Admin Item's Catalogue");
      ItemGUI eclass = new ItemGUI ();
      player.openInventory(ItemGUI.inv);
    }
    return true;
  }
}