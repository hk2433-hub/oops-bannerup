public class OOPSBannerUC4 {
    public static void main(String[] args) {
        String[] bannerLines = new String[7];

        
      
        bannerLines[0] = String.join("  ", " ******* ", " ******* ", " ******* ", "  ***** ");
        bannerLines[1] = String.join("  ", "* *", "* *", "* *", " * * ");
        bannerLines[2] = String.join("  ", "* *", "* *", "* *", "* *");
        bannerLines[3] = String.join("  ", "* *", "* *", "******* ", " ******* ");
        bannerLines[4] = String.join("  ", "* *", "* *", "* ", "      * ");
        bannerLines[5] = String.join("  ", "* *", "* *", "* ", "     * ");
        bannerLines[6] = String.join("  ", " ******* ", " ******* ", "* ", "  *** ");

        System.out.println("--- OOPS Banner (UC4: String Array & Loop) ---\n");
        
        for (String line : bannerLines) {
            System.out.println(line);
        }
        
        System.out.println("\n----------------------------------------------");
    }
}