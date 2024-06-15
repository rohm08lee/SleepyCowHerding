import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new FileReader("herding.in"));
        PrintWriter pw = new PrintWriter("herding.out");

        int[] order = new int[3];
        for (int i = 0; i < 3; i++) {
            order[i] = sc.nextInt();
        }
        Arrays.sort(order);
        if(order[1] - order[0] == 2 || order[2] - order[1] == 2){
            pw.println(1);
        } else if (order[2] == order[0] + 2){
            pw.println(0);
        } else {
            pw.println(2);
        }

        pw.println(Math.max(order[1]-order[0], order[2]-order[1]) - 1);
        pw.close();
    }
}
