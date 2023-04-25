package Assignment1;
import java.io.*;
import java.util.*;
class Arraylist
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Noarr = sc.nextInt();
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < Noarr; i++) 
        {
            int Ele = sc.nextInt();
            ArrayList<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < Ele; j++) 
            {
                int e = sc.nextInt();
                row.add(e);
            }
            a.add(row);
        }
        int Nque = sc.nextInt();
        for (int i = 0; i < Nque; i++)
        {
                int j = sc.nextInt();
                int k = sc.nextInt();
                if (j <= 0 || j > Noarr)
                {
                    System.out.println("ERROR!");
                }
                else if (k <= 0 || k > a.get(j-1).size()) 
                {
                    System.out.println("ERROR!");
                }
                else 
                {
                    System.out.println(a.get(j-1).get(k-1));
                }
        }
        sc.close();
    }
}

