package Logger;

public abstract class Logger {
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	
	Logger nextLogger;
	
	Logger(Logger logger){
		this.nextLogger = logger;
	}

	public void log(int logLevel, String msg ) {
		if(nextLogger != null) {
			this.nextLogger.log(logLevel, msg);
		}
	}
	
}
