package com.and.test;

import org.junit.Test;

import java.util.ArrayList;

import static com.and.test.Solution.*;
import static org.junit.Assert.*;

public class SolutionTest {


    public void testSolutionPassing() {
        //Arrange
        String passing = "12";
        String passingOutput = "21,12";
        //Act
        String solutionOutcome = solution(passing);
        //Assert
        assertEquals(passing, passingOutput);
    }

    @Test
    public void testSolutionFailing() {
        //Arrange
        String error = "Invalid Input";
        //Act
        String solutionOutcome = solution(error);
        //Assert
        assertEquals(error, solutionOutcome);
    }

    @Test
    public void testCombinationsGeneratorOneDigits() {
        //Arrange
        String input = "1";
        int start = 0;
        ArrayList<String> result = new ArrayList<String>();
        String output = "1";
        //Act
        String combinations = combinationsGenerator(input, start, result);
        //Assert
        assertEquals(output, combinations);
    }

    @Test
    public void testCombinationsGeneratorTwoDigits() {
        //Arrange
        String input = "12";
        int start = 0;
        ArrayList<String> result = new ArrayList<String>();
        String output = "21,12";
        //Act
        String combinations = combinationsGenerator(input, start, result);
        //Assert
        assertEquals(output, combinations);
    }

    @Test
    public void testCombinationsGeneratorThreeDigits() {
        //Arrange
        String input = "236";
        int start = 0;
        ArrayList<String> result = new ArrayList<String>();
        String output = "632,623,362,326,263,236";
        //Act
        String combinations = combinationsGenerator(input, start, result);
        //Assert
        assertEquals(output, combinations);
    }

    @Test
    public void testCombinationsGeneratorRepeatedElementsCaseOne() {
        //Arrange
        String input = "111";
        int start = 0;
        ArrayList<String> result = new ArrayList<String>();
        String output = "111";
        //Act
        String combinations = combinationsGenerator(input, start, result);
        //Assert
        assertEquals(output, combinations);
    }

    @Test
    public void testCombinationsGeneratorRepeatedElementsCaseTwo() {
        //Arrange
        String input = "112";
        int start = 0;
        ArrayList<String> result = new ArrayList<String>();
        String output = "211,121,112";
        //Act
        String combinations = combinationsGenerator(input, start, result);
        //Assert
        assertEquals(output, combinations);
    }

    @Test
    public void testReformatInputFailing() {
        //Arrange
        String error = "Invalid Input";
        //Act
        String input = reformatInput(error);
        //Assert
        assertEquals(error, input);
    }

    @Test
    public void testReformatInputNegatives() {
        //Arrange
        String Negatives = "Inv-2ali-3d In4put";
        String NegativesOutput = "234";
        //Act
        String input = reformatInput(Negatives);
        //Assert
        assertEquals(NegativesOutput, input);
    }

    @Test
    public void testReformatInputPassing() {
        //Arrange
        String passing = "Inv2ali3d In4put";
        String passingOutput = "234";
        //Act
        String input = reformatInput(passing);
        //Assert
        assertEquals(passingOutput, input);
    }

    @Test
    public void testSwapCaseOne() {
        //Arrange
        String abc = "123";
        int firstElement = 0;
        int secondElement = 1;
        //Act
        String swapped = swap(abc, firstElement, secondElement);
        //Assert
        assertEquals("213", swapped);
    }
    @Test
    public void testSwapCaseTwo() {
        //Arrange
        String abc = "123";
        int firstElement = 0;
        int secondElement = 2;
        //Act
        String swapped = swap(abc, firstElement, secondElement);
        //Assert
        assertEquals("321", swapped);
    }
}