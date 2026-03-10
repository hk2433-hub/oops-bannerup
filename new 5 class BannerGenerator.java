
public class BannerGenerator {

    
    public static String[] getPatternForChar(char target, CharacterPatternMap[] maps) {
        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == target) {
                return map.getPattern();
            }
        }
        return new String[0]
    }

    
     
    public static void printBanner(String word, CharacterPatternMap[] maps) {
        int bannerHeight = 5; // Assuming standard 5-row height for patterns

        for (int i = 0; i < bannerHeight; i++) {
            StringBuilder rowBuilder = new StringBuilder();
            for (char c : word.toCharArray()) {
                String[] pattern = getPatternForChar(c, maps);
                if (pattern.length > i) {
                    rowBuilder.append(pattern[i]).append("  ");
                }
            }
            System.out.println(rowBuilder.toString());
        }
    }

    ss that encapsulates a character and its visual representation.
     */
    private static class CharacterPatternMap {
        private final char character;
        private final String[] pattern;

       
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

      
        public char getCharacter() {
            return character;
        }

        /**
         * @return the pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

     {
        // Initializing data using an Array of Objects
        CharacterPatternMap[] maps = {
            new CharacterPatternMap('O', new String[]{
                "  *** ", 
                " * * ", 
                " * * ", 
                " * * ", 
                "  *** "
            }),
            new CharacterPatternMap('P', new String[]{
                " **** ", 
                " * * ", 
                " **** ", 
                " * ", 
                " * "
            }),
            new CharacterPatternMap('S', new String[]{
                "  **** ", 
                " * ", 
                "  *** ", 
                "     * ", 
                " **** "
            })
        };

        System.out.println("--- Stylized OOPS Banner ---\n");
        printBanner("OOPS", maps);
    }
}