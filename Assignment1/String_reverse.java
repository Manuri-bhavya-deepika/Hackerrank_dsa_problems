package Assignment1;
import java.io.*;
import java.util.*;
class String_reverse 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.println( A.equals( new StringBuilder(A).reverse().toString()) ? "Yes" : "No" );
    }
}

