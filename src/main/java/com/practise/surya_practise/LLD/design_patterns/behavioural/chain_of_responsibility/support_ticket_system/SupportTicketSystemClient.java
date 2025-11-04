package com.practise.surya_practise.LLD.design_patterns.behavioural.chain_of_responsibility.support_ticket_system;

import com.practise.surya_practise.LLD.design_patterns.behavioural.chain_of_responsibility.SupportTicket;
import com.practise.surya_practise.LLD.design_patterns.behavioural.chain_of_responsibility.support_ticket_system.abstract_handler.abstract_handler.SupportHandler;
import com.practise.surya_practise.LLD.design_patterns.behavioural.chain_of_responsibility.support_ticket_system.concrete_handlers.LevelOneSupport;
import com.practise.surya_practise.LLD.design_patterns.behavioural.chain_of_responsibility.support_ticket_system.concrete_handlers.LevelThreeSupport;
import com.practise.surya_practise.LLD.design_patterns.behavioural.chain_of_responsibility.support_ticket_system.concrete_handlers.LevelTwoSupport;

public class SupportTicketSystemClient
{
    public static void run()
    {
        SupportHandler level1 = new LevelOneSupport();
        SupportHandler level2 = new LevelTwoSupport();
        SupportHandler level3 = new LevelThreeSupport();

        level1.setNext(level2);
        level2.setNext(level3);

        SupportTicket ticket = new SupportTicket("System crash", SupportTicket.Level.HIGH);
        level1.handle(ticket);
    }
}
