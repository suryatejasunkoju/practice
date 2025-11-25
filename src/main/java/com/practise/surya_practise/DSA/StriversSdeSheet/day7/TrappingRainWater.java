package com.practise.surya_practise.DSA.StriversSdeSheet.day7;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TrappingRainWater implements DsaSolutionInterface
{

    @Override
    public Pair<String> bruteForce() {
        //Observation: water at cell i = Min(max height on left of i, max height on right of i)-height(i)
        //Why:
        // "-height[i]" because water cant be stored in building, & it will populate above terrace of building
        // "Min(max height on left of i, max height on right of i)"-gives water top level line.

        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        int currMax=0, currWater=0, totalWater=0;
        int len = height.length;
        int[] rightMax=new int[len];
        for(int i=len-1; i>=0; i--)
        {
            currMax=Math.max(currMax, height[i]);
            rightMax[i]=currMax;
        }
        // printList(rightMax);
        currMax=0;
        for(int i=0; i<len; i++)
        {
            int curr=height[i];
            if(currMax<curr)
            {
                currMax=curr;
            }
            currWater=Math.min(currMax, rightMax[i])-curr;
            log.info("currWater="+currWater+",i="+i+",left="+currMax+",right="+rightMax[i]);
            totalWater+=currWater;
        }
        log.info("totalWater={}", totalWater);
        return null;
    }

    @Override
    public Pair<String> goodApproach()
    {
        //Observation: water at cell i = Min(max height on left of i, max height on right of i)-height(i)
        //Why:
        // "-height[i]" because water cant be stored in building, & it will populate above terrace of building

        // "Min(max height on left of i, max height on right of i)"-gives water top level line
        // Here, minimum value out of both only matters, if max out of 2 is even not actual max it's ok, b'coz we are taking min only.
        // Just we have to figure out which one is minimum even if we don't know exact max value out of it.

        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        int totalWater = 0, len = height.length;
        int left=0, right=len-1, leftMax=0, rightMax=0;
        while (left<right)
        {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if(leftMax<rightMax)
            {
                int currWater = leftMax - height[left];
                if(currWater>0){
                    totalWater+=currWater;
                }
                left++;
            }
            else
            {
                int currWater = rightMax-height[right];
                if(currWater>0){
                    totalWater+=currWater;
                }
                right--;
            }
        }
        log.info("goodApproach::totalWater={}", totalWater);
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
