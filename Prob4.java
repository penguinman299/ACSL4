public class Prob4{
    public static void main(String[] args){
        System.out.println("Hello World!");
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