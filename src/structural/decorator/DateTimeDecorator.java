package structural.decorator;

import java.util.Date;

public class DateTimeDecorator implements Logger {
	
	private Logger logger;

	public DateTimeDecorator(Logger logger) {
		this.logger = logger;
	}

	@Override
	public String log(String log) {
		Date date = new Date();
		return date.toString() + " " + logger.log(log);
	}

}
