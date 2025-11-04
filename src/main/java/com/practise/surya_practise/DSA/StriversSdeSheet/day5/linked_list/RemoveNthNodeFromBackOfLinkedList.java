package com.practise.surya_practise.DSA.StriversSdeSheet.day5.linked_list;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.LinkedListUtils;
import com.practise.surya_practise.DSA.utils.ListNode;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RemoveNthNodeFromBackOfLinkedList implements DsaSolutionInterface
{
    @Override
    public Pair<String> bruteForce()
    {
        ListNode head = LinkedListUtils.formLinkedList(new int[]{1,2,3,4,5,6,7,8,9,10});
        LinkedListUtils.printLinkedList(head);
        ListNode tmpHead=head, nodeBeforeDeletion=head;
        int n = 2, i=1, size=0;
        if(n!=0)
        {
            while(tmpHead!=null)
            {
                size++;
                tmpHead=tmpHead.next;
            }
            int deletingNodeBeforeIdx=size-n;
            log.info("size={}, deletingNodeBeforeIdx={}", size, deletingNodeBeforeIdx);
            while(nodeBeforeDeletion!=null && i++<deletingNodeBeforeIdx)
            {
                nodeBeforeDeletion=nodeBeforeDeletion.next;
            }
            log.info("bruteForce::nodeBeforeDeletion={}, head={}, tmpHead={}", nodeBeforeDeletion, head, tmpHead);
            if(deletingNodeBeforeIdx==0)
            {
                //i.e, we have to delete first node
                head=head.next;
            }
            else
            {
                //we have to delete a node which is not first one
                nodeBeforeDeletion.next=nodeBeforeDeletion.next.next;
            }
        }
        LinkedListUtils.printLinkedList(head);
        //time=O(n)+O(n)[at max deleting node can be at last of list]
        return Pair.of("O(2n)", "O(1)");
    }

    @Override
    public Pair<String> goodApproach()
    {
        ListNode head = LinkedListUtils.formLinkedList(new int[]{1,2,3,4,5,6,7,8,9,10});
        ListNode tmpHead=head, nodeBeforeDeletion=head;
        int n = 2, i=0;
        if(n!=0)
        {
            while(tmpHead!=null && i++<n)
            {
                tmpHead=tmpHead.next;
            }
            log.info("goodApproach::tmpHead={}, i={}", tmpHead, i);
            while(tmpHead!=null && tmpHead.next!=null)
            {
                tmpHead=tmpHead.next;
                nodeBeforeDeletion=nodeBeforeDeletion.next;
                log.info("goodApproach, inside::tmpHead={}, nodeBeforeDeletion={}", tmpHead, nodeBeforeDeletion);
            }
            log.info("goodApproach::nodeBeforeDeletion={}, head={}, tmpHead={}", nodeBeforeDeletion, head, tmpHead);
            if(tmpHead==null)
            {
                //i.e, we have to delete first node
                head=head.next;
            }
            else
            {
                //we have to delete a node which is not first one
                nodeBeforeDeletion.next=nodeBeforeDeletion.next.next;
            }
        }
        LinkedListUtils.printLinkedList(head);
        return Pair.of("O(n)", "O(1)");
    }

    @Override
    public Pair<String> betterApproach() {
        return null;
    }

    @Override
    public Pair<String> bestApproach() {
        return null;
    }
}
