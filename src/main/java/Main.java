import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static  Logger logger  = LogManager.getLogger(Main.class.getName());
    public static void main(){
        logger.info("808Server_KafkaClient Starting...");
        
        JT808Server jts = new JT808Server();
        jts.run();
    }
}
