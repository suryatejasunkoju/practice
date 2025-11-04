package com.practise.surya_practise.LLD.design_patterns.behavioural.chain_of_responsibility.support_ticket_system.concrete_handlers;


import com.practise.surya_practise.LLD.design_patterns.behavioural.chain_of_responsibility.SupportTicket;
import com.practise.surya_practise.LLD.design_patterns.behavioural.chain_of_responsibility.support_ticket_system.abstract_handler.abstract_handler.SupportHandler;

public class LevelThreeSupport extends SupportHandler {
    public void handle(SupportTicket ticket) {
        System.out.println("Handled by Level 3: " + ticket.getMessage());
    }
}