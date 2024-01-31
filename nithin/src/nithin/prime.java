package nithin;

import java.util.Scanner;

public class prime {

         boolean isprime(int num) {
            int m = num / 2;
            if (num == 1 || num == 2) {
                return true; // 1 and 2 are prime numbers
            } else {
                for (int i = 2; i <= m; i++) {
                    if (num % i == 0) {
                        return false;
                    }
                }
            }
            return true;
        }

   
}
