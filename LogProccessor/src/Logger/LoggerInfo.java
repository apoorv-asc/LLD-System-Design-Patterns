package Logger;

public class LoggerInfo extends Logger{
	
	public LoggerInfo(Logger nextLogger) {
		super(nextLogger);
	}
	

	@Override
	public void log(int logLevel, String msg) {
		if(logLevel == INFO) {
			System.out.println("INFO : "+msg);
		}else {
			super.log(logLevel,msg);
		}
		
	}

}
