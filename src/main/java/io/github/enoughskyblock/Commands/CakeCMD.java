package io.github.enoughskyblock.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import io.github.enoughskyblock.EnoughSkyblock;

import java.util.Arrays;

import static io.github.enoughskyblock.ItemCreator.ItemsCreator.newyearcake;

public class CakeCMD implements CommandExecutor {
  EnoughSkyblock plugin;

  public CakeCMD (EnoughSkyblock plugin) {
    this.plugin = plugin;
  }

  @Override
  public boolean onCommand (CommandSender sender, Command command, String label, String[] args) {

    if (args.length >= 1) {
      String playerName = args[0];
      Player targetPlayer = Bukkit.getPlayer (playerName);
    }

    if (sender instanceof Player) {
      Player player = (Player) sender;

      if (args.length >= 1) {
        String playerName = args[0];
        player = Bukkit.getPlayer (playerName);
      }

      assert player != null;
      if (player.hasPermission ("skyblock.newyearcake")) {

        ItemStack item = new ItemStack (Material.CAKE, 1);
        ItemMeta meta = item.getItemMeta ();
        meta.setUnbreakable (true);
        meta.setDisplayName (ChatColor.RED + "New Year Cake (Year [null])");

        meta.setLore (Arrays.asList (
       ChatColor.GRAY + "" + ChatColor.ITALIC + "Given to every player as a ",
         " ",
       ChatColor.GRAY + "" + ChatColor.ITALIC + "celebration for the year [null] ",
       " ",
         ChatColor.GRAY + "" + ChatColor.ITALIC + "SkyBlock year.",
         " ",
         ChatColor.RED + "" + ChatColor.BOLD + "SPECIAL ITEM"
            ));

        item.setItemMeta (meta);
        item = newyearcake;
        player.getInventory ().addItem (newyearcake);

        player.sendMessage(ChatColor.RED + ((Player)sender).getName() + " §egave you a§e §cNew Year's Cake§c " + ChatColor.GOLD + "happy new year!");
      }
    }
    return true;
  }
}
