package btu;
import java.lang.*;

public class N7 {
    public static int gcd(int a, int b) {
        if (a == 0)
            return b;

        return gcd(b%a, a);
    }

    static int lcm(int a, int b)
    {
        return (a*b)/gcd(a, b);
    }

    public static void main(String[] args)
    {
        int a = 25, b = 12;
        System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
        System.out.println("LCM of " + a +" and " + b + " is " + lcm(a, b));

    }
}
