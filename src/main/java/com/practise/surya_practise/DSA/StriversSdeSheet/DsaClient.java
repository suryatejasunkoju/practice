package com.practise.surya_practise.DSA.StriversSdeSheet;


import com.practise.surya_practise.DSA.StriversSdeSheet.day14.LargestRectangleInAHistogram;
import com.practise.surya_practise.DSA.StriversSdeSheet.day4.arrays_part_4.*;
import com.practise.surya_practise.DSA.StriversSdeSheet.day5.linked_list.*;
import com.practise.surya_practise.DSA.StriversSdeSheet.day6.ReverseALinkedListInGroupsOfSizeK;
import com.practise.surya_practise.DSA.miscellaneous.NextGreaterElement;

public class DsaClient
{
    public static void run()
    {
        miscellaneous();
//        day1();
//        day2();
//        day3();
//        day4();
//        day5();
//        day6();
//        day14();
    }
    private static void miscellaneous()
    {
        NextGreaterElement.run();
//        new UglyNumber2().goodApproach();
//        new CountOfSmallerNumbersAfterSelf().bruteForce();
    }
    private static void day1()
    {
//        new MaximumSubArraySum().goodApproach();
//        new NextPermutation().bruteForce();
//        new SetMatrixZeroes().betterApproach();
//        new SortArraysOf0s_1s_and2s().betterApproach();
//        new StockBuyAndSell().goodApproach();
//        new PascalsTriangleVariation1().goodApproach();

//        new Permutations().bruteForce();
    }

    private static void day2(){
//        new FindTheDuplicateInAnArrayOfNPlusOneIntegers().bruteForce();
//        new RepeatAndMissingNumber().bestApproach1();
//        new MergeOverlappingSubintervals().bruteForce();
//        new MergeTwoSortedArraysWithoutExtraSpace().betterApproach();
//        new RotateMatrix().betterApproach();
    }
    private static void day3(){
//        new SearchInA2DMatrix().bestApproach();
//        new ReversePairs().bruteForce();
//        new GridUniquePaths().goodApproach();
    }
    private static void day4()
    {
//        new LongestSubstringWithoutRepeatingChars().betterApproach();
//        new LongestConsecutiveSequence().goodApproach();
//        new TwoSumProblem().betterApproach();
//        new LongestSubArrayWithSumK().goodApproach();
        new CountSubarraysWithGivenXorK().bruteForce();
    }
    private static void day5()
    {
//        new DeleteAGivenNodeWhenANodeIsGiven().bruteForce();

//        new FindTheMiddleOfLinkedList().bruteForce();
//        new RemoveNthNodeFromBackOfLinkedList().bruteForce();
//        new MergeTwoSortedLinkedList().goodApproach();
        new ReverseALinkedList().betterApproach();
    }
    private static void day6(){
        new ReverseALinkedListInGroupsOfSizeK().goodApproach();
    }
    private static void day7(){

    }

    private static void day14()
    {
        new LargestRectangleInAHistogram().bruteForce();
    }
}
