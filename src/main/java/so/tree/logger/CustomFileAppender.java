package so.tree.logger;

import java.io.IOException;

import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.core.FileAppender;

public class CustomFileAppender<E> extends FileAppender<E> {
	
	private String prifix;

	public void setPrifix(String prifix) {
		this.prifix = prifix;
	}

	@Override
	protected void writeOut(E event) throws IOException {
		
		LoggingEvent tempEvent = (LoggingEvent)event;
		if(!tempEvent.getMessage().startsWith(prifix)) return;		
		
		super.writeOut(event);
	}
}
