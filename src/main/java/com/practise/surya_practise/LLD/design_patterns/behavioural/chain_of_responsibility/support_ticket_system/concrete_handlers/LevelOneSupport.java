package com.practise.surya_practise.LLD.design_patterns.behavioural.chain_of_responsibility.support_ticket_system.concrete_handlers;

import com.practise.surya_practise.LLD.design_patterns.behavioural.chain_of_responsibility.SupportTicket;
import com.practise.surya_practise.LLD.design_patterns.behavioural.chain_of_responsibility.support_ticket_system.abstract_handler.abstract_handler.SupportHandler;

public class LevelOneSupport extends SupportHandler {
    public void handle(SupportTicket ticket) {
        if (ticket.getLevel() == SupportTicket.Level.LOW) {
            System.out.println("Handled by Level 1: " + ticket.getMessage());
        } else if (next != null) {
            next.handle(ticket);
        }
    }
}