/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marisoft.task.search;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nova
 */
public class SearchContext extends Thread {

    private SearchUtil searchUtil;
    private int[] input;
    private int num;

    public SearchContext(SearchUtil searchUtil) {
        this.searchUtil = searchUtil;
    }

    public void getPositions(int[] input, int num) {
        setInput(input);
        setNum(num);

    }

    public void run() {
//        try {
//            Thread.sleep(1500);
        int position = searchUtil.getPositions(input, num);
        if (position > 0) {
            System.out.println(searchUtil.getClass() + " " + (position + 1));
        } else {
            System.out.println(getNum() + " doesn't exist ");
        }
//        } catch (InterruptedException ex) {
//            Logger.getLogger(SearchContext.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    //=============setter and getter============
    private void setInput(int[] input) {
        this.input = input;
    }

    private int[] getInput() {
        return input;
    }

    private void setNum(int num) {
        this.num = num;
    }

    private int getNum() {
        return num;
    }
}
