public class OOPSBannerApp {

    public static String[] getOPattern() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    public static String[] getPPattern() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
    }

    // Method to print a pattern
    public static void printPattern(String[] pattern) {
        for (String line : pattern) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        System.out.println("Letter O:");
        printPattern(getOPattern());

        System.out.println("\nLetter P:");
        printPattern(getPPattern());

        System.out.println("\nLetter S:");
        printPattern(getSPattern());
    }
}