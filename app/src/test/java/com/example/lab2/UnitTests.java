package com.example.lab2;

import org.junit.Test;
import org.w3c.dom.Text;

import static org.junit.Assert.*;

public class UnitTests {
    @Test
    public void GivenEmptyString_When_getCharsCountIsCalled_Then_ReturnedZero() {
        final String givenString = "";

        final String expectedResult = "0";
        final String actualResult = String.valueOf(TextCounter.getCharsCount(givenString));

        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = NullPointerException.class)
    public void Given_NullString_When_getCharsCountIsCalled_Then_NullPointerExceptionIsThrown(){
        TextCounter.getCharsCount(null);
    }

    @Test(expected = NullPointerException.class)
    public void Given_NullString_When_getWordsCountIsCalled_Then_NullPointerExceptionIsThrown(){
        TextCounter.getWordsCount(null);
    }

    @Test
    public void Given_CorrectString_When_getCharsCountIsCalled_Then_CorrectCharsCountIsReturned(){
        final String givenString = "Hello";

        final String expectedResult = "5";
        final String actualResult = String.valueOf(TextCounter.getCharsCount(givenString));

        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void Given_CorrectString_When_getWordsCountIsCalled_Then_CorrectWordCountIsReturned(){
        final String givenString = "Hello world";

        final String expectedResult = "2";
        final String actualResult = String.valueOf(TextCounter.getWordsCount(givenString));

        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void Given_StringWithMultipleSpaces_When_getWordsCountIsCalled_Then_OnlyWordCountIsReturned(){
        final String givenString = "Hello  from   the other    side";

        final String expectedResult = "5";
        final String actualResult = String.valueOf(TextCounter.getWordsCount(givenString));

        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void Given_StringWithMultipleSpaces_When_getCharsCountIsCalled_Then_CorrectAnswerIsReturned(){
        final String givenString = "Hello  world";

        final String expectedResult = "12";
        final String actualResult = String.valueOf(TextCounter.getCharsCount(givenString));

        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void Given_StringWithSpecialSymbols_When_getWordsCountIsCalled_Then_OnlyWordCountIsReturned(){
        final String givenString = "Hello ^ world";

        final String expectedResult = "2";
        final String actualResult = String.valueOf(TextCounter.getWordsCount(givenString));

        assertEquals(expectedResult,actualResult);
    }
}

