package test.problems;

import main.problems.Palindrome;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {
    private Palindrome palindrome;

    @Before
    public void initialize() {
        palindrome = new Palindrome();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 99, 101, 4114, 15951})
    @DisplayName("should assert input is a palindrome")
    public void isPalindrome(int input) {
        System.out.println("Parameterized Number is : " + input);
        assertTrue(palindrome.isPalindrome(input));
    }

    @ParameterizedTest
    @ValueSource(ints = {96, 105, 4124, 16951, -5, -11})
    @DisplayName("should assert input is not a palindrome")
    public void isNotPalindrome(int input) {
        System.out.println("Parameterized Number is : " + input);
        assertFalse(palindrome.isPalindrome(input));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 99, 101, 4114, 15951})
    @DisplayName("should assert input is a palindrome")
    public void isPalindromeNotTransformed(int input) {
        System.out.println("Parameterized Number is : " + input);
        assertTrue(palindrome.isPalindromeNotTransformed(input));
    }

    @ParameterizedTest
    @ValueSource(ints = {96, 105, 4124, 16951, -5, -11})
    @DisplayName("should assert input is not a palindrome")
    public void isNotPalindromeNotTransformed(int input) {
        System.out.println("Parameterized Number is : " + input);
        assertFalse(palindrome.isPalindromeNotTransformed(input));
    }

    private static Stream<Arguments> getArgument() {
        return Stream.of(
            Arguments.of(123, 321),
            Arguments.of(324, 423)
        );
    }

    @ParameterizedTest
    @MethodSource("getArgument")
    @DisplayName("should reverse a number")
    public void reversedNumber(int input, int expected) {
        System.out.println("Parameterized Number is : " + input);
        assertEquals(expected, palindrome.reversedNumber(input));
    }
}
