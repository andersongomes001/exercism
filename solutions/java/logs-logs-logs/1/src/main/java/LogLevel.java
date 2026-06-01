public enum LogLevel {
    UNKNOWN(0),
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42);

    Integer value = 0;
    LogLevel(int value) {
        this.value = value;
    }
}
