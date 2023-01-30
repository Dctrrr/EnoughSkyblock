package io.github.enoughskyblock;

import io.github.enoughskyblock.Commands.EnoughCommands;
import io.github.enoughskyblock.GUI.EnoughGUI;
import io.github.enoughskyblock.ItemCreator.EnoughItems;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class EnoughSkyblock extends JavaPlugin{
  private static EnoughSkyblock instance;
  FileConfiguration config = getConfig ();
  public int editionNumber;

  public static EnoughSkyblock getInstance() {
    return EnoughSkyblock.instance;
  }
  @Override
  public void onEnable() {

    EnoughSkyblock.instance = this;
    EnoughItems.init();

    config.addDefault ("editionNumber", 1);
    config.options ().copyDefaults (true);
    this.saveConfig ();
    editionNumber = config.getInt ("editionNumber");

    EnoughCommands commands = new EnoughCommands();
    EnoughGUI eclass = new EnoughGUI ();
    getCommand("aic").setExecutor(commands);
    getCommand("spacehelm").setExecutor (commands);
    getCommand("builderclay").setExecutor (commands);
    getCommand("ancelev").setExecutor (commands);
    getCommand("yearcake").setExecutor (commands);
    getCommand("kloonboat").setExecutor (commands);

    getServer().getPluginManager().registerEvents(new EnoughItems (), this);
    getServer().getPluginManager().registerEvents(new EnoughGUI (), this);

  }

  @Override
  public void onDisable() {
      config.set ("editionNumber", editionNumber);
      saveConfig ();
      instance = null;
  }
}
