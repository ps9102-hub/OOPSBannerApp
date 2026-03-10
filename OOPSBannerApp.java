import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static Map<Character, String[]> createPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        map.put('P', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        });

        map.put('S', new String[]{
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        });

        return map;
    }

    public static void displayBanner(String word) {

        Map<Character, String[]> map = createPatternMap();

        for(int row=0; row<7; row++){

            StringBuilder line = new StringBuilder();

            for(char c : word.toCharArray()){
                line.append(map.get(c)[row]).append(" ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        displayBanner("OOPS");
    }
}
