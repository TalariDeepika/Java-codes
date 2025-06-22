import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Greatest{

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int result = (a>b) ? ((a>c)?a:c) : ((b>c)?b:c);
        System.out.println(result);
    }
}