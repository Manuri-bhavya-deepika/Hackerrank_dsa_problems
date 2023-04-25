package Assignment1;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class List 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        List<Integer> myList = new ArrayList<Integer>();
        for(int i = 0 ; i < a; i++ )
        {
            int data = sc.nextInt();
            myList.add(data);
        }
        int b = sc.nextInt();
        for (int j = 0; j < b ; j++)
        {
            String Q = sc.next();
            if(Q.equals("Insert"))
            {
                int x = sc.nextInt(); 
                int y = sc.nextInt();
                myList.add(x, y);
            }
            if(Q.equals("Delete"))
            {
                int x = sc.nextInt(); 
                myList.remove(x);
            }
        }
        for(Integer list : myList)
        {
            System.out.print(+list+" ");
        }
    }
}
