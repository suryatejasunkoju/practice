package com.practise.surya_practise.DSA.StriversSdeSheet.day5.linked_list;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.LinkedListUtils;
import com.practise.surya_practise.DSA.utils.ListNode;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Slf4j
public class MergeTwoSortedLinkedList implements DsaSolutionInterface {

    @Override
    public Pair<String> bruteForce()
    {
        ListNode list1 = LinkedListUtils.formLinkedList(new int[]{});
        ListNode list2 = LinkedListUtils.formLinkedList(new int[]{1, 2});
        LinkedListUtils.printLinkedList(list1);
        LinkedListUtils.printLinkedList(list2);
        //add nodes of both lists into single arr & sort arr based on node's values
        //then make each node point to next from start to end of arr

        List<ListNode> combinedList=new ArrayList<>();
        ListNode head1=list1, head2=list2;
        int list1Size=0, list2Size=0;
        while (head1!=null)
        {
            combinedList.add(head1);
            head1=head1.next;
            list1Size++;
        }
        while (head2!=null)
        {
            combinedList.add(head2);
            head2=head2.next;
            list2Size++;
        }
        log.info("list1Size={}, list2Size={}, combinedList={}", list1Size, list2Size, combinedList);
        if(list1Size!=0 &&  list2Size!=0)
        {
            combinedList.sort(
                    Comparator.comparingInt(a -> a.val)
            );
        }
        log.info("sorted combinedList={}", combinedList);
        int lenMinusOne = combinedList.size() - 1;
        combinedList.get(lenMinusOne).next=null;
        for (int i = 0; i < lenMinusOne; i++)
        {
            combinedList.get(i).next=combinedList.get(i+1);
        }
        //time=O(m)+O(n) + O((m+n)log(m+n)) + O(m+n)
        return Pair.of("O((m+n)log(m+n)) + O(m+n)", "O(m+n)");
    }

    @Override
    public Pair<String> goodApproach()
    {
        ListNode list1 = LinkedListUtils.formLinkedList(new int[]{1, 2, 3, 4, 5});
        ListNode list2 = LinkedListUtils.formLinkedList(new int[]{1, 2, 3, 4, 5});
        LinkedListUtils.printLinkedList(list1);
        LinkedListUtils.printLinkedList(list2);
        ListNode mergedListHead = null;
        if(list1==null)
        {
            mergedListHead = list2;
        }
        else if(list2==null)
        {
            mergedListHead = list1;
        }
        else
        {
            //Now both of linked lists are non-empty
            ListNode prev=null, curr = null;
            while(list1!=null && list2!=null)
            {
                if(list1.val<list2.val)
                {
                    curr = new ListNode(list1.val);
                    list1=list1.next;
                }
                else
                {
                    curr = new ListNode(list2.val);
                    list2=list2.next;
                }
                if(mergedListHead==null)
                {
                    mergedListHead=curr;
                    prev=curr;
                }
                else
                {
                    if(prev!=null)
                    {
                        prev.next=curr;
                    }
                    else
                    {
                        prev=curr;
                    }
                }
            }
            log.info("prev={}, curr={}", prev, curr);
            log.info("mergedListHead:-");
            LinkedListUtils.printLinkedList(mergedListHead);
            if (list1!=null)
            {
                curr.next=list1.next;
            }
            if (list2!=null)
            {
                curr.next=list2.next;
            }
        }
        LinkedListUtils.printLinkedList(mergedListHead);
        return null;
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
