package io.github.enoughskyblock.ItemCreator;

import io.github.enoughskyblock.EnoughSkyblock;
import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.event.block.Action;

import java.util.*;

public class EnoughItems implements Listener {

  public static ItemStack spacehelm;
  public static ItemStack builderclay;
  public static ItemStack kloonboat;
  public static ItemStack creativemind;
  private final EnoughSkyblock plugin = EnoughSkyblock.getInstance ();
  public int i;

  public static void init () {
    createSpaceHelm ();
    createBuilderClay ();
    createKloonBoat ();
    createCreativeMind();

  }

  private static void createSpaceHelm () {
    ItemStack item = new ItemStack (Material.RED_STAINED_GLASS, 1);
    ItemMeta meta = item.getItemMeta ();
    meta.setUnbreakable (true);
    meta.setDisplayName (ChatColor.RED + "Dctr's Space Helmet");
    ArrayList <String> lore = new ArrayList <String> ();
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "A rare space helmet forged ");
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "from shards of moon glass.");
    lore.add ("");
    lore.add (ChatColor.RESET + "" + ChatColor.GRAY + "To: " + ChatColor.GRAY + "null ");
    lore.add (ChatColor.RESET + "" + ChatColor.GRAY + "From: " + ChatColor.GRAY + "null");
    lore.add ("");
    lore.add (ChatColor.DARK_GRAY + "#null");
    lore.add (ChatColor.DARK_GRAY + "null");
    lore.add ("");
    lore.add (ChatColor.RESET + "" + ChatColor.GRAY + "Obtained through /aic");
    lore.add ("");
    lore.add (ChatColor.RED + "" + ChatColor.BOLD + "" + ChatColor.BOLD + "SPECIAL ADMIN HELMET");

    meta.setLore (lore);
    item.setItemMeta (meta);
    spacehelm = item;
  }

  private static void createBuilderClay () {
    ItemStack item = new ItemStack (Material.RED_TERRACOTTA, 1);
    ItemMeta meta = item.getItemMeta ();
    meta.setUnbreakable (true);
    meta.setDisplayName (ChatColor.RED + "The Builder's Clay");
    ArrayList <String> lore = new ArrayList <String> ();
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "A block that was used to build ");
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "the world around you.");
    lore.add ("");
    lore.add (ChatColor.RESET + "" + ChatColor.GRAY + "To: " + ChatColor.GRAY + "null ");
    lore.add (ChatColor.RESET + "" + ChatColor.GRAY + "From: " + ChatColor.GRAY + "null");
    lore.add ("");
    lore.add (ChatColor.DARK_GRAY + "#null");
    lore.add (ChatColor.DARK_GRAY + "null");
    lore.add ("");
    lore.add (ChatColor.RESET + "" + ChatColor.GRAY + "Obtained through /aic");
    lore.add ("");
    lore.add (ChatColor.RED + "" + ChatColor.BOLD + "" + ChatColor.BOLD + "SPECIAL ADMIN HELMET");

    meta.setLore (lore);
    item.setItemMeta (meta);
    builderclay = item;
  }

  private static void createKloonBoat () {
    ItemStack item = new ItemStack (Material.OAK_BOAT, 1);
    ItemMeta meta = item.getItemMeta ();
    meta.setUnbreakable (true);
    meta.setDisplayName (ChatColor.RED + "Kloonboat");
    ArrayList <String> lore = new ArrayList <String> ();
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "Drop this item to decrease your fps. ");
    lore.add ("");
    lore.add (ChatColor.RESET + "" + ChatColor.GRAY + "To: " + ChatColor.GRAY + "null ");
    lore.add (ChatColor.RESET + "" + ChatColor.GRAY + "From: " + ChatColor.GRAY + "null");
    lore.add ("");
    lore.add (ChatColor.DARK_GRAY + "#null");
    lore.add (ChatColor.DARK_GRAY + "null");
    lore.add ("");
    lore.add (ChatColor.RESET + "" + ChatColor.GRAY + "Obtained through /aic");
    lore.add ("");
    lore.add (ChatColor.RED + "" + ChatColor.BOLD + "" + ChatColor.BOLD + "SPECIAL ADMIN HELMET");

    meta.setLore (lore);
    item.setItemMeta (meta);
    kloonboat = item;
  }
  private static void createCreativeMind () {
    ItemStack item = new ItemStack (Material.PAINTING, 1);
    ItemMeta meta = item.getItemMeta ();
    item.addEnchantment ((item.getType() == Material.PAINTING) ? Enchantment.DAMAGE_ALL : Enchantment.DIG_SPEED,1);
    meta.setUnbreakable (true);
    meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
    meta.setDisplayName (ChatColor.RED + "Creative Mind");
    ArrayList <String> lore = new ArrayList <String> ();
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "Original, visionary, inventive ");
    lore.add ("");
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "and innovative I would even add ");
    lore.add ("");
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "ingenious, clever! A masterpiece!");
    lore.add ("");
    lore.add (ChatColor.RESET + "" + ChatColor.GRAY + "To: " + ChatColor.GRAY + "null ");
    lore.add (ChatColor.RESET + "" + ChatColor.GRAY + "From: " + ChatColor.GRAY + "null");
    lore.add ("");
    lore.add (ChatColor.DARK_GRAY + "#null");
    lore.add (ChatColor.DARK_GRAY + "null");
    lore.add ("");
    lore.add (ChatColor.RESET + "" + ChatColor.GRAY + "Obtained through /aic");
    lore.add ("");
    lore.add (ChatColor.RED + "" + ChatColor.BOLD + "" + ChatColor.BOLD + "SPECIAL ADMIN HELMET");

    meta.setLore (lore);
    item.setItemMeta (meta);
    creativemind = item;
  }

  @EventHandler public void OnRightClick (PlayerInteractEvent e) {

    Player p = e.getPlayer ();
    World w = p.getWorld ();

    //KloonBoat Event Listener
    if (e.getAction ().equals (Action.RIGHT_CLICK_BLOCK)) {
      if (p.getInventory ().getItemInMainHand ().equals ("Kloonboat") ||
        p.getInventory ().getItemInMainHand ().equals (kloonboat)) {
        init ();
        if (e.getAction ().equals (Action.RIGHT_CLICK_BLOCK)) {
          e.setCancelled (true);
        }
      }
    }

    //CreativeMind Event Listener
    if (e.getAction ().equals (Action.RIGHT_CLICK_BLOCK)) {
      if (p.getInventory ().getItemInMainHand ().equals ("Creative Mind") ||
        p.getInventory ().getItemInMainHand ().equals (creativemind)) {
        init ();
        if (e.getAction ().equals (Action.RIGHT_CLICK_BLOCK)) {
          e.setCancelled (true);
        }
      }
    }

    // Builders Clay Event Listener
    if (e.getAction ().equals (Action.RIGHT_CLICK_AIR)) {
      if (p.getInventory ().getItemInMainHand ().equals ("The Builder's Clay") ||
        p.getInventory ().getItemInMainHand ().equals (builderclay)) {
        init ();
        p.getEquipment ().setHelmet (builderclay);
        p
          .getInventory ()
          .getItemInMainHand ()
          .setAmount (p.getInventory ().getItemInMainHand ().getAmount () - 1);
        if (e.getAction ().equals (Action.RIGHT_CLICK_BLOCK)) {
          e.setCancelled (true);
        }
      }
    }

    // Space Helmet Event Listener
    List <Material> materials = Arrays.asList (
      Material.RED_STAINED_GLASS,
      Material.GREEN_STAINED_GLASS,
      Material.BLUE_STAINED_GLASS,
      Material.CYAN_STAINED_GLASS,
      Material.LIGHT_BLUE_STAINED_GLASS,
      Material.ORANGE_STAINED_GLASS
    );
    if (e.getAction ().equals (Action.RIGHT_CLICK_AIR)) {
      if (p.getInventory ().getItemInMainHand ().equals ("Dctr's Space Helmet") ||
        p.getInventory ().getItemInMainHand ().equals (spacehelm)) {
        init ();

        p.getEquipment ().setHelmet (spacehelm);
        p
          .getInventory ()
          .getItemInMainHand ()
          .setAmount (p.getInventory ().getItemInMainHand ().getAmount () - 1);
      }
    }
    Random random = new Random ();
    if (p.getEquipment ().getHelmet ().equals ("Dctr's Space Helmet") ||
      p.getEquipment ().getHelmet ().equals (spacehelm)) {

      i = Bukkit.getServer ().getScheduler ().scheduleSyncRepeatingTask (plugin, new Runnable () {
        @Override public void run () {
          int i = random.nextInt (7);
          Material randomMat = materials.get (random.nextInt (materials.size ()));
          p.getEquipment ().setHelmet (new ItemStack (randomMat));
          if (p.getEquipment ().getHelmet ().getType ().equals (Material.AIR)) {

            Bukkit.getServer ().getScheduler ().cancelTasks (plugin);
          }
        }
      }, 0L, 5L);
    }
  }


  @EventHandler public void onSpaceHelmClick (InventoryClickEvent e1) {

    if (e1.getRawSlot () == 5 && e1.getCurrentItem ().getType () == (Material.RED_STAINED_GLASS) ||
      e1.getCurrentItem ().getType () == (Material.GREEN_STAINED_GLASS) ||
      e1.getCurrentItem ().getType () == (Material.BLUE_STAINED_GLASS) ||
      e1.getCurrentItem ().getType () == (Material.CYAN_STAINED_GLASS) ||
      e1.getCurrentItem ().getType () == (Material.LIGHT_BLUE_STAINED_GLASS) ||
      e1.getCurrentItem ().getType () == (Material.ORANGE_STAINED_GLASS)) {
      e1.setCurrentItem (spacehelm);
      if (e1.getAction ().equals (Action.RIGHT_CLICK_BLOCK)) {
        e1.setCancelled (true);

        Bukkit.getServer ().getScheduler ().cancelTask (i);
      }
    }
  }

  @EventHandler public void onItemDrop (PlayerDropItemEvent event) {
    if (event.getItemDrop ().getItemStack ().getType () == Material.RED_STAINED_GLASS)
      event.setCancelled (true);
    if (event.getItemDrop ().getItemStack ().getType () == Material.GREEN_STAINED_GLASS)
      event.setCancelled (true);
    if (event.getItemDrop ().getItemStack ().getType () == Material.BLUE_STAINED_GLASS)
      event.setCancelled (true);
    if (event.getItemDrop ().getItemStack ().getType () == Material.CYAN_STAINED_GLASS)
      event.setCancelled (true);
    if (event.getItemDrop ().getItemStack ().getType () == Material.LIGHT_BLUE_STAINED_GLASS)
      event.setCancelled (true);
    if (event.getItemDrop ().getItemStack ().getType () == Material.ORANGE_STAINED_GLASS)
      event.setCancelled (true);
    if (event.getItemDrop ().getItemStack ().getType () == Material.RED_TERRACOTTA)
      event.setCancelled (true);
    if (event.getItemDrop ().getItemStack ().getType () == Material.OAK_BOAT)
      event.setCancelled (true);
    if (event.getItemDrop ().getItemStack ().getType () == Material.OAK_BOAT)
      event.setCancelled (true);
  }
}

