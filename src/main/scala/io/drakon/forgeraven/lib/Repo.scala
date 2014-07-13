package io.drakon.forgeraven.lib

import net.kencochrane.raven.Raven
import org.apache.logging.log4j.LogManager

/**
 * Various things to be shared across the mod.
 * 
 * @author Arkan
 */
object Repo {
  
  final val MOD_ID = "ForgeRaven"
  final val MOD_NAME = "ForgeRaven"
  final val MOD_VERSION = "@VERSION@"

  final val logger = LogManager.getLogger(MOD_ID)

  var config:Config = null
  var raven:Raven = null

}
