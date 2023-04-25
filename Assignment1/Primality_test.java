package Assignment1;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
class Primality_test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();

        BigInteger e = new BigInteger(n);
        boolean probablePrime = e.isProbablePrime(13);
        String p = probablePrime ? "prime": "not prime";
        System.out.println(p);
        bufferedReader.close();
    }
}
