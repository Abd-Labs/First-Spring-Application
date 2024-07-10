package com.example.first_application;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortingAlgorithm sortAlgo;

    public BinarySearchImpl(SortingAlgorithm sortAlgo) {
        super();
        this.sortAlgo = sortAlgo;

    }

    public int Search(int [] nums, int target){
        return 3;
    }
}
