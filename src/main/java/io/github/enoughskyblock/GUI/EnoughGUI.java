package io.github.enoughskyblock.GUI;

import io.github.enoughskyblock.ItemCreator.EnoughItems;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public class EnoughGUI implements Listener {

  public static Inventory inv;

  public EnoughGUI () {
    inv = Bukkit.createInventory (null, 9, "Skyblock Admin Item's Catalogue");
    initializeItems ();
  }


  public void initializeItems () {
    inv.addItem (EnoughItems.spacehelm);
    inv.addItem (EnoughItems.kloonboat);
    inv.addItem (EnoughItems.builderclay);
    inv.addItem (EnoughItems.creativemind);
    inv.addItem (EnoughItems.gamebreaker);
    inv.addItem (EnoughItems.gamefixer);
    inv.addItem (EnoughItems.newyearcake);
    inv.addItem (EnoughItems.piopick);
    inv.addItem (EnoughItems.ancelevator);
    inv.addItem (EnoughItems.qualitymap);
    inv.addItem (EnoughItems.bushoflove);
  }

  @EventHandler public void onInventoryClick (InventoryDragEvent e1) {

    if (e1.getInventory ().equals (inv)) {
      e1.setCancelled (true);
    }
  }

  @EventHandler public void onInvClick (InventoryClickEvent e) {
    Player p = (Player) e.getWhoClicked ();

    if (e.getInventory ().equals (inv)) {

    }
    if (e.getCurrentItem ().equals (EnoughItems.spacehelm)) {
      e.setCancelled (true);
      p.getInventory ().addItem (EnoughItems.spacehelm);

    }
    if (e.getCurrentItem ().equals (EnoughItems.kloonboat)) {
      e.setCancelled (true);
      p.getInventory ().addItem (EnoughItems.kloonboat);

    }
    if (e.getCurrentItem ().equals (EnoughItems.builderclay)) {
      e.setCancelled (true);
      p.getInventory ().addItem (EnoughItems.builderclay);

    }
    if (e.getCurrentItem ().equals (EnoughItems.creativemind)) {
      e.setCancelled (true);
      p.getInventory ().addItem (EnoughItems.creativemind);

    }
    if (e.getCurrentItem ().equals (EnoughItems.gamebreaker)) {
      e.setCancelled (true);
      p.getInventory ().addItem (EnoughItems.gamebreaker);

    }
    if (e.getCurrentItem ().equals (EnoughItems.gamefixer)) {
      e.setCancelled (true);
      p.getInventory ().addItem (EnoughItems.gamefixer);

    }
    if (e.getCurrentItem ().equals (EnoughItems.newyearcake)) {
      e.setCancelled (true);
      p.getInventory ().addItem (EnoughItems.newyearcake);

    }
    if (e.getCurrentItem ().equals (EnoughItems.bushoflove)) {
      e.setCancelled (true);
      p.getInventory ().addItem (EnoughItems.bushoflove);

    }
    if (e.getCurrentItem ().equals (EnoughItems.piopick)) {
      e.setCancelled (true);
      p.getInventory ().addItem (EnoughItems.piopick);

    }
    if (e.getCurrentItem ().equals (EnoughItems.ancelevator)) {
      e.setCancelled (true);
      p.getInventory ().addItem (EnoughItems.ancelevator);

    }
    if (e.getCurrentItem ().equals (EnoughItems.qualitymap)) {
      e.setCancelled (true);
      p.getInventory ().addItem (EnoughItems.qualitymap);
    }
  }
}