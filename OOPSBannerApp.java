public class OOPSBannerApp {

    public static void main(String[] args) {

        // UC5: Inline Array Initialization with String.join()
        String[] banner = {
                String.join("   ",
                        "  OOOOO  ",
                        "  OOOOO  ",
                        "  PPPPP  ",
                        "  SSSSS  "),

                String.join("   ",
                        " OO   OO ",
                        " OO   OO ",
                        " PP   PP ",
                        " SS      "),

                String.join("   ",
                        " OO   OO ",
                        " OO   OO ",
                        " PPPPP   ",
                        "  SSSSS  "),

                String.join("   ",
                        " OO   OO ",
                        " OO   OO ",
                        " PP      ",
                        "      SS "),

                String.join("   ",
                        " OO   OO ",
                        " OO   OO ",
                        " PP      ",
                        " SS   SS "),

                String.join("   ",
                        " OO   OO ",
                        " OO   OO ",
                        " PP      ",
                        " SS   SS "),

                String.join("   ",
                        "  OOOOO  ",
                        "  OOOOO  ",
                        " PP      ",
                        "  SSSSS  ")
        };

        // Enhanced For Loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}


