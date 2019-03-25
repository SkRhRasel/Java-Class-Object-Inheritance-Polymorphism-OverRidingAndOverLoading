package OverRidingAndOverLoading;

public class MethodOverRidingAndOverLoading extends MyFather {

    public static void main(String[] args){

        MethodOverRidingAndOverLoading object = new MethodOverRidingAndOverLoading();
        object.cars_of_my_father();
        object.lands_of_my_father("Bangladesh");

    }


    // Below method is 'OverRidden' from MyFather Class
    public void cars_of_my_father(){
        System.out.println("Royal Rayce, Maruti Suzuki, Mazda");
    }

    // Below method is 'OverLoaded' from MyFather class
    public void lands_of_my_father(String location){
        System.out.println(location+", Khulna, Kushtia");
    }

    /*
        OverRiding: Same method names, same arguments different method body
        OverLoading: Same method name, different arguments and different method body

     */


}
