public class OOPSBannerApp {

    public static void main(String[] args) {

        // UC4: Store banner lines in String Array
        String[] banner = new String[7];

        banner[0] = String.join("   ",
                "  OOOOO  ",
                "  OOOOO  ",
                "  PPPPP  ",
                "  SSSSS  ");

        banner[1] = String.join("   ",
                " OO   OO ",
                " OO   OO ",
                " PP   PP ",
                " SS      ");

        banner[2] = String.join("   ",
                " OO   OO ",
                " OO   OO ",
                " PPPPP   ",
                "  SSSSS  ");

        banner[3] = String.join("   ",
                " OO   OO ",
                " OO   OO ",
                " PP      ",
                "      SS ");

        banner[4] = String.join("   ",
                " OO   OO ",
                " OO   OO ",
                " PP      ",
                " SS   SS ");

        banner[5] = String.join("   ",
                " OO   OO ",
                " OO   OO ",
                " PP      ",
                " SS   SS ");

        banner[6] = String.join("   ",
                "  OOOOO  ",
                "  OOOOO  ",
                " PP      ",
                "  SSSSS  ");

        // Enhanced For Loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}


