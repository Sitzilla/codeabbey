package main.java.problems._003;
import java.io.*;

/**
 * Created by evan on 7/19/15.
 */

// Command line arguments: /Users/evan/workspace/codeabbey/src/main/java/problems/_003/input
public class _003 {

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/evan/workspace/codeabbey/src/main/java/problems/_003/input");


        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }

    }

}
