package com.example.first_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstApplication {

	//what are beans (@Component Annotation)
	//What are dependencies of a Bean (@AutoWired Annotation)
	//Where to search for beans? (Spring Search in root package by default)
	public static void main(String[] args) {

//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

		//Application Context

		ApplicationContext applicationContext = SpringApplication.run(FirstApplication.class, args);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.Search(new int[] {3,7,6,9},3);

		System.out.println(result);
	}

}
