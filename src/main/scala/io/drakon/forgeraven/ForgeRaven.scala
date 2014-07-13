package io.drakon.forgeraven

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.Mod.EventHandler
import cpw.mods.fml.common.event.{FMLPreInitializationEvent, FMLInitializationEvent, FMLPostInitializationEvent}
import io.drakon.forgeraven.lib.Config

import io.drakon.forgeraven.lib.Repo._
import net.kencochrane.raven.RavenFactory

/**
 * Root mod object.
 *
 * @author Arkan
 */
@Mod(modid = MOD_ID, name = MOD_NAME, version = MOD_VERSION, acceptableRemoteVersions = "*", modLanguage = "scala")
object ForgeRaven {

  @EventHandler
  def preInit(evt:FMLPreInitializationEvent) {
    logger.info(s"$MOD_NAME $MOD_VERSION - Preinitialising...")
    config = new Config(evt.getSuggestedConfigurationFile)
    raven = RavenFactory.ravenInstance(config.DSN)
  }

  @EventHandler
  def init(evt:FMLInitializationEvent) {
    logger.info("Initialialising...")
  }

  @EventHandler
  def postInit(evt:FMLPostInitializationEvent) {
    logger.info("Postinitialising...")
  }

}
