import java.awt.Color;
import java.util.Random;
public class TurtleWorld
{
    public static void main(String args[])
           throws InterruptedException
    {
        World turtleWorld = new World(1920,1080);
        Turtle t1 = new Turtle(turtleWorld);
        Turtle t2 = new Turtle(turtleWorld);
        Random r = new Random();
        Color body3 = new Color(r.nextInt(255) + 1,r.nextInt(255) + 1,r.nextInt(255) + 1);
        t1.setBodyColor(body3);
        Color body4 = new Color(r.nextInt(255) + 1,r.nextInt(255) + 1,r.nextInt(255) + 1);
        t2.setBodyColor(body4);
     
       
        
        int count = 0;
        while (count != -1)
        {
            if (count <= 4)              
            {
                count += 1;
                t1.turnRight();
                t2.turnLeft();
                t1.forward(100);
                t2.forward(100);
                Thread.sleep(1000);
           }
           if (count > 4) 
           {
               count +=1;
                int move = r.nextInt(10);
               if (move == 0)
               {
                   t1.forward(100);
                      
                }
               if (move == 1)
               {
                   t2.forward(100);
                   
                   
                }
               if (move == 2)
               {
                   t1.turnLeft();
                   t1.forward(100);
                      
                }
               if (move == 3)
               {
                   t2.turnLeft();
                   t2.forward(100);
                      
                }
               if (move == 4)
               {
                   t1.turnRight();
                   t1.forward(100);
                      
                }
               if (move == 5)
               {
                   t2.turnRight();
                   t2.forward(100);
                   
                }
               if (move == 6)
               {
                   Color body2 = new Color(r.nextInt(255) + 1,r.nextInt(255) + 1,r.nextInt(255) + 1);
                   t2.setBodyColor(body2);
                   
                }
               if (move == 7)
               {
                   Color body1 = new Color(r.nextInt(255) + 1,r.nextInt(255) + 1,r.nextInt(255) + 1);
                   t1.setBodyColor(body1);
                      
                }
               if (move == 8)
               {
                   t1.setPenWidth(r.nextInt(50));
                      
                }
               if (move == 9)
               {
                   t2.setPenWidth(r.nextInt(50));
                      
                }
                
            }
        }
        
    }
}
