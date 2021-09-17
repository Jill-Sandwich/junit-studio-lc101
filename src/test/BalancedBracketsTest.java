package test;


import main.BalancedBrackets;
import org.junit.Test;
import static org.junit.Assert.*;


public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyEmptyStringReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyEmptyBracketLC(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void onlyLaunchBracketCode(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void onlyLaunchCodeBracket(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    //"[LaunchCode", "Launch]Code[", "[", "]["
    @Test
    public void missingBracketLaunchCode(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void misplacedBracketLaunchCode(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void onlyOneBracketTest(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void backwardsFacingBracketTest(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

}
