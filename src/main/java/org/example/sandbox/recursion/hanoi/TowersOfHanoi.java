package org.example.sandbox.recursion.hanoi;

import java.math.BigInteger;

public class TowersOfHanoi {

    //immutable BigInteger; represents in two's complement form. operates just like int, but with no overflow or upper limit.
    //uses a string versus an int to represent the value. Good for modular arithmetic, bit manipulation, etc.
    //it is slower performance than int
    public static BigInteger counter = BigInteger.ZERO;

    public static void solve(int n, char source, char auxiliary, char destination) {

        //base case
        if (n <= 1) {
            //System.out.println("Move disk 1 from " + source + " to " + destination);
            counter = counter.add(BigInteger.ONE);
            return;
        }

        //move n-1 disks from source to auxiliary
        solve(n - 1, source, destination, auxiliary);
        //System.out.println("Move disk " + n + " from " + source + " to " + destination);
        counter = counter.add(BigInteger.ONE);

        //move n-1 disks from auxiliary to destination
        solve(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        for(int n = 3; n <=10; n++){
            counter = BigInteger.ZERO;
            System.out.println("Solving for n = " + n);
            solve(n, 'A', 'B', 'C');
            System.out.println("Total moves: " + counter.toString());
            System.out.println();
        }

    }
    //2^n - 1 is the growth function
    //2^n is the worst-case time complexity
}
