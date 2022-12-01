import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArtWordProblem {
    public static void main(String[] args) throws IOException {

        int[][] answer = digitizeArtwork();

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                System.out.printf("%d ", answer[i][j]);
            }
            System.out.println();
        }

    }

    public static int[][] digitizeArtwork() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("tile.txt"));
        ArrayList<Integer[]> token = new ArrayList<>();
        String line = reader.readLine();

        while (line != null) {
            Integer[] newLine = new Integer[line.length()];
            for (int i = 0; i < line.length(); i++) {
                newLine[i] = Character.getNumericValue(line.charAt(i));
            }
            token.add(newLine);
            line = reader.readLine();
        }

        int[][] fullVersion = new int[token.size() * 5][token.get(0).length * 5];
        int counter = 0;
        for (int i = 0; i < token.size(); i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < token.get(0).length; k++) {
                    if (token.get(i)[k] + j > 9) {
                        fullVersion[i][counter] = (token.get(i)[k] + j) - 9;
                    } else {
                        fullVersion[i][counter] = token.get(i)[k] + j;
                    }
                    counter++;
                }
            }
            counter = 0;
        }

        for (int i = 0; i < fullVersion.length - 10; i++) {
            for (int j = 0; j < fullVersion[0].length; j++) {
                if (fullVersion[i][j] + 1 > 9) {
                    fullVersion[i+10][j] = 1;
                } else {
                    fullVersion[i+10][j] = fullVersion[i][j] + 1;
                }
            }
        }

        return fullVersion;
    }
}
