package io.github.enoughskyblock;

import io.github.enoughskyblock.Commands.Commands;
import io.github.enoughskyblock.GUI.ItemGUI;
import io.github.enoughskyblock.ItemCreator.ItemsCreator;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class EnoughSkyblock extends JavaPlugin{
  private static EnoughSkyblock instance;
  FileConfiguration config = getConfig ();
  public int spaceHelmEditionNumber;
  public int builderClayEditionNumber;
  public int elevatorEditionNumber;
  public int kloonBoatEditionNumber;

  public static EnoughSkyblock getInstance() {
    return EnoughSkyblock.instance;
  }
  @Override
  public void onEnable() {

    EnoughSkyblock.instance = this;
    ItemsCreator.init();

    config.addDefault ("spaceHelmEdition", 1);
    config.options ().copyDefaults (true);
    this.saveConfig ();
    spaceHelmEditionNumber = config.getInt ("spaceHelmEdition");

    config.addDefault ("builderClayEdition", 1);
    config.options ().copyDefaults (true);
    this.saveConfig ();
    builderClayEditionNumber = config.getInt ("builderClayEdition");

    config.addDefault ("elevatorEdition", 1);
    config.options ().copyDefaults (true);
    this.saveConfig ();
    elevatorEditionNumber = config.getInt ("elevatorEdition");

    config.addDefault ("kloonBoatEdition", 1);
    config.options ().copyDefaults (true);
    this.saveConfig ();
    kloonBoatEditionNumber = config.getInt ("kloonBoatEdition");

    Commands commands = new Commands ();
    ItemGUI eclass = new ItemGUI ();
    getCommand("aic").setExecutor(commands);
    getCommand("spacehelm").setExecutor (commands);
    getCommand("builderclay").setExecutor (commands);
    getCommand("ancelev").setExecutor (commands);
    getCommand("yearcake").setExecutor (commands);
    getCommand("kloonboat").setExecutor (commands);

    getServer().getPluginManager().registerEvents(new ItemsCreator (), this);
    getServer().getPluginManager().registerEvents(new ItemGUI (), this);

  }

  @Override
  public void onDisable() {
      config.set ("spaceHelmEdition", spaceHelmEditionNumber);
      saveConfig ();
    instance = null;
    config.set ("builderClayEdition", builderClayEditionNumber);
    saveConfig ();
    instance = null;
    config.set ("elevatorEdition", elevatorEditionNumber);
    saveConfig ();
    instance = null;
    config.set ("kloonBoatEdition", kloonBoatEditionNumber);
    saveConfig ();
    instance = null;


  }
}
