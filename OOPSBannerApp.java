public class OOPSBannerApp {

    // Inner Static Class
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        String[] O = {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };

        String[] P = {
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        };

        String[] S = {
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        };

        CharacterPatternMap[] patterns = {
            new CharacterPatternMap('O', O),
            new CharacterPatternMap('P', P),
            new CharacterPatternMap('S', S)
        };

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {
            for (char ch : word.toCharArray()) {
                for (CharacterPatternMap obj : patterns) {
                    if (obj.getCharacter() == ch) {
                        System.out.print(obj.getPattern()[row] + "  ");
                    }
                }
            }
            System.out.println();
        }
    }
}