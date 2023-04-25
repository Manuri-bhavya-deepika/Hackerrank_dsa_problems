package Assignment1;
import java.io.*;
import java.util.*;
class Genrics
{
    public static <E> void printArray(E[] inputArray)
    {
        for (E element : inputArray) 
        {
            System.out.println(element);
        }
    }
    public static void main(String[] args) 
    {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        printArray(intArray);
        printArray(stringArray);
    }
}

