//package me.Adamki11s.Example; //Your package
package com.MoofIT.Minecraft.Tutorial;

import java.util.logging.Logger;
import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
//Any other imports can go here

/* Example Template
 * By Adamki11s
 * HUGE Plugin Tutorial
 * http://wiki.bukkit.org/HUGE_Plugin_Tutorial
 */


public class Example extends JavaPlugin {

    //ClassListeners
	private final ExampleBlockListener blockListener = new ExampleBlockListener(this);
    //ClassListeners

	Logger log = Logger.getLogger("Minecraft");//Define your logger

	public void onDisable() {
		log.info("Disabled message here, shown in console on startup");
	}

	public void onEnable() {
        PluginManager pm = this.getServer().getPluginManager();
        
        pm.registerEvent(Event.Type.BLOCK_PLACE, blockListener, Event.Priority.Normal, this);
	}
}