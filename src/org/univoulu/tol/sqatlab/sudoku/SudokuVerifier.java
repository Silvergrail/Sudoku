package org.univoulu.tol.sqatlab.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SudokuVerifier {
	

	private static List<Integer> numberList = new ArrayList<Integer>();
	private static String validAnswer = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
	private static String invalidAnswer = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";

	public int verify(String candidateSolution) {
		
		Scanner scanner = new Scanner(candidateSolution);
		
		List<Integer> intList = null;
		
		while (scanner.hasNextInt()) {
		    numberList.add(scanner.nextInt());
		    
		System.out.println(numberList);
		}
		
		
		// returns 1 if the candidate solution is correct
		return 0;
	}
	
	
}
