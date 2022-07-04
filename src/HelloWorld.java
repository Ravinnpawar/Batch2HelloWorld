import java.util.Stack;

//class <name>{
//
// }
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(isBalanced("{{}}{}"));
        System.out.println(isBalanced("{{{}}"));
        System.out.println(isBalanced("{{{}}}"));
        System.out.println(isBalanced("}{{}{}}{"));

    }
    private static boolean isBalanced(String input) {
        boolean bool = true;
        int count = 0;
        for(int i = 0; i < input.length(); i++)
        {
            if (input.charAt(i) == '{')
            {
                count++;
            }
            else
            {
                count--;
            }
            if (count < 0)
            {
                bool = false;
                break;
            }
        }
        if (count != 0)
        {
            bool = false;
        }
        return bool;
    }
}