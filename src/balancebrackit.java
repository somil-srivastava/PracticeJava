import java.util.*;

class balancebrackit {
    public static void main(String[] args){
        Stack<Character> st = new Stack<>();
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        for(char c: s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            } else if(c == ')'){
               boolean val = handleClosing(st, '(');
               if(val == false){
                   System.out.println(val);
                   return;
               }
            } else if(c == '}'){
                 boolean val = handleClosing(st, '{');
                 if(val == false){
                     System.out.println(val);
                     return;
                 }
            } else if(c == ']'){
                boolean val = handleClosing(st, '[');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }

            }
            if(st.size() == 0){
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
        public static boolean handleClosing(Stack<Character> st, char corrochar){
            if(st.size() == 0){
                    return false;
                } else if(st.peek() == corrochar){
                    return false;
                } else {
                    st.pop();
                    return true;
                }
        }

    }
