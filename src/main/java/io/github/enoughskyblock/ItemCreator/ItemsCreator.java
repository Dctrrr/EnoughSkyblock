package io.github.enoughskyblock.ItemCreator;

import io.github.enoughskyblock.EnoughSkyblock;
import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.event.block.Action;

import java.util.*;

public class ItemsCreator implements Listener {

  public static ItemStack spacehelm;
  public static ItemStack builderclay;
  public static ItemStack kloonboat;
  public static ItemStack creativemind;
  public static ItemStack gamebreaker;
  public static ItemStack newyearcake;
  public static ItemStack gamefixer;
  public static ItemStack qualitymap;
  public static ItemStack bushoflove;
  public static ItemStack ancelevator;
  public static ItemStack piopick;
  public static ItemStack frenchbead;
  private final EnoughSkyblock plugin = EnoughSkyblock.getInstance ();
  public int i;

  public static void init () {
    createSpaceHelm ();
    createBuilderClay ();
    createKloonBoat ();
    createCreativeMind ();
    createGameBreaker ();
    createNewYearCake ();
    createGameFixer ();
    createQualityMap ();
    createBushOfLove ();
    createAncelevator ();
    createPioPick ();
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
    lore.add (ChatColor.ITALIC + "" + ChatColor.GRAY + "* Obtained through creative menu *");
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
    lore.add (ChatColor.ITALIC + "" + ChatColor.GRAY + "* Obtained through creative menu *");
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
    lore.add (ChatColor.ITALIC + "" + ChatColor.GRAY + "* Obtained through creative menu *");
    lore.add ("");
    lore.add (ChatColor.RED + "" + ChatColor.BOLD + "" + ChatColor.BOLD + "SPECIAL ADMIN ITEM");

    meta.setLore (lore);
    item.setItemMeta (meta);
    kloonboat = item;
  }

  private static void createCreativeMind () {
    ItemStack item = new ItemStack (Material.PAINTING, 1);
    ItemMeta meta = item.getItemMeta ();
    meta.addEnchant (Enchantment.DAMAGE_ALL, 1, true);
    meta.setUnbreakable (true);
    meta.addItemFlags (ItemFlag.HIDE_ENCHANTS);
    meta.addItemFlags (ItemFlag.HIDE_ATTRIBUTES);
    meta.setDisplayName (ChatColor.RED + "Creative Mind");
    ArrayList <String> lore = new ArrayList <String> ();
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "Original, visionary, inventive ");
    lore.add ("");
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "and innovative I would even add ");
    lore.add ("");
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "ingenious, clever! A masterpiece!");
    lore.add ("");
    lore.add (ChatColor.ITALIC + "" + ChatColor.GRAY + "* Obtained through creative menu *");
    lore.add ("");
    lore.add (ChatColor.RED + "" + ChatColor.BOLD + "" + ChatColor.BOLD + "SPECIAL ADMIN ITEM");

    meta.setLore (lore);
    item.setItemMeta (meta);
    creativemind = item;
  }

  private static void createGameBreaker () {
    ItemStack item = new ItemStack (Material.TNT, 1);
    ItemMeta meta = item.getItemMeta ();
    meta.addEnchant (Enchantment.DAMAGE_ALL, 1, true);
    meta.setUnbreakable (true);
    meta.addItemFlags (ItemFlag.HIDE_ENCHANTS);
    meta.addItemFlags (ItemFlag.HIDE_ATTRIBUTES);
    meta.setDisplayName (ChatColor.RED + "Game Breaker");
    ArrayList <String> lore = new ArrayList <String> ();
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "This item was given to a player ");
    lore.add ("");
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "who reported a game breaking ");
    lore.add ("");
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "exploit. What a guy!");
    lore.add ("");
    lore.add (ChatColor.ITALIC + "" + ChatColor.GRAY + "* Obtained through creative menu *");
    lore.add ("");
    lore.add (ChatColor.RED + "" + ChatColor.BOLD + "" + ChatColor.BOLD + "SPECIAL ADMIN ITEM");

    meta.setLore (lore);
    item.setItemMeta (meta);
    gamebreaker = item;
  }

  private static void createNewYearCake () {
    ItemStack item = new ItemStack (Material.CAKE, 1);
    ItemMeta meta = item.getItemMeta ();
    meta.addEnchant (Enchantment.DAMAGE_ALL, 1, true);
    meta.setUnbreakable (true);
    meta.addItemFlags (ItemFlag.HIDE_ENCHANTS);
    meta.addItemFlags (ItemFlag.HIDE_ATTRIBUTES);
    meta.setDisplayName (ChatColor.RED + "New Year Cake (Year [null])");
    ArrayList <String> lore = new ArrayList <String> ();
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "Given to every player as a ");
    lore.add ("");
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "celebration for the year [null] ");
    lore.add ("");
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "SkyBlock year.");
    lore.add ("");
    lore.add (ChatColor.ITALIC + "" + ChatColor.GRAY + "* Obtained through creative menu *");
    lore.add ("");
    lore.add (ChatColor.RED + "" + ChatColor.BOLD + "" + ChatColor.BOLD + "SPECIAL ADMIN ITEM");

    meta.setLore (lore);
    item.setItemMeta (meta);
    newyearcake = item;
  }

  private static void createGameFixer () {
    ItemStack item = new ItemStack (Material.WOODEN_PICKAXE, 1);
    ItemMeta meta = item.getItemMeta ();
    meta.addEnchant (Enchantment.DIG_SPEED, 1800, true);
    meta.setUnbreakable (true);
    meta.addItemFlags (ItemFlag.HIDE_ENCHANTS);
    meta.addItemFlags (ItemFlag.HIDE_ATTRIBUTES);
    meta.setDisplayName (ChatColor.RED + "Game Fixer");
    ArrayList <String> lore = new ArrayList <String> ();
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "Given to individuals who broke ");
    lore.add ("");
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "the game too many times. Thanks ");
    lore.add ("");
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "for your great help!");
    lore.add ("");
    lore.add (ChatColor.ITALIC + "" + ChatColor.GRAY + "* Obtained through creative menu *");
    lore.add ("");
    lore.add (ChatColor.RED + "" + ChatColor.BOLD + "" + ChatColor.BOLD + "SPECIAL ADMIN ITEM");

    meta.setLore (lore);
    item.setItemMeta (meta);
    gamefixer = item;
  }

  private static void createQualityMap () {
    ItemStack item = new ItemStack (Material.MAP, 1);
    ItemMeta meta = item.getItemMeta ();
    meta.addEnchant (Enchantment.DAMAGE_ALL, 1, true);
    meta.setUnbreakable (true);
    meta.addItemFlags (ItemFlag.HIDE_ENCHANTS);
    meta.addItemFlags (ItemFlag.HIDE_ATTRIBUTES);
    meta.setDisplayName (ChatColor.RED + "Quality Map");
    ArrayList <String> lore = new ArrayList <String> ();
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "It took motivation, skills, effort ");
    lore.add ("");
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "and a lot of love and caring to ");
    lore.add ("");
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "create this map. By far the best ");
    lore.add ("");
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "quality in the market.");
    lore.add ("");
    lore.add (ChatColor.ITALIC + "" + ChatColor.GRAY + "* Obtained through creative menu *");
    lore.add ("");
    lore.add (ChatColor.RED + "" + ChatColor.BOLD + "" + ChatColor.BOLD + "SPECIAL ADMIN ITEM");

    meta.setLore (lore);
    item.setItemMeta (meta);
    qualitymap = item;
  }

  private static void createBushOfLove () {
    ItemStack item = new ItemStack (Material.DEAD_BUSH, 1);
    ItemMeta meta = item.getItemMeta ();
    meta.addEnchant (Enchantment.DAMAGE_ALL, 1, true);
    meta.setUnbreakable (true);
    meta.addItemFlags (ItemFlag.HIDE_ENCHANTS);
    meta.addItemFlags (ItemFlag.HIDE_ATTRIBUTES);
    meta.setDisplayName (ChatColor.RED + "Dead Bush Of Love");
    ArrayList <String> lore = new ArrayList <String> ();
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "This item was given to the kind ");
    lore.add ("");
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "souls who helped so ");
    lore.add ("");
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "much testing SkyBlock. Much Love!");
    lore.add ("");
    lore.add (ChatColor.ITALIC + "" + ChatColor.GRAY + "* Obtained through creative menu *");
    lore.add ("");
    lore.add (ChatColor.RED + "" + ChatColor.BOLD + "" + ChatColor.BOLD + "SPECIAL ADMIN ITEM");

    meta.setLore (lore);
    item.setItemMeta (meta);
    bushoflove = item;
  }

  private static void createAncelevator () {
    ItemStack item = new ItemStack (Material.QUARTZ_STAIRS, 1);
    ItemMeta meta = item.getItemMeta ();
    meta.addEnchant (Enchantment.DAMAGE_ALL, 1, true);
    meta.setUnbreakable (true);
    meta.addItemFlags (ItemFlag.HIDE_ENCHANTS);
    meta.addItemFlags (ItemFlag.HIDE_ATTRIBUTES);
    meta.setDisplayName (ChatColor.RED + "Ancient Elevator");
    ArrayList <String> lore = new ArrayList <String> ();
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "Maunal Operation.");
    lore.add ("");
    lore.add (ChatColor.RESET + "" + ChatColor.GRAY + "To: " + ChatColor.GRAY + "null ");
    lore.add (ChatColor.RESET + "" + ChatColor.GRAY + "From: " + ChatColor.GRAY + "null");
    lore.add ("");
    lore.add (ChatColor.ITALIC + "" + ChatColor.GRAY + "* Obtained through creative menu *");
    lore.add ("");
    lore.add (ChatColor.RED + "" + ChatColor.BOLD + "" + ChatColor.BOLD + "SPECIAL ADMIN ITEM");

    meta.setLore (lore);
    item.setItemMeta (meta);
    ancelevator = item;
  }

  private static void createPioPick () {
    ItemStack item = new ItemStack (Material.WOODEN_PICKAXE, 1);
    ItemMeta meta = item.getItemMeta ();
    meta.addEnchant (Enchantment.DIG_SPEED, 1500, true);
    meta.setUnbreakable (true);
    meta.addItemFlags (ItemFlag.HIDE_ENCHANTS);
    meta.addItemFlags (ItemFlag.HIDE_ATTRIBUTES);
    meta.setDisplayName (ChatColor.RED + "Pioneer Pickaxe");
    ArrayList <String> lore = new ArrayList <String> ();
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "The very first pickaxe ");
    lore.add ("");
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "model. Invented by the famous ");
    lore.add ("");
    lore.add (ChatColor.GRAY + "" + ChatColor.ITALIC + "Thomas Pickson.");
    lore.add ("");
    lore.add (ChatColor.ITALIC + "" + ChatColor.GRAY + "* Obtained through creative menu *");
    lore.add ("");
    lore.add (ChatColor.RED + "" + ChatColor.BOLD + "" + ChatColor.BOLD + "SPECIAL ADMIN ITEM");

    meta.setLore (lore);
    item.setItemMeta (meta);
    piopick = item;
  }


  @EventHandler public void OnRightClick (PlayerInteractEvent e) {

    Player p = e.getPlayer ();
    World w = p.getWorld ();

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

  @EventHandler public void onBuilderClayClick (InventoryClickEvent e1) {

    if (e1.getCurrentItem ().getType () == (Material.RED_TERRACOTTA)) {
      e1.setCurrentItem (builderclay);
      if (e1.getAction ().equals (Action.RIGHT_CLICK_BLOCK)) {
        e1.setCancelled (true);
        Bukkit.getServer ().getScheduler ().cancelTask (i);
      }
    }
  }

  @EventHandler public void onKloonBoatClick (InventoryClickEvent e1) {

    if (e1.getCurrentItem ().getType () == (Material.OAK_BOAT)) {
      e1.setCurrentItem (kloonboat);
      if (e1.getAction ().equals (Action.RIGHT_CLICK_BLOCK)) {
        e1.setCancelled (true);
        Bukkit.getServer ().getScheduler ().cancelTask (i);
      }
    }
  }

  @EventHandler public void onGameBreakerClick (InventoryClickEvent e1) {

    if (e1.getCurrentItem ().getType () == (Material.TNT)) {
      e1.setCurrentItem (gamebreaker);
      if (e1.getAction ().equals (Action.RIGHT_CLICK_BLOCK)) {
        e1.setCancelled (true);
        Bukkit.getServer ().getScheduler ().cancelTask (i);
      }
    }
  }

  @EventHandler public void onCreativeMindClick (InventoryClickEvent e1) {

    if (e1.getCurrentItem ().getType () == (Material.PAINTING)) {
      e1.setCurrentItem (creativemind);
      if (e1.getAction ().equals (Action.RIGHT_CLICK_BLOCK)) {
        e1.setCancelled (true);
        Bukkit.getServer ().getScheduler ().cancelTask (i);
      }
    }
  }

  @EventHandler public void onNewYearCakeClick (InventoryClickEvent e1) {

    if (e1.getCurrentItem ().getType () == (Material.CAKE)) {
      e1.setCurrentItem (newyearcake);
      if (e1.getAction ().equals (Action.RIGHT_CLICK_BLOCK)) {
        e1.setCancelled (true);
        Bukkit.getServer ().getScheduler ().cancelTask (i);
      }
    }
  }

  @EventHandler public void onQualityMapClick (InventoryClickEvent e1) {

    if (e1.getCurrentItem ().getType () == (Material.MAP)) {
      e1.setCurrentItem (qualitymap);
      if (e1.getAction ().equals (Action.RIGHT_CLICK_BLOCK)) {
        e1.setCancelled (true);
        if (e1.getAction ().equals (Action.RIGHT_CLICK_BLOCK)) {
          e1.setCancelled (true);
        }
        Bukkit.getServer ().getScheduler ().cancelTask (i);
      }
    }
  }

  @EventHandler public void onAncelevatorClick (InventoryClickEvent e1) {

    if (e1.getCurrentItem ().getType () == (Material.QUARTZ_STAIRS)) {
      e1.setCurrentItem (qualitymap);
      if (e1.getAction ().equals (Action.RIGHT_CLICK_BLOCK)) {
        e1.setCancelled (true);
        Bukkit.getServer ().getScheduler ().cancelTask (i);
      }
    }
  }

  @EventHandler public void onBushOfLove (InventoryClickEvent e1) {

    if (e1.getCurrentItem ().getType () == (Material.DEAD_BUSH)) {
      e1.setCurrentItem (qualitymap);
      if (e1.getAction ().equals (Action.RIGHT_CLICK_BLOCK)) {
        e1.setCancelled (true);
        Bukkit.getServer ().getScheduler ().cancelTask (i);
      }
    }
  }
}



