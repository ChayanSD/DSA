package Recursion.Backtracking;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {
//        System.out.println("Reach point A to point B :"+ (countPath(3,3))+" Path");
//        printPath("",3,3);
//        System.out.println(pathReturn("",3,3));
        boolean [][] maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
    mazeWithObstacle("",maze,0,0);
    }
    static int countPath(int r, int c ){
        if(r==1 || c == 1 ){
            return 1;
        }
        int left = countPath(r-1,c);
        int right = countPath(r,c-1);
        return left+ right;
    }

    static void printPath(String p , int r , int c){
        if(r==1 && c ==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            printPath(p+'D',r-1,c);
        }

        if(c>1){
            printPath(p+'R',r,c-1);
        }
    }
    static ArrayList<String> pathReturn(String p , int r , int c){
        if(r==1 && c == 1){
          ArrayList<String> list = new ArrayList<>();
          list.add(p);
          return list;
        }
        ArrayList<String> list = new ArrayList<>();
        //Also we can go diagonally
        if(r>1 && c > 1){
            list.addAll(pathReturn(p+"Dia",r-1,c-1));
        }
        if(r>1){
            list.addAll(pathReturn(p+'D',r-1,c));
        }
        if(c>1){
            list.addAll(pathReturn(p+'R',r,c-1));
        }
        return list;
    }
//Here I am starting from 0 ,0 .
    static void mazeWithObstacle(String p,boolean [][] maze, int r ,int c){
        //Corners most coordinate from array
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
    //for my obstacle
        if(maze[r][c]==false){
            return;
        }

        //Cause here i am starting my array from 0 th index to last.
        if(r <maze.length-1){
            mazeWithObstacle(p+'D',maze,r+1,c);
        }
        if(c < maze[0].length-1){
            mazeWithObstacle(p+'R',maze,r,c+1);
        }
    }
}
