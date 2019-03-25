package OverRidingAndOverLoading.Overriding;

public class Son extends MyFather {

    public static void main(String[] args){

        Son object = new Son();
        object.cars_of_my_father();

    }

    // Below method is 'OverRidden' from MyFather Class
    public void cars_of_my_father(){
        System.out.println("Royal Rayce, Maruti Suzuki, Mazda");
    }

//    OverRiding: Same method names, same arguments, different method body

}
