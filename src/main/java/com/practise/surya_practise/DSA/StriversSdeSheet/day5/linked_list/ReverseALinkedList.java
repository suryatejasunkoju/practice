package com.practise.surya_practise.DSA.StriversSdeSheet.day5.linked_list;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.LinkedListUtils;
import com.practise.surya_practise.DSA.utils.ListNode;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class ReverseALinkedList  implements DsaSolutionInterface {
    @Override
    public Pair<String> bruteForce()
    {
        //approach:add all nodes in list, iterate from last and reverse next direction
        int[] input = {1, 2, 3, 4, 5};
        ListNode head = LinkedListUtils.formLinkedList(input);
        LinkedListUtils.printLinkedList(head);
        ListNode reversedHead=null;
        if(head==null || head.next==null)
        {
            reversedHead=head;
        }
        else
        {
            List<ListNode> nodeList=new ArrayList<>();
            ListNode tempHead=head;
            while (tempHead!=null)
            {
                nodeList.add(tempHead);
                tempHead=tempHead.next;
            }
            int size = nodeList.size();
            nodeList.get(0).next=null;
            for (int i = size -1; i>0; i--)
            {
                ListNode listNode = nodeList.get(i);
                listNode.next=nodeList.get(i-1);
            }
            reversedHead = nodeList.get(size-1);
        }
        LinkedListUtils.printLinkedList(reversedHead);
        return Pair.of("O(n)", "O(1)");
    }

    @Override
    public Pair<String> goodApproach()
    {
        //approach:recursive
        int[] input = {1, 2, 3, 4, 5};
        ListNode head = LinkedListUtils.formLinkedList(input);
        LinkedListUtils.printLinkedList(head);
        ListNode reversedHead=null;
        if(head==null || head.next==null)
        {
            reversedHead=head;
        }
        else
        {

        }
        LinkedListUtils.printLinkedList(reversedHead);
        return Pair.of("O(n)", "O(n)");
    }

    void reverse(ListNode head)
    {
        if(head.next==null)
        {
            return;
        }

    }

    @Override
    public Pair<String> betterApproach()
    {
        //approach:iterative
        int[] input = {1, 2, 3, 4, 5};
        ListNode head = LinkedListUtils.formLinkedList(input);
        LinkedListUtils.printLinkedList(head);
        ListNode reversedHead=null;
        if(head==null || head.next==null)
        {
            reversedHead=head;
        }
        else
        {
            ListNode prev=null, nextNode=null;
            while(head!=null)
            {
                nextNode=head.next;
                head.next=prev;
                prev=head;
                head=nextNode;
                log.info("nextNode="+nextNode+",prev="+prev+",head="+head);
            }
            reversedHead=prev;
        }
        LinkedListUtils.printLinkedList(reversedHead);
        return Pair.of("O(n)", "O(1)");
    }

    @Override
    public Pair<String> bestApproach() {
        return null;
    }
}
