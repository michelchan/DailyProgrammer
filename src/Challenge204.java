import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Michelle Chan, 109303129
 *
 * http://www.reddit.com/r/dailyprogrammer/comments/2xoxum/20150302_challenge_204_easy_remembering_your_lines/
 */
public class Challenge204 {

    public static void main(String[] args) {
        System.out.println("Enter line: ");
        Scanner s = new Scanner(System.in);
        String phrase = s.nextLine();

        if (!findLine(phrase)){
            System.out.println("Line not found in MacBeth");
        }
    }

    private static boolean findLine(String phrase) {
        try {
            BufferedReader macBethFile = new BufferedReader(new FileReader("macbeth.txt"));
            int lineCount = 0;
            List<String> macBeth = new ArrayList(); //stores lines of Macbeth to an ArrayList

            String currentLine;
            while ((currentLine = macBethFile.readLine()) != null) {
                macBeth.add(currentLine);
                if (currentLine.equals(phrase)) {
                    for (int i = 0; i < 4; i++) {
                        macBeth.add(macBethFile.readLine());
                    }
                    printLines(macBeth, lineCount);
                    return true;
                }
                lineCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private static void printLines(List<String> file, int lineNumber){
        for (int i = lineNumber; i<lineNumber+4; i++){
            System.out.println(file.get(i));
        }
    }
}
