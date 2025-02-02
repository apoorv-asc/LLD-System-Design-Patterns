package Logger;

public class LoggerDebug extends Logger{
	
	public LoggerDebug(Logger nextLogger) {
		super(nextLogger);
	}
	

	public void log(int logLevel, String msg) {
		if(logLevel == DEBUG) {
			System.out.println("DEBUG : "+ msg);
		}else {
			super.log(logLevel,msg);
		}
		
	}
	
	

}
