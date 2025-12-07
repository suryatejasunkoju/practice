package com.practise.surya_practise.DSA.StriversSdeSheet.day14;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LargestRectangleInAHistogram implements DsaSolutionInterface {
    @Override
    public Pair<String> bruteForce()
    {
        //Approach: try to stretchToLeftAndRight as much as possible for every index
        int[] arr= {2,1,5,6,2,3};
        int len=arr.length, maxArea=0;
        log.info("arr={}", arr);
        for (int i = 0; i <len; i++)
        {
            int currElem = arr[i];
            if(currElem>0)
            {
                int area = maxStretchArea(i, arr);
                log.info("i={}, area={}", i, area);
                maxArea= Math.max(maxArea, area);
            }
        }
        log.info("maxArea={}", maxArea);
        return Pair.of("O(n^2)", "O(1)");
    }

    private int maxStretchArea(int i, int[] arr)
    {
        log.info("maxStretchArea::i={}, currElem={}", i, arr[i]);
        int curr = arr[i];
        int area= curr, left=i-1, right=i+1;
        while(left>=0 && arr[left]>= curr)
        {
            area+= curr;
            left--;
        }
        while(right<arr.length-1 && arr[right]>= curr)
        {
            area+= curr;
            right++;
        }
        return area;
    }

    @Override
    public Pair<String> goodApproach() {

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
