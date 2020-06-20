/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marisoft.task.search;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Niveen
 */
public class BinarySearch implements SearchUtil {

    // Returns index of x if it is present in arr[l..
    // r], else return -1
    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r>=l)
        {
            int mid = l + (r - l)/2;

            // If the element is present at the 
            // middle itself
            if (arr[mid] == x)
               return mid;

            // If element is smaller than mid, then 
            // it can only be present in left subarray
            if (arr[mid] > x)
               return binarySearch(arr, l, mid-1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid+1, r, x);
        }

        // We reach here when element is not present
        //  in array
        return -1;
    }


    @Override
    public int getPositions(int[] input, int num) {
        int position = binarySearch(input, 0, input.length - 1, num);
        return position;
    }

}
