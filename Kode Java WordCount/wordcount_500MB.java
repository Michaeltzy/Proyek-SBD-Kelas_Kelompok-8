import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class wordcount_500MB {

    public static void main(String args[]) throws Exception {

        System.out.println("Counting Words");
        FileReader fr = new FileReader("gutenberg-500M.txt"); //membaca file 
        BufferedReader br = new BufferedReader(fr); //deklarasi br sebagai buffer reader
        String line = br.readLine();
        Map<String, Integer> wordCountMap = new HashMap<>();

        while (line != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
            line = br.readLine();
        }

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ", Count: " + entry.getValue());
        }

        br.close();
        fr.close();
    }
}
