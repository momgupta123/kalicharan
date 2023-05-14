/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Roshan
 */
import java.util.List;
public class DepthFirst {
    public static boolean searchpath(int [][] maze,int x,int y,List<Integer>path)
    {
       if(maze[y][x]==9)
       {
           path.add(x);
           path.add(y);
           return true;
       }
       if(maze[y][x]==0)
       {
           maze[y][x]=2;
           int dx=-1;
           int dy=0;
           if(searchpath(maze,x+dx,y+dy,path))
           {
               path.add(x);
               path.add(y);
               return true;
           }
           dx=1;
           dy=0;
           if(searchpath(maze,x+dx,y+dy,path))
           {
               path.add(x);
               path.add(y);
               return true;
           }
           dx=0;
           dy=-1;
           if(searchpath(maze,x+dx,y+dy,path))
           {
               path.add(x);
               path.add(y);
               return true;
               
           }
           dx=0;
           dy=1;
           if(searchpath(maze,x+dx,y+dy,path))
           {
               path.add(x);
               path.add(y);
               return true;
           }
       }
       return false;
    }
}
