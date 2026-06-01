public class LogLine {
    private LogLevel level;
    private String logLine;
    public LogLine(String logLine) {
        this.logLine = logLine;
        if(logLine.contains("TRC")){
            this.level = LogLevel.TRACE;
        }else if(logLine.contains("DBG")){
            this.level = LogLevel.DEBUG;
        }else if(logLine.contains("INF")){
            this.level = LogLevel.INFO;
        }else if(logLine.contains("WRN")){
            this.level = LogLevel.WARNING;
        }else if(logLine.contains("ERR")){
            this.level = LogLevel.ERROR;
        }else if(logLine.contains("FTL")){
            this.level = LogLevel.FATAL;
        }else{
            this.level = LogLevel.UNKNOWN;
        }
    }

    public LogLevel getLogLevel() {
        return this.level;
    }

    public String getOutputForShortLog() {
        String line = this.logLine.split(":")[1];
        return String.format("%s:%s".formatted(this.level.value, line.trim()));
    }
}
