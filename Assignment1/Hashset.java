package Assignment1;
import java.io.*;
import java.util.*;
class Hashset 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);   
        Integer n = Integer.parseInt(sc.nextLine());
        Set<String> list = new HashSet<>();
        for(int i = 0; i < n; i++) 
        {
            String value = sc.nextLine();
            if(!list.contains(value)) 
            {
                list.add(value);
            }
        System.out.println(list.size());
       }   
       sc.close();
    }
}
