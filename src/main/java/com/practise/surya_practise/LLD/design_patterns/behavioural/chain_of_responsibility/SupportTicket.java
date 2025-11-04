package com.practise.surya_practise.LLD.design_patterns.behavioural.chain_of_responsibility;

public class SupportTicket
{

    public enum Level { LOW, MEDIUM, HIGH }

    private final String message;
    private final Level level;

    public SupportTicket(String message, Level level) {
        this.message = message;
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    public String getMessage() {
        return message;
    }
}

