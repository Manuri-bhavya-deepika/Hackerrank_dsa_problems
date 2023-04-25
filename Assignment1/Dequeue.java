package Assignment1;
import java.util.*;
class Dequeue
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int max=Integer.MIN_VALUE;
        HashSet<Integer> set=new HashSet<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) 
        {
            int num = sc.nextInt();
            if(deque.size()<k)
            {
                deque.add(num);
                set.add(num);
                max=set.size();
            }
            else
            {
                if(set.size()>max)
                max=set.size();
                Object x=deque.poll();
                if(!deque.contains(x))
                set.remove(x);
                deque.add(num);
                set.add(num);
            }
        }
        System.out.print(max);
    }
}


