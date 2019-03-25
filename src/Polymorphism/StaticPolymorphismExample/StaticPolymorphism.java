package Polymorphism.StaticPolymorphismExample;

public class StaticPolymorphism {
    public static void main(String [] args){

        // creating object and calling methods
        FewMethods obj = new FewMethods();

        System.out.println(obj.multiply_numbers(4,5));
        System.out.println(obj.multiply_numbers(2,4,6));


        // Same methods, behaving differently - This is called static polymorphism


    }
}
