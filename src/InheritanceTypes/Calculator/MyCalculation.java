package InheritanceTypes.Calculator;

public class MyCalculation extends Calculation{

    public static void main(String[] args){
        int a= 3, b= 10;
        int w = 4, c = 5;

        MyCalculation obj1 = new MyCalculation();

        obj1.subtraction(a,b);
        obj1.addition(w,c);

//        emni.addition(a,b);
//        emni.subtraction(a,b);

    }

}
