import java.io.*;
import java.util.*;

public class Asciivalue{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int ans=ch;
            System.out.print(ans+" ");
        }
    }
}