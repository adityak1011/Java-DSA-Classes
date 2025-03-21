package Stack;
import java.util.*;

public class Ques {/* 
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for(int i=arr.length-1; i>0; i--) {
            //1 while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            //2 if-else
            if(s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }

            //3 push in stack
            s.push(i);
        }

        for(int i=0; i<nxtGreater.length; i++) {
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();
    }
        */

        public static boolean isValid(String str) { //O(n)
            Stack<Character> s = new Stack<>();

            for(int i=0; i<str.length(); i++) {
                char ch = str.charAt(i);

                if(ch == '(' || ch == '{' || ch == '[') { //opening
                    s.push(ch);
                } else{
                    //closing
                    if(s.isEmpty()) {
                        return false;
                    }
                    if( (s.peek() == '(' && ch == ')' ) //()
                        || (s.peek() == '{' && ch == '}') //{}
                        || (s.peek() == '[' && ch == ']') ) { //[]
                            s.pop();
                    } else {
                        return false;
                    }
                }
            }

            if(s.isEmpty()) {
                return true;
            } else {
                return false;
            }
        }

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            //closing
            if(ch == ')') {
                int count = 0;
                while(s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count < 1) {
                    return true; //duplicate
                } else {
                    s.pop();
                }
            } else {
                //opening
                s.push(ch);
            }
        }

        return false;
    }
    public static void main(String[] args) {
        //Valid String
        String str = "((a+b))"; //true
        String str2 = "(a+b)"; //false
        System.out.println(isDuplicate(str));
    }
}
