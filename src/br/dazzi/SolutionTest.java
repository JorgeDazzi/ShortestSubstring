package br.dazzi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    public Solution solution = new Solution();

    @Test
    void asciiValidation_bab() {
        Assertions.assertEquals(
                true,
                solution.asciiValidation("bab".toCharArray())
        );
    }

    @Test
    void heapSizeValidation_bab() {
        Assertions.assertEquals(
                true,
                solution.heapSizeValidation("bab".toCharArray())
        );
    }

    @Test
    void shortestSubstringCase_bab() {
        Assertions.assertEquals(
                2,
                solution.shortestSubstring("bab")
        );
    }

    @Test
    void shortestSubstringCase_bcaacbc() {
        Assertions.assertEquals(
                3,
                solution.shortestSubstring("bcaacbc")
        );
    }

    @Test
    void shortestSubstringCaseAsciiOutRange() {
        Assertions.assertEquals(
                0,
                solution.shortestSubstring("abccdfG")
        );
    }
}