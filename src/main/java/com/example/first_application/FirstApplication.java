package com.example.first_application;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.example.first_application.scope.PersonDAO;
import com.example.first_application.scope.JdbcConnection;

@SpringBootApplication
public class FirstApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(FirstApplication.class);

	//what are beans (@Component Annotation)
	//What are dependencies of a Bean (@AutoWired Annotation)
	//Where to search for beans? (Spring Search in root package by default)
	public static void main(String[] args) {

//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

		//Application Context

		ApplicationContext applicationContext = SpringApplication.run(FirstApplication.class, args);

		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());

		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO2.getJdbcConnection());

		//This code is from Basic example part
//		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
//		int result = binarySearch.Search(new int[] {3,7,6,9},3);
//
//		System.out.println(result);
	}

}
