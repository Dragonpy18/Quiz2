public class Main{
    public static void main(String[] args){
        Adder adder = (int a, int b) -> (b+a)/2 * (b-a+1); 
        System.out.println((3+1)/2 * (3-1+1));
    }

}