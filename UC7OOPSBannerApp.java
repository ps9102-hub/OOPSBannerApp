// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class UC7OOPSBannerApp {
   public UC7OOPSBannerApp() {
   }

   static String[] getOPattern() {
      return new String[]{" ***** ", "*     *", "*     *", "*     *", "*     *", "*     *", " ***** "};
   }

   static String[] getPPattern() {
      return new String[]{" ***** ", "*     *", "*     *", " ***** ", "*      ", "*      ", "*      "};
   }

   static String[] getSPattern() {
      return new String[]{" ***** ", "*      ", "*      ", " ***** ", "      *", "      *", " ***** "};
   }

   public static void main(String[] var0) {
      CharacterPatternMap[] var1 = new CharacterPatternMap[]{new CharacterPatternMap('O', getOPattern()), new CharacterPatternMap('O', getOPattern()), new CharacterPatternMap('P', getPPattern()), new CharacterPatternMap('S', getSPattern())};

      for(int var2 = 0; var2 < 7; ++var2) {
         StringBuilder var3 = new StringBuilder();

         for(CharacterPatternMap var7 : var1) {
            var3.append(var7.getPattern()[var2]).append("  ");
         }

         System.out.println(var3);
      }

   }

   static class CharacterPatternMap {
      private char character;
      private String[] pattern;

      public CharacterPatternMap(char var1, String[] var2) {
         this.character = var1;
         this.pattern = var2;
      }

      public char getCharacter() {
         return this.character;
      }

      public String[] getPattern() {
         return this.pattern;
      }
   }
}