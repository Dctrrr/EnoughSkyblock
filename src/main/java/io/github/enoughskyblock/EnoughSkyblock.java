package io.github.enoughskyblock;

import io.github.enoughskyblock.Commands.EnoughCommands;
import io.github.enoughskyblock.GUI.EnoughGUI;
import io.github.enoughskyblock.ItemCreator.EnoughItems;
import org.bukkit.plugin.java.JavaPlugin;

public class EnoughSkyblock extends JavaPlugin{
  private static EnoughSkyblock instance;

  public static EnoughSkyblock getInstance() {
    return EnoughSkyblock.instance;
  }
  @Override
  public void onEnable() {

    EnoughSkyblock.instance = this;
    EnoughItems.init();

    EnoughCommands commands = new EnoughCommands();
    EnoughGUI eclass = new EnoughGUI ();
    getCommand("aic").setExecutor(commands);
    getCommand("deliverhelm").setExecutor(commands);
    getCommand("deliverkloonboat").setExecutor(commands);
    getCommand("deliverbuilderclay").setExecutor(commands);
    getCommand("delivercreativemind").setExecutor(commands);

    getServer().getPluginManager().registerEvents(new EnoughItems (), this);
    getServer().getPluginManager().registerEvents(new EnoughGUI (), this);

  }

  @Override
  public void onDisable() {

  }
}
