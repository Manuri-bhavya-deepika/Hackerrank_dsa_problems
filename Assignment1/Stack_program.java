package Assignment1;
import java.io.*;
import java.util.*;
class Stack_program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            String s = sc.nextLine();
            System.out.println(check(s));
        }
    }
    public static boolean check(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(char input: s.toCharArray())
        {
            if(input == '{')
            {
                stack.push('}');
            }
            else if(input == '(')
            {
               stack.push(')');
            }
            else if(input == '[')
            {
               stack.push(']');
            } 
            else if(stack.isEmpty() || input != stack.pop())
            {
               return false;
            }
        }
    return stack.isEmpty();
    }
}

