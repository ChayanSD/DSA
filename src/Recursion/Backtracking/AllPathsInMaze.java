package Recursion.Backtracking;

public class AllPathsInMaze {
    public static void main(String[] args) {
        //I can go up,down,left,right.\
        boolean [][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        allPath("",maze,0,0);
    }
    static void allPath(String p,boolean [][] maze, int r ,int c){
        //Corners most coordinate from array
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        //for my obstacle
        if(!maze[r][c]){
            return;
        }
        //i am considering this block on my path
        maze[r][c] = false;

        //Cause here i am starting my array from 0 th index to last.
        if(r <maze.length-1){
            allPath(p+'D',maze,r+1,c);
        }
        if(c < maze[0].length-1){
            allPath(p+'R',maze,r,c+1);
        }
        //go to up
        if(r>0){
            allPath(p+'U',maze,r-1,c);
        }
        if(c>0){
            allPath(p+'U',maze,r,c-1);
        }
    //this line where the function call will be over
        //so before the function get removes , also remove the changes that were made by this function.
        //This is called Backtracking.
        //So now reverse the process
        maze[r][c] = true;
    }
}
