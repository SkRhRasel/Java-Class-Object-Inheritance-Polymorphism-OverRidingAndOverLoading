package InheritanceTypes.SuperKeyWord;

public class ZillaSchool extends CityCollege {

    // invoking super class constructor
    public ZillaSchool(){
        // we'll invoke Constructor of College
        super();
    }


    public static void main(String[] args){

        // creating object
        ZillaSchool obj = new ZillaSchool();
        obj.showing();

    }

    int students = 1200;

    public void showing(){
        System.out.println("Students: "+super.students);
        System.out.println("Students: "+students);
    }


}
