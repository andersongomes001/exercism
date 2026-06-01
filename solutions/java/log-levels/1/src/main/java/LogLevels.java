import java.util.logging.Logger;

public class LogLevels {
    
    public static String message(String logLine) {
        logLine = logLine.split(":")[1];
        return logLine.trim();
    }
    public static String logLevel(String logLine) {
        if(logLine.contains("INFO")){
            return "info";
        } else if (logLine.contains("WARNING")) {
            return "warning";
        } else if (logLine.contains("ERROR")) {
            return "error";
        }
        return null;
    }
    public static String reformat(String logLine) {
        String logLineTmp = logLine.split(":")[1];
        return logLineTmp.trim().concat(" (%s)".formatted(logLevel(logLine)));
    }

}
