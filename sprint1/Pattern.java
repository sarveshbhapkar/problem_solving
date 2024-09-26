public class Pattern {
    
    // Crafting Star Patterns
    // Difficulty: Easy
    // Topics: Basic Programming, Patterns
    // Description: Write a program to create different star patterns (e.g., pyramid, diamond).
    // Example:
    // Input: patternType = "pyramid", height = 5
    // Output:
    
    //     *
    //    ***
    //   *****
    //  *******
    
    // *********

    public static void printPattern(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" *    ");
            }
            System.out.println();
        }
    }

    public static void InvertedTrianglePattern(){
        int rows=5;

        for(int i=rows;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print(" * ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
       // printPattern(8);

    //    InvertedTrianglePattern();
    }
}
