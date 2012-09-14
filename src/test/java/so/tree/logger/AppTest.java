package so.tree.logger;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.spi.LoggingEvent;

/**
 * Unit test for simple App.
 */

public class AppTest 
{

	final static Logger logger = LoggerFactory.getLogger(AppTest.class);
	@Test
    public void testApp()
    {
		logger.error("testError");
		logger.error("#EVENT# testError");
		logger.error("#륜# testError");
    }
}
