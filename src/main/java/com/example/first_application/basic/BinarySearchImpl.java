package com.example.first_application.basic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private SortingAlgorithm sortAlgo;

    public BinarySearchImpl(SortingAlgorithm sortAlgo) {
        super();
        this.sortAlgo = sortAlgo;

    }

    public int Search(int [] nums, int target){
        return 3;
    }

    public void  postConstruct(){
        logger.info("postConstruct");
    }
}
