import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The Major Element
 *
 * Given a list L of integers separated by a comma, return the major element of L.
 * Major element = the integer that appears in L more than L/2 times.
 * If no major element is found, return 'None'.
 *
 * Based on this codeeval challenge:
 * https://www.codeeval.com/open_challenges/132/
 *
 * @author: todyerutz@plainitricacy.wordpress.com
 */

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Tudor/IdeaProjects/Major_Element/src/L.txt"));
        List<Integer> ary = new ArrayList<Integer>();
        String ln;
        while((ln = reader.readLine())!=null){
            ary.clear();
            String[] pieces = ln.split(",");
            for(String i:pieces){
                ary.add(Integer.parseInt(i));
            }
            FindME(ary);
        }
        reader.close();
    }

    public static void FindME(List<Integer> q){
        String out = new String();
        System.out.println("List:");
        for(int i:q){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=0; i<q.size(); i++){
            int rep=0;
            out = "None";
            for(int j=0; j<q.size(); j++){
                if(q.get(j)==q.get(i)){
                    rep++;
                }
            }
            if(rep>(q.size()/2)){
                out=String.valueOf(q.get(i));
            }
        }
        System.out.println("Major element: " + out);
        System.out.println();
    }
}
