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
        retutn new ArrayList<String>;
    }
}
