import java.utils.*;

public class Prob4{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scam.nextInt();
        for(int i = 0; i < n; i++){
            String prefix = scan.nextLine();
            ArrayList<String> equation = new ArrayList<>;
            for(int t = 0; t<prefix.length; t++){
                equation.add(prefix.charAt(t));
            }
            while(equation.size()!=1){
                equation = solver(equation);
            }
            System.out.println(equation.get(0));
        }
    }

    public static ArrayList<String> solver(new ArrayList<String> prefix){
        return new ArrayList<String>;
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }

    public static int mult(int a, int b){
        return a * b;
    }

    public static int switcher(int a, int b, int c){ // that's the weird @ thing
        if (a >= 0){
            return b;
        }
        return c;
    }

    public static int max(int a, int b, int c){
        return Math.max(a,Math.max(b,c));
    }
}
