import java.util.*;

import Logger.LoggerError;
import Logger.LoggerInfo;
import Logger.Logger;
import Logger.LoggerDebug;

public class LoggerMain {
	
	static int INFO  = 1;
	static int DEBUG = 2;
	static int ERROR = 3;
	
	public static void main(String ar[]) {
		Logger log = new LoggerError(new LoggerInfo(new LoggerDebug(null)));
		
		log.log(ERROR,"This is an error");
	}

}
