package io.github.enoughskyblock.GUI;

import io.github.enoughskyblock.ItemCreator.ItemsCreator;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;

public class ItemGUI implements Listener {

  public static Inventory inv;

  public ItemGUI () {
    inv = Bukkit.createInventory (null, 9, "Skyblock Admin Item's Catalogue");
    initializeItems ();
  }


  public void initializeItems () {
    inv.addItem (ItemsCreator.spacehelm);
    inv.addItem (ItemsCreator.kloonboat);
    inv.addItem (ItemsCreator.builderclay);
    inv.addItem (ItemsCreator.creativemind);
    inv.addItem (ItemsCreator.gamebreaker);
    inv.addItem (ItemsCreator.gamefixer);
    inv.addItem (ItemsCreator.newyearcake);
    inv.addItem (ItemsCreator.piopick);
    inv.addItem (ItemsCreator.ancelevator);
    inv.addItem (ItemsCreator.qualitymap);
    inv.addItem (ItemsCreator.bushoflove);
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
    if (e.getCurrentItem ().equals (ItemsCreator.spacehelm)) {
      e.setCancelled (true);
      p.getInventory ().addItem (ItemsCreator.spacehelm);

    }
    if (e.getCurrentItem ().equals (ItemsCreator.kloonboat)) {
      e.setCancelled (true);
      p.getInventory ().addItem (ItemsCreator.kloonboat);

    }
    if (e.getCurrentItem ().equals (ItemsCreator.builderclay)) {
      e.setCancelled (true);
      p.getInventory ().addItem (ItemsCreator.builderclay);

    }
    if (e.getCurrentItem ().equals (ItemsCreator.creativemind)) {
      e.setCancelled (true);
      p.getInventory ().addItem (ItemsCreator.creativemind);

    }
    if (e.getCurrentItem ().equals (ItemsCreator.gamebreaker)) {
      e.setCancelled (true);
      p.getInventory ().addItem (ItemsCreator.gamebreaker);

    }
    if (e.getCurrentItem ().equals (ItemsCreator.gamefixer)) {
      e.setCancelled (true);
      p.getInventory ().addItem (ItemsCreator.gamefixer);

    }
    if (e.getCurrentItem ().equals (ItemsCreator.newyearcake)) {
      e.setCancelled (true);
      p.getInventory ().addItem (ItemsCreator.newyearcake);

    }
    if (e.getCurrentItem ().equals (ItemsCreator.bushoflove)) {
      e.setCancelled (true);
      p.getInventory ().addItem (ItemsCreator.bushoflove);

    }
    if (e.getCurrentItem ().equals (ItemsCreator.piopick)) {
      e.setCancelled (true);
      p.getInventory ().addItem (ItemsCreator.piopick);

    }
    if (e.getCurrentItem ().equals (ItemsCreator.ancelevator)) {
      e.setCancelled (true);
      p.getInventory ().addItem (ItemsCreator.ancelevator);

    }
    if (e.getCurrentItem ().equals (ItemsCreator.qualitymap)) {
      e.setCancelled (true);
      p.getInventory ().addItem (ItemsCreator.qualitymap);
    }
  }
}