package com.teambw.bwcore.common;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "bwcore", name = "BWCore", version = "1.7.10-1.0")
public class BWCore {

    @Mod.Instance(value = "bwcore")
    public static BWCore instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {

        FMLLog.info("Pre Init Complete.");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {

        FMLLog.info("Init Complete.");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {

        FMLLog.info("Post Init Complete.");
    }
}
