package com.practise.surya_practise.DSA.StriversSdeSheet.day6;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.LinkedListUtils;
import com.practise.surya_practise.DSA.utils.ListNode;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

import static com.practise.surya_practise.DSA.utils.ArrayUtils.swap;

@Slf4j
public class ReverseALinkedListInGroupsOfSizeK implements DsaSolutionInterface {
    @Override
    public Pair<String> bruteForce()
    {
        ListNode head = LinkedListUtils.formLinkedList(new int[]{1, 2, 3, 4, 5});

        List<ListNode> list=new ArrayList<>();
        ListNode tempNode=head;
        int size=0,k=2;
        while(tempNode!=null)
        {
            list.add(tempNode);
            size++;
            tempNode=tempNode.next;
        }
        log.info("size={}, k={}, list={}", size, k, list);
        int start=0, end=k-1, q=size/k;
        while (q>0)
        {
            q--;
            int tempStart=start, tempEnd=end;
            while(tempStart<tempEnd)
            {
                swap(list, tempStart, tempEnd);
                tempStart++;
                tempEnd--;
            }
            start+=k;
            end+=k;
        }
        log.info("reversed list={}", list);
        for (int i = 0; i <size-1; i++)
        {
            list.get(i).next=list.get(i+1);
        }
        LinkedListUtils.printLinkedList(list.get(0));
        return null;
    }

    @Override
    public Pair<String> goodApproach() {
        ListNode head = LinkedListUtils.formLinkedList(new int[]{9, 7, 6, 5, 1, 2, 3, 4});
        LinkedListUtils.printLinkedList(head);

        int k=4;
        List<ListNode> nodeList;
        ListNode tempNode=head;
        int start=0, end=k-1, size=0;
        ListNode prevTail = null;
        ListNode prevHead = null;
        ListNode currTail = null;
        ListNode currHead = null;
        while (size<9)
        {
            nodeList=new ArrayList<>(k);
            int count=0;
            while(count<k && tempNode!=null)
            {
                nodeList.add(tempNode);
                count++;
                size++;
                tempNode=tempNode.next;
            }
            if(count==k)
            {
                log.info("start={}, end={}, k={}, nodeList={}", start,end, k, nodeList);
                for (int i = nodeList.size()-1; i >0; i--)
                {
                    nodeList.get(i).next=nodeList.get(i-1);
                }
                nodeList.get(0).next=null;
                currTail = nodeList.get(start);
                currHead = nodeList.get(end);
                log.info("currTail={}, currHead={}",currTail, currHead);
                log.info("prevTail={}, prevHead={}",prevTail, prevHead);
                LinkedListUtils.printLinkedList(currHead);
                LinkedListUtils.printLinkedList(currTail);

                if(prevTail!=null && currHead!=null){
                    prevTail.next=currHead;
                }

                if(currTail!=null)
                {
                    prevTail=currTail;
                }
                if (currHead!=null)
                {
                    prevHead=currHead;
                }
                log.info("after:currTail={}, currHead={}",currTail, currHead);
                log.info("after:prevTail={}, prevHead={}",prevTail, prevHead);


                start+=k;
                end+=k;
            }
            else
            {

            }
        }
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
