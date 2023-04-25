package Assignment1;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
class Java_2d_array 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[][] mat = new String[6][6];
        for(int i=0;i<6;i++) 
        {
            mat[i] = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        }
        bufferedReader.close();
        int max=Integer.MIN_VALUE;
        for(int g=0;g<4;g++) 
        {
            for(int h=0;h<4;h++) 
            {
                int sum=0;
                for(int i=g;i<g+3;i++) 
                {
                    for(int j=h;j<h+3;j++) 
                    {
                        if(i!=g+1) 
                        {
                            sum+=Integer.parseInt(mat[i][j]);
                        }
                        else if(j==h+1)
                        {
                            sum+=Integer.parseInt(mat[i][j]);
                        }
                    }
                }
                if(sum>max) max=sum;
            }
        }   
        System.out.println(max);
    }        
}
