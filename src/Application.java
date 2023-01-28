import java.util.*;


public class Application {
    public static void main (String[] args) {
            Logger logger = new AsteriskLogger();

            logger.log("Asterisk");
            logger.error("Asterisk");

            Logger logger2 = new SpacedLogger();
            logger2.log("Spaced");
            logger2.error("Spaced");


        }
    }

