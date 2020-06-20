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
public class LinearSearch implements SearchUtil {

    // This function returns index of element x in arr[]
    int search(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            // Return the index of the element if the element
            // is found
            if (arr[i] == x) {
                return i;
            }
        }

        // return -1 if the element is not found
        return -1;
    }

    @Override
    public int getPositions(int[] input, int num) {

        return search(input, input.length, num);
    }
}
