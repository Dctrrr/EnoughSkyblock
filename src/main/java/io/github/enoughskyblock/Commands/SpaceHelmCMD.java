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
import java.time.LocalDateTime;
import java.util.Arrays;

import static io.github.enoughskyblock.ItemCreator.ItemsCreator.spacehelm;

public class SpaceHelmCMD implements CommandExecutor {
  private LocalDateTime time = LocalDateTime.now ();
  EnoughSkyblock plugin;

  public SpaceHelmCMD (EnoughSkyblock plugin) {
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
      if (player.hasPermission ("skyblock.spacehelm")) {

        ItemStack item = new ItemStack (Material.RED_STAINED_GLASS, 1);
        ItemMeta meta = item.getItemMeta ();
        meta.setUnbreakable (true);
        meta.setDisplayName (ChatColor.RED + "Dctr's Space Helmet");

        String formattedMonth = time.getMonth ().toString ().toLowerCase ();
        if (formattedMonth.length () > 0)
          formattedMonth =
            formattedMonth.substring (0, 1).toUpperCase () + formattedMonth.substring (1);
        meta.setLore (Arrays.asList (
          ChatColor.RESET + "" + ChatColor.GRAY + ChatColor.ITALIC +
            "A rare space helmet forged",
          ChatColor.RESET + "" + ChatColor.GRAY + ChatColor.ITALIC + "from shards of moon.",
          " ",
          ChatColor.RESET + "" + ChatColor.GRAY + "To: " +
            player.getDisplayName (),
          ChatColor.RESET + "" + ChatColor.GRAY + "From: " +
            ((Player) sender).getDisplayName (),
          " ",
          ChatColor.RESET + "" + ChatColor.DARK_GRAY + "Edition: #" + (plugin.spaceHelmEditionNumber),
          "",
          ChatColor.RESET + "" + ChatColor.DARK_GRAY + "Year: " + formattedMonth + " " +
            time.getYear (),
          " ",
          ChatColor.RED + "" + ChatColor.BOLD + "SPECIAL HELMET"
        ));
        item.setItemMeta (meta);
        item = spacehelm;
        player.getInventory ().addItem (spacehelm);

        player.sendMessage(ChatColor.RED + ((Player)sender).getName() + " §egave you a§e §cDctr's Space Helmet§c " + ChatColor.GOLD + "#" + (plugin.spaceHelmEditionNumber) + ChatColor.GOLD + "!");
        plugin.spaceHelmEditionNumber += 1;
      }
    }
    return true;
  }
}
