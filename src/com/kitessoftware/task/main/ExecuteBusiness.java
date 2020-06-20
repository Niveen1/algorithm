/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marisoft.task.main;

import com.marisoft.task.search.BinarySearch;
import com.marisoft.task.search.LinearSearch;
import com.marisoft.task.search.SearchContext;
import com.marisoft.task.sort.MergeSort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Niveen
 */
public class ExecuteBusiness {

    public static void main(String[] args) {

        int[] inputArr = {45, 23, 11, 89, 0, 77, 98, 4, 28, 65, 43};

        MergeSort mms = new MergeSort();
        mms.sort(inputArr);
        for (int i : inputArr) {
            System.out.print(i);
            System.out.print(" ");
        }
            System.out.println(" ");

        int[] firstHalf = Arrays.copyOfRange(inputArr, 0, inputArr.length / 2);
        int[] secondHalf = Arrays.copyOfRange(inputArr, inputArr.length / 2, inputArr.length);

        SearchContext linearSearchContext = new SearchContext(new LinearSearch());
        linearSearchContext.getPositions(firstHalf, 11);

        SearchContext binarySearchContext = new SearchContext(new BinarySearch());
        binarySearchContext.getPositions(secondHalf, 90);

        linearSearchContext.start();
        binarySearchContext.start();
    }

}
