import java.util.ArrayDeque;

public class BalancedBraces {

public static boolean balancedBraces(String data){
    ArrayDeque<Character> paren = new ArrayDeque<>();
    for(int i = 0; i < data.length(); i++){
        if(data.charAt(i)=='{'){
            paren.push('{');
        }
        if(data.charAt(i)=='}'){
            paren.pop();
        }
    }
    return paren.isEmpty();
    }//method

    public static void main(String[] args) {
        System.out.println(balancedBraces("{quite} well"));
    }
}//class
