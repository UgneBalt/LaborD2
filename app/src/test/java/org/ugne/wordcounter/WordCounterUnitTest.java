package org.ugne.wordcounter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class WordCounterUnitTest {
    WordCounter testedObject = new WordCounter();

    @Test
    public void Given_NullStringAndCountWords_When_CountIsPerformed_Then_ZeroIsReturned(){
        int actualCount = testedObject.count(null,0);
        assertEquals(0, actualCount);
    }

    @Test
    public void Given_NullStringAndCountChars_When_CountIsPerformed_Then_ZeroIsReturned(){
        int actualCount = testedObject.count(null,1);
        assertEquals(0, actualCount);
    }

    @Test
    public void Given_EmptyStringAndCountWords_When_CountIsPerformed_Then_ZeroIsReturned(){
        int actualCount = testedObject.count("",0);
        assertEquals(0, actualCount);
    }

    @Test
    public void Given_EmptyStringAndCountChars_When_CountIsPerformed_Then_ZeroIsReturned(){
        int actualCount = testedObject.count("",1);
        assertEquals(0, actualCount);
    }

    @Test
    public void Given_SentenceStringAndCountWords_When_CountIsPerformed_Then_WordCountIsReturned(){
        int actualCount = testedObject.count("Wolf had eaten a sheep, a pig and a chicken.",0);
        assertEquals(10, actualCount);
    }

    @Test
    public void Given_SentenceStringAndCountChars_When_CountIsPerformed_Then_CharCountIsReturned(){
        int actualCount = testedObject.count("Wolf had eaten a sheep, a pig and a chicken.",1);
        assertEquals(44, actualCount);
    }

}