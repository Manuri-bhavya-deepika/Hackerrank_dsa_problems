package Assignment1;
import java.io.*;
import java.util.*;
class Bitset 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        java.util.BitSet B1 = new BitSet(N);
        java.util.BitSet B2 = new BitSet(N);
        java.util.BitSet[] bitsets = { B1, B2};
        for(int i= 0; i < M ; i++)
        {
            String op = in.next();
            int a = in.nextInt();
            int b = in.nextInt();
            switch(String.valueOf(op))
            {
                case "AND" :
                {
                    bitsets[a-1].and(bitsets[b-1]);
                    break;
                }
                case "OR" :
                {
                    bitsets[a-1].or(bitsets[b-1]);
                    break;
                }
                case "XOR" :
                {
                    bitsets[a-1].xor(bitsets[b-1]);
                    break;
                }
                case "FLIP" :
                {
                    bitsets[a-1].flip(b);
                    break;
                }
                case "SET" :
                {
                    bitsets[a-1].set(b);
                    break;
                }
            }
            System.out.printf("%d %d\n", B1.cardinality(),B2.cardinality());
        }
    }
}

