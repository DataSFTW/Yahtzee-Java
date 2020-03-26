package com.kata;

public class Yahtzee {

   protected static int[] des;
   public Yahtzee(int d1, int d2, int d3, int d4, int d5)
    {
        des = new int[5];
        des[0] = d1;
        des[1] = d2;
        des[2] = d3;
        des[3] = d4;
        des[4] = d5;
    }
    
	
    public static int chance()
    {
        int res = des[0]+des[1]+des[2]+des[3]+des[4];
        return res;
    }

    public static int yahtzeeRes()
    {
        for (int i = 1; i < des.length; i++)
            if (des[i] != des[0])
            	return 0;
        return 50;
    }

    public static int ones()
    {
        int res = 0;
        for (int i = 0; i < des.length; i++) 
            if (des[i] == 1)
            	
                res += 1;
        return res;
    }

    public static int twos()
    {
        int res = 0;
        for (int i = 0; i < des.length; i++) 
            if (des[i] == 2)
                res += 2;
        return res;
    }

    public static int threes ()
    {
        int res = 0;
        for (int i = 0; i < des.length; i++) 
            if (des[i] == 3)
                res += 3;
        return res;
    }

    public static int fours()
    {
        int res = 0;
        for (int i = 0; i < des.length; i++) 
            if (des[i] == 4)
                res += 4;
        return res;
    }

    public static int fives()
    {
        int res = 0;
        for (int i = 0; i < des.length; i++) 
            if (des[i] == 5)
                res += 5;
        return res;
    }

    public static int sixes()
    {
        int res = 0;
        for (int i = 0; i < des.length; i++) 
            if (des[i] == 6)
                res += 6;
        return res;
    }
    
    public static int score_pair()
    {
        int[] occur = new int[6];
        occur[des[0]-1]++;
        occur[des[1]-1]++;
        occur[des[2]-1]++;
        occur[des[3]-1]++;
        occur[des[4]-1]++;
        int at;
        for (at = 0; at != 6; at++)
            if (occur[6-at-1] >= 2)
                return (6-at)*2;
        return 0;
    }

    public static int two_pair()
    {
        int[] occur = new int[6];
        occur[des[0]-1]++;
        occur[des[1]-1]++;
        occur[des[2]-1]++;
        occur[des[3]-1]++;
        occur[des[4]-1]++;
        int n = 0;
        int score = 0;
        for (int i = 0; i < 6; i += 1)
            if (occur[6-i-1] >= 2) {
                n++;
                score += (6-i);
            }        
        if (n == 2)
            return score * 2;
        else
            return 0;
    }

    public static int four_of_a_kind()
    {
        int[] occur;
        occur = new int[6];
        occur[des[0]-1]++;
        occur[des[1]-1]++;
        occur[des[2]-1]++;
        occur[des[3]-1]++;
        occur[des[4]-1]++;
        for (int i = 0; i < 6; i++)
            if (occur[i] >= 4)
                return (i+1) * 4;
        return 0;
    }

    public static int three_of_a_kind()
    {
        int[] occur;
        occur = new int[6];
        occur[des[0]-1]++;
        occur[des[1]-1]++;
        occur[des[2]-1]++;
        occur[des[3]-1]++;
        occur[des[4]-1]++;
        for (int i = 0; i < 6; i++)
            if (occur[i] >= 3)
                return (i+1) * 3;
        return 0;
    }

    public static int smallStraight()
    {
        int[] occur;
        occur = new int[6];
        occur[des[0]-1]++;
        occur[des[1]-1]++;
        occur[des[2]-1]++;
        occur[des[3]-1]++;
        occur[des[4]-1]++;
        if (occur[0] == 1 &&
            occur[1] == 1 &&
            occur[2] == 1 &&
            occur[3] == 1 &&
            occur[4] == 1)
            return 15;
        return 0;
    }

    public static int largeStraight()
    {
        int[] occur;
        occur = new int[6];
        occur[des[0]-1]++;
        occur[des[1]-1]++;
        occur[des[2]-1]++;
        occur[des[3]-1]++;
        occur[des[4]-1]++;
        if (occur[1] == 1 &&
            occur[2] == 1 &&
            occur[3] == 1 &&
            occur[4] == 1 &&
            occur[5] == 1)
            return 20;
        return 0;
    }

    public static int fullHouse()
    {
        int[] occur;
        boolean paire = false;
        int i;
        int _2_at = 0;
        boolean _3 = false;
        int _3_at = 0;


        occur = new int[6];
        occur[des[0]-1]++;
        occur[des[1]-1]++;
        occur[des[2]-1]++;
        occur[des[3]-1]++;
        occur[des[4]-1]++;

        for (i = 0; i != 6; i++)
            if (occur[i] == 2) {
                paire = true;
                _2_at = i+1;
            }

        for (i = 0; i != 6; i++)
            if (occur[i] == 3) {
                _3 = true;
                _3_at = i+1;
            }

        if (paire && _3)
            return _2_at * 2 + _3_at * 3;
        else
            return 0;
    }
}




