public class Function_Overloading {
    public static void main(String args[]){
        Calculator cacl = new Calculator();
        System.out.println(cacl.sum(2, 02, 2));
    }
    
}
class Calculator {
    int sum (int a , int b){
        return a+b;
    }

    float sum (float a, float b){
        return a+b;
    }

    int sum (int a , int b , int c ){
        return a + b+c;
    }
}
