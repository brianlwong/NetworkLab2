package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s;
        int[] src = new int[10]; //source, destination, and cost arrays created
        int[] dest = new int[10]; //array size 10 because lab specifies no more than 6 different nodes
        int[] cost = new int[10];

        try{
            s = new Scanner(new File("C:\\Users\\Brian\\Documents\\GitHub\\NetworkLab2\\src\\com\\company\\test.txt"));

            int i = 0;
            while(s.hasNextInt()){ //error will occur if file not in format 'source dest cost' from txt file
                src[i] = s.nextInt();
                dest[i] = s.nextInt();
                cost[i] = s.nextInt();
                i++;

            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
