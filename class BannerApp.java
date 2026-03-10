import java.util.HashMap;
import java.util.Map;


public class BannerApp {

   
    public static void initializePatterns() {
        patternMap.put('O', new String[]{
            "  *** ",
            " * * ",
            " * * ",
            " * * ",
            "  *** "
        });
        patternMap.put('P', new String[]{
            " **** ",
            " * * ",
            " **** ",
            " * ",
            " * "
        });
        patternMap.put('S', new String[]{
            "  **** ",
            " * ",
            "  *** ",
            "     * ",
            " **** "
        });
    }

   
    public static void printBanner(String word) {
        int bannerHeight = 5; // The number of rows in each character pattern

      
        for (int i = 0; i < bannerHeight; i++) {
            StringBuilder rowBuilder = new StringBuilder();
            
        
            for (char c : word.toUpperCase().toCharArray()) {
                String[] pattern = patternMap.get(c);
                
                if (pattern != null) {
                    // Append the specific row of the character's pattern
                    rowBuilder.append(pattern[i]).append("  ");
                }
            }
            // Print the fully constructed row
            System.out.println(rowBuilder.toString());
        }
    }

    // Part 3: Main Method

    public static void main(String[] args) {
        // Step 1: Initialize the character pattern library
        initializePatterns();

        // Step 2: Visual Header for the output
        System.out.println("--- Stylized OOPS Banner (UC8 - HashMap) ---");
        System.out.println();

        // Step 3: Call the modular display function
        // This abstracts the rendering logic from the main execution
        printBanner("OOPS");
        
        System.out.println("\n--- Program Exited ---");
    }
}