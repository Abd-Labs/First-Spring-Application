package com.example.first_application.basic;


import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortingAlgorithm {

    @Override
    public int[] sort(int [] nums) {
        return nums;
    }
}
