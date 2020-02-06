package util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log {
	public static Logger log = null;
	
	static {
		String logPath = new SimpleDateFormat("YYYYmmDD-HHmmss").format(new Date());
		try {
			FIleUtil.createFile(logPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.setProperty("logfile",logPath);
		log = Logger.getLogger(Log.class);
		DOMConfigurator.configure("src/test/resources/configurationFiles/log4j.xml");
	}
	
	public static void info(String msg) {
		log.info(msg);
	}
	
	public static void debug(String msg) {
		log.debug(msg);
	}
	
	public static void warn(String msg) {
		log.warn(msg);
	}
	
	public static void error(String msg) {
		log.error(msg);
	} 
	
	public static void fatel(String msg) {
		log.fatal(msg);
	} 
	
}
