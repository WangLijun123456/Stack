import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BalancedParentheses balancedParentheses = new BalancedParentheses();
        
        while (true) {
            System.out.print("Enter an expression with parentheses (or type 'quit' to exit): ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Exiting program.");
                break;
            }
            
            if (balancedParentheses.isBalanced(input)) {
                System.out.println("The expression is balanced");
            } else {
                System.out.println("The expression is not balanced");
            }
          
        }
        
        scanner.close();
    }
}



