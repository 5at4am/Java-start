import java.util.*;

public class NEWS 
{
    public static float getshort(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            //south
            if(dir =='S'){
                y--;
            }else if(dir =='N'){
                y++;
            }else if(dir == 'E'){
                x++;
            }else{
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements : ");
        String path ="WNEENESENNN";

        System.out.println(getshort(path));
        sc.close();
    }
}