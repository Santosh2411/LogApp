package in.com.santosh;
import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

public class TestApp 
{
	// 3.Create Logger object
	private static Logger log = Logger.getLogger(TestApp.class);

	public static void main(String[] args) throws Exception {

		/*
		 * // 1.create Layout
		 * 
		 * // Layout layout=new SimpleLayout(); // Layout layout=new HTMLLayout(); //
		 * Layout layout=new XMLLayout(); Layout layout = new
		 * PatternLayout("%d{dd-MM-yyyy hh:mm} %p---[%M]: %C %L %m %n");
		 * 
		 * // 2.create Appender with logger + layout
		 * 
		 * Appender appender=new ConsoleAppender(layout); //Appender appender = new
		 * FileAppender(layout, "E:/log4j/Mylogs/data.log");
		 * 
		 * // 4.Link Appender with logger log.addAppender(appender);
		 */
		//Above code Config in log4j.properties file 
		// 5.print message
		log.debug("FROM DEBUG");
		log.info("FROM INFO");
		log.warn("FROM WARN");
		log.error("FROM ERROR");
		log.fatal("FROM FATAL");

	}

}
