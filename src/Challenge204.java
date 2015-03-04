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
        List<String> macBethList = fileToList();
    }

    private static List<String> fileToList() {
        List<String> macBeth = new ArrayList();
        try {
            BufferedReader macBethFile = new BufferedReader(new FileReader("macbeth.txt"));

//            String currentLine;
//            while ((currentLine = macBethFile.readLine()) != null) {
//                if (currentLine.matches(){
//                    macBeth.add(currentLine);
//                }
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return macBeth;
    }

    private static int findLine(List<String> list, String phrase){
        while (true){

        }
    }
}
