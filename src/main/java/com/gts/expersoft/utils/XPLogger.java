package com.gts.expersoft.utils;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * @author id833871
 *
 */
public class XPLogger {

	/**
     *
     */
	private static final Logger LOGGER = Logger.getLogger(XPLogger.class);

	/**
	 * private This is a constructor
	 */
	private XPLogger() {

	}

	/**
	 * log This method of org.apache.log4j.Logger class. calls the log method
	 * static method
	 *
	 * @param Level
	 *            : p
	 * @param Class
	 *            : className
	 * @param String
	 *            : message
	 * @return void
	 */
	@SuppressWarnings("rawtypes")
	private static void log(Level p, Class className, String message) {
		if (useStderr) {
			LOGGER.info(System.currentTimeMillis() + " " + message);

		} else {
			Logger.getLogger(className).log(p, message);
		}
	}

	/**
	 * log method This method calls the log method of org.apache.log4j.Logger
	 * class. static
	 *
	 * @param Level
	 *            : p
	 * @param Class
	 *            : className
	 * @param String
	 *            : message
	 * @param Throwable
	 *            e
	 * @return void
	 */
	@SuppressWarnings("rawtypes")
	private static void log(Level p, Class className, String message,
			Throwable e) {
		if (useStderr) {
			LOGGER.info(System.currentTimeMillis() + " " + message + ":" + e);
		} else {
			Logger.getLogger(className).log(p, message, e);
		}
	}

	/**
	 * debug method This method uses the DEBUG level of Logger. This method is
	 * used for debugging the errors. /n This method logs the DEBUG,INFO,ERROR
	 * level messages. static
	 *
	 * @param Class
	 *            : className
	 * @param String
	 *            : message
	 * @return void
	 */

	@SuppressWarnings("rawtypes")
	public static void debug(Class className, String message) {
		log(Level.DEBUG, className, message);
	}

	/**
	 * info This method uses the INFO level of Logger. This method logs the
	 * INFO,ERROR level messages. static
	 *
	 * @param Class
	 *            : className
	 * @param String
	 *            : message
	 * @return void
	 */

	@SuppressWarnings("rawtypes")
	public static void info(Class className, String message) {
		log(Level.INFO, className, message);
	}

	/**
	 * error method This method uses the ERROR level of Logger. This method logs
	 * the ERROR level messages only. static method
	 *
	 * @param Class
	 *            : className
	 * @param String
	 *            : message
	 * @param Throwable
	 *            e
	 * @return void
	 */

	@SuppressWarnings("rawtypes")
	public static void error(Class className, String message, Throwable e) {
		log(Level.ERROR, className, message, e);
	}

	/**
	 * error This method uses the ERROR level of Logger. This method logs the
	 * ERROR level messages only. static
	 *
	 * @param Class
	 *            : className
	 * @param String
	 *            : message
	 * @param Throwable
	 *            e
	 * @return void
	 */

	@SuppressWarnings("rawtypes")
	public static void error(Class className, String message) {
		log(Level.ERROR, className, message);
	}

	/**
	 * boolean variable
	 */
	private static boolean useStderr = false;

}
