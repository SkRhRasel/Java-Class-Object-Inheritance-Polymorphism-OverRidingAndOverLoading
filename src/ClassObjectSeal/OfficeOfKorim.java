package ClassObjectSeal;
/**
 * Created by skrockybulhasanrasel 01-08-18.
 */
public class OfficeOfKorim {

    public static void main(String[] args){

        Seal obj = new Seal();  // Creating Class Object

        System.out.println("After giving seal, rsult is......");

        obj.name();
        obj.designation();
        obj.today_date();

    }
}
