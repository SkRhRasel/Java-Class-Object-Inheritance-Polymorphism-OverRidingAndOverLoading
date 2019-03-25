package OverRidingAndOverLoading.Overloading;

public class Son extends MyFather {

    public static void main(String[] args){

        Son object = new Son();
        object.lands_of_my_father("Rajshahi");

    }

    // Below method is 'OverLoaded' from MyFather class
    public void lands_of_my_father(String location){
        System.out.println(location+ ", Khulna, Kushtia");
    }

    /* OverLoading: Same method name, different arguments and different method body */

}
