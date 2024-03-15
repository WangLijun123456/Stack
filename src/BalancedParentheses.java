import java.util.Stack;

//public class BalancedParentheses {
    class BalancedParentheses {
        public boolean isBalanced(String expression) {
    Stack<Character> stack = new Stack<>();
    //public void balancedParentheses(String expression) {
        int length = expression.length();


        if(length >0){
            for(char bracket: expression.toCharArray()) {
                if(bracket =='{' || bracket == '(' || bracket == '[') {
                   stack.push(bracket);
                } else if (bracket == '}' || bracket == ')' || bracket == ']'){
                  if(stack.isEmpty() || !isItBalanced(stack.pop(),bracket)){
                   // System.out.println("The expression is not balanced");
                    return false;
                  }
                }
            }
            return stack.isEmpty(); // expression is balanced if stack is empty
           // System.out.println("The expression is balanced");
        }
         else {
            System.out.println("The expression is too short.");
            return true;
        }
    }
    public boolean isItBalanced(char open,char close) {
      
            if(open== '{' && close =='}'){
               return true;

            } else if(open== '(' && close== ')'){
               return true;

            } else if(open == '[' && close==']'){
               return true;

            } 
             return false;
    }

    public static void main(String[] args) {
        BalancedParentheses bp = new BalancedParentheses();
        bp.isBalanced(""); 
}

    }



  

           
      

  