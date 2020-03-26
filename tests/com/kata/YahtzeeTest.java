package com.kata;

import org.junit.*;
import static org.junit.Assert.*;

public class YahtzeeTest {

    @Test public void chance_scores_sum_of_all_dice() {
        int expected = 15;
        int actual = new Yahtzee(2,3,4,5,1).chance();
        assertEquals(expected, actual);
        assertEquals(16, new Yahtzee(3,3,4,5,1).chance());
    }

    @Test public void Yahtzee_scores_50() {
        int expected = 50;
        int actual = new Yahtzee(4,4,4,4,4).yahtzeeRes();
        assertEquals(expected, actual);
        assertEquals(50, new Yahtzee(6,6,6,6,6).yahtzeeRes());
        assertEquals(0, new Yahtzee(6,6,6,6,4).yahtzeeRes());
    }

    @Test public void test_1s() {
        assertTrue(new Yahtzee(1,2,3,4,5).ones() == 1);
        assertEquals(2, new Yahtzee(1,2,1,4,5).ones());
        assertEquals(0, new Yahtzee(6,2,2,4,5).ones());
        assertEquals(4, new Yahtzee(1,2,1,1,1).ones());
    }

    @Test
    public void test_2s() {
        assertEquals(4, new Yahtzee(1,2,3,2,6).twos());
        assertEquals(10, new Yahtzee(2,2,2,2,2).twos());
    }

    @Test
    public void test_threes() {
        assertEquals(6, new Yahtzee(1,2,3,2,3).threes());
        assertEquals(12, new Yahtzee(2,3,3,3,3).threes());
    }

    @Test
    public void fours_test() 
    {
        assertEquals(12, new Yahtzee(4,4,4,5,5).fours());
        assertEquals(8, new Yahtzee(4,4,5,5,5).fours());
        assertEquals(4, new Yahtzee(4,5,5,5,5).fours());
    }

    @Test
    public void fives() {
        assertEquals(10, new Yahtzee(4,4,4,5,5).fives());
        assertEquals(15, new Yahtzee(4,4,5,5,5).fives());
        assertEquals(20, new Yahtzee(4,5,5,5,5).fives());
    }

    @Test
    public void sixes_test() {
        assertEquals(0, new Yahtzee(4,4,4,5,5).sixes());
        assertEquals(6, new Yahtzee(4,4,6,5,5).sixes());
        assertEquals(18, new Yahtzee(6,5,6,6,5).sixes());
    }

    @Test
    public void one_pair() {
        assertEquals(6, new Yahtzee(3,4,3,5,6).score_pair());
        assertEquals(10, new Yahtzee(5,3,3,3,5).score_pair());
        assertEquals(12, new Yahtzee(5,3,6,6,5).score_pair());
    }

    @Test
    public void two_Pair() {
        assertEquals(16, new Yahtzee(3,3,5,4,5).two_pair());
        assertEquals(16, new Yahtzee(3,3,5,5,5).two_pair());
    }

    @Test
    public void three_of_a_kind() 
    {
        assertEquals(9, new Yahtzee(3,3,3,4,5).three_of_a_kind());
        assertEquals(15, new Yahtzee(5,3,5,4,5).three_of_a_kind());
        assertEquals(9, new Yahtzee(3,3,3,3,5).three_of_a_kind());
    }

    @Test
    public void four_of_a_knd() {
        assertEquals(12, new Yahtzee(3,3,3,3,5).four_of_a_kind());
        assertEquals(20, new Yahtzee(5,5,5,4,5).four_of_a_kind());
        assertEquals(9, new Yahtzee(3,3,3,3,3).three_of_a_kind());
    }

    @Test
    public void smallStraight() {
        assertEquals(15, new Yahtzee(1,2,3,4,5).smallStraight());
        assertEquals(15, new Yahtzee(2,3,4,5,1).smallStraight());
        assertEquals(0, new Yahtzee(1,2,2,4,5).smallStraight());
    }

    @Test
    public void largeStraight() {
        assertEquals(20, new Yahtzee(6,2,3,4,5).largeStraight());
        assertEquals(20, new Yahtzee(2,3,4,5,6).largeStraight());
        assertEquals(0, new Yahtzee(1,2,2,4,5).largeStraight());
    }

    @Test
    public void fullHouse() {
        assertEquals(18, new Yahtzee(6,2,2,2,6).fullHouse());
        assertEquals(0, new Yahtzee(2,3,4,5,6).fullHouse());
    }
}
