package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class TestSudokuVerifier {
	
	private static String validAnswer = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
	private static String invalidAnswer = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
	SudokuVerifier verifier;
	
	@Before
	public void setup() {
		
		verifier = new SudokuVerifier();
		
		
	}
	
	@Test
	public void TestList() {
		verifier.verify("417369825632158947958724316825437169791586432346912758289643571573291684164875293");
		
	}
	

	@Test
	public void Stringlength() {
		fail("Not yet implemented");
	}
	
	@Test
	public void GlobalColumnNumber() {
		fail("Not yet implemented");
	}
	
	@Test
	public void GlobalRowNumber() {
		fail("Not yet implemented");
	}
	
	@Test
	public void Repetition() {
		fail("Not yet implemented");
	}
	
	@Test
	public void PositiveNumbers() {
		fail("Not yet implemented");
	}
	
	@Test
	public void NumbersUnderTen() {
		fail("Not yet implemented");
	}

}
