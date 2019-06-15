package com.sekhar.test.Demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sekhar.test.exception.ResourceNotFoundException;
import com.sekhar.test.util.CSVUtil;

public class CSVReader {

   

    public static void main(String[] args) throws ResourceNotFoundException {

        String csvFile = "C:\\Users\\koushikkr\\Desktop\\Demo\\src\\main\\resources\\country.csv";

        Scanner scanner;
		try {
			scanner = new Scanner(new File(csvFile));
			while (scanner.hasNext()) {
				List<String> line = CSVUtil.parseLine(scanner.nextLine());
				System.out.println("Country [id= " + line.get(0) + ", code= " + line.get(1) + " , name=" + line.get(2) + "]");
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			throw new ResourceNotFoundException(e);
		}

    }

   

}