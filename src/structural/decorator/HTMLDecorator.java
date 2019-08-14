package structural.decorator;

public class HTMLDecorator implements Logger {

	private Logger logger;

	public HTMLDecorator(Logger logger) {
		this.logger = logger;
	}

	@Override
	public String log(String log) {
		return "<html>" + logger.log(log) + "</html>";
	}

}
