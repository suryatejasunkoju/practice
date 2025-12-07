package com.practise.surya_practise.DSA.miscellaneous;

import com.practise.surya_practise.DSA.utils.ArrayUtils;
import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

@Slf4j
public class NextGreaterElement
{
    public static void run()
    {
        int[] arr=
//                {4,12,5,3,1,2,5,3,1,2,4,6}
                {2,1,5,6,3,7,4,8,9,4,7,4,6,6,6}
                ;
        log.info("arr={}", arr);
        int length = arr.length;
        int[] nextGreaterArr = ArrayUtils.createIntArr(length, -1);
        log.info("nextGreaterArr={}", nextGreaterArr);
        Stack<Integer> stack=new Stack<>();
        stack.push(arr[length-1]);
        for (int i = length-2; i >=0; i--)
        {
            int stkTop = stack.peek();
            int curr = arr[i];
            log.info("i={}, curr={}, stack={}", i, curr, stack);
            if(curr<stkTop)
            {
                nextGreaterArr[i]=stkTop;
            }
            else
            {
                //3>1
//                    log.info("i={}, 123 stack={}", i, stkTop);
                while (!stack.isEmpty() && stkTop<=curr)
                {
                    stkTop=stack.pop();
                }
//                    log.info("i={}, stack={}", i, stkTop);
                nextGreaterArr[i]=(stkTop>curr) ? stkTop : -1;
                log.info("i={}, nextGreaterArr[i]={}", i, nextGreaterArr[i]);
            }
            stack.push(curr);
        }
        log.info("nextGreaterArr={}", nextGreaterArr);
//        [4,   12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6]
//        [12, -1, -1, 5, 2, 5, 6, 4, 2, 4, 6, -1]
    }
}
