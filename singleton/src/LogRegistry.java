package src;

import java.util.List;
import java.util.ArrayList;

public class LogRegistry {
    private static LogRegistry instance;
    private List<String> logEntries;

    private LogRegistry() {
        logEntries = new ArrayList<>();
    }

    public static LogRegistry getInstance() {
        if (instance == null) {
            instance = new LogRegistry();
        }
        return instance;
    }

    public void addLogEntry(String logEntry) {
        logEntries.add(logEntry);
    }

    public void printLogEntries() {
        for (String entry : logEntries) {
            System.out.println(entry);
        }
    }
}
