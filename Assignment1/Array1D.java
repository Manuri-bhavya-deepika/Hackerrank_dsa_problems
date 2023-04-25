package Assignment1;
import java.util.*;
public class Array1D
{
    public static boolean canWin(int leap, int[] game)
    {
        int n = game.length;
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        queue.add(0);
        visited[0] = true;
        while (!queue.isEmpty()) 
        {
            int current = queue.poll();
            if (current == n - 1 || current + leap >= n) 
            {
                return true;
            }
            if (current - 1 >= 0 && game[current - 1] == 0 && !visited[current - 1]) 
            {
                queue.add(current - 1);
                visited[current - 1] = true;
            }
            if (current + 1 < n && game[current + 1] == 0 && !visited[current + 1]) 
            {
                queue.add(current + 1);
                visited[current + 1] = true;
            }
            if (current + leap < n && game[current + leap] == 0 && !visited[current+leap]) 
            {
                queue.add(current + leap);
                visited[current + leap] = true;
            }
        }
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) 
        {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            int[] game = new int[n];
            for (int i = 0; i < n; i++) 
            {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

