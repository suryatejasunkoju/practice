package com.practise.surya_practise.DSA.StriversSdeSheet.day8;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.Pair;
import com.practise.surya_practise.DSA.utils.Triplet;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Slf4j
public class NMeetingsInOneRoom implements DsaSolutionInterface {
    @Override
    public Pair<String> bruteForce() {
        int[] Start = {1, 3, 0, 5, 8, 5} , End = {2, 4, 6, 7, 9, 9};
        int len = Start.length;
        List<Triplet<Integer, Integer, Integer>> tripletList=new ArrayList<>(len);
        for (int i = 0; i <len; i++)
        {
            tripletList.add(new Triplet<>(Start[i], End[i], i));
        }
        log.info("tripletList={}", tripletList);
        tripletList.sort(Comparator.comparingInt(Triplet::getThird));
        log.info("sortedTripletList={}", tripletList);
        int count=1, freedTime=tripletList.get(0).getThird();
        List<Integer> ansIdxOrder=new ArrayList<>();
        ansIdxOrder.add(0);
        for (int i = 1; i <len; i++)
        {
            Triplet<Integer, Integer, Integer> triplet = tripletList.get(i);
            Integer third = triplet.getThird();
            if (freedTime<third)
            {
                count++;
                ansIdxOrder.add(i);
            }
        }
        log.info("count={}, ansIdxOrder={}", count, ansIdxOrder);
        return null;
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
