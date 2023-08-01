package Recursion.Backtracking;

import java.util.Arrays;

public class PrintAllPathWithMatrix {
    public static void main(String[] args) {
        boolean [][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int [][] path = new int[maze.length][maze[0].length];
        printPathWithMatrix("",maze,0,0,path,1);
    }
    static void printPathWithMatrix(String p,boolean [][] maze, int r ,int c,int [][] path,int steps){
        //Corners most coordinate from array
        if(r == maze.length-1 && c == maze[0].length-1){
            path[r][c] =steps;//this last step is also a step.
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }
        //for my obstacle
        if(!maze[r][c]){
            return;
        }
        //i am considering this block on my path
        maze[r][c] = false;
        path[r][c] =steps;

        //Cause here i am starting my array from 0 th index to last.
        if(r <maze.length-1){
            printPathWithMatrix(p+'D',maze,r+1,c,path,steps+1);
        }
        if(c < maze[0].length-1){
            printPathWithMatrix(p+'R',maze,r,c+1,path,steps+1);
        }
        //go to up
        if(r>0){
            printPathWithMatrix(p+'U',maze,r-1,c,path,steps+1);
        }
        if(c>0){
            printPathWithMatrix(p+'U',maze,r,c-1,path,steps+1);
        }
        //this line where the function call will be over
        //so before the function get removes , also remove the changes that were made by this function.
        //This is called Backtracking.
        //So now reverse the process
        maze[r][c] = true;
        path[r][c]=0;
    }
}
