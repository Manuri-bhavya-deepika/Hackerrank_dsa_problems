package Assignment1;
import java.io.*;
import java.util.*;
class Regex
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            String IP = sc.next();
            System.out.println(IP.matches(new newRegex().pattern));
        }
    }
} 
class newRegex 
{
    String numbb = "(([01]?\\d{1,2})|(2[0-4]\\d)|(25[0-5]))";
    String pattern = String.format("%s.%s.%s.%s", numbb, numbb, numbb, numbb);
}

