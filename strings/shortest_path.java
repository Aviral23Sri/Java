package strings;
import java.util.*;
public class shortest_path {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the path =>");
        String str = sc.next();
        int x = shortest_path(str);
        System.out.println(x);

    }
    public static int shortest_path(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='e')
            {
                x++;
            }
            else if(str.charAt(i)=='w')
            {
                x--;
            }
            else if(str.charAt(i)=='n')
            {
                y++;
            }
            else if(str.charAt(i)=='s')
            {
                y--;
            }
        }
       int x2 = x*x;
       int y2 = y*y;
       int shortest_path = x2+y2;
       shortest_path = (int)Math.sqrt(shortest_path);

        return shortest_path;
    }
}
