package io.drakon.forgeraven.lib

import java.io.File

import com.typesafe.config.ConfigFactory
import org.apache.commons.io.FileUtils

import io.drakon.forgeraven.lib.Repo.logger

/**
 * Configuration handler.
 *
 * @author Arkan
 */
class Config(confFile:File) {

  if (!confFile.exists()) {
    // Copy default config.
    val origin = getClass.getResource("/reference.conf")
    FileUtils.copyURLToFile(origin, confFile)
  }

  private val conf = ConfigFactory.parseFile(confFile)

  val DSN = conf.getString("raven.dsn")

  logger.info(s"Loaded configuration; using DSN '$DSN'")

}
