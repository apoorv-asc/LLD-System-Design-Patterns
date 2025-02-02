package Logger;

public class LoggerError extends Logger{
	
	public LoggerError(Logger nextLogger) {
		super(nextLogger);
	}

	public void log(int logLevel, String msg) {
		if(logLevel == ERROR) {
			System.out.println("ERROR : "+ msg);
		}else {
			super.log(logLevel,msg);
		}
		
	}
	
	

}
