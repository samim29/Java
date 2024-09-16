
import java.util.Arrays;


public class ArrayTutorial{
    public static void main(String[] args){
        // creating array
        int [] marks= new int[3];
        marks[0]=97;
        marks[1]=98;
        marks[2]=65;
        System.out.println(marks[0]);

        //initialization
        //if not initialize it by default null or 0
        int[] marks1 =new int[3];
        System.out.println(marks1[2]);

        //length
        System.out.println(marks.length);//here we don't use parenthesis as it's is property of array not a funtion but in case of string we use parenthesis as str.length()
        
        //sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        //initialization
        int[] marks3={93,98,95};

        int[][] finalmarks={{97,98,95},{95,95,95}}; //2d array
        System.out.println(finalmarks[0][0]);
    
    }
}