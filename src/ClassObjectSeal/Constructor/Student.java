package ClassObjectSeal.Constructor;
/**
 * Created by skrockybulhasanrasel 01-08-18.
 */
public class Student {

    String name;

    Student(String s){
        name = s;
    }

    public void show(){
        System.out.println("Name of Student is :" + name);
    }

    public static void main(String[] args){
        Student obj = new Student("Korim");
        obj.show();
    }
}
