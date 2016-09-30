package objects;

/**
 * Created by nxtlvl on 9/28/2016.
 */


/**
 *  ABSTRACT
 *  changing public class into public abstract class
 *  by adding abstract
 *
 *  accessing Person class an abstract class only by inheriting
 *  or extends
 */
public class Person {


    private String userName;
    private String firstName;
    private String lastName;
    private String email;


    public void setFirstName(String firstName){
        /*TODO filter string for unwanted character*/
        this.firstName = firstName;
    }

    public String getFirstName(){

        return firstName;
    }

    public void setLastName(String lastName){
        /*TODO filter string for unwanted character*/
        this.lastName = lastName;
    }

    public String getLastName(){

        return lastName;
    }

    public String introduceYourself(){
        return "Hi I'm " + firstName + " "+ lastName ;
    }

    /* FOR CONSTRUCTOR
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName  = lastName;
    }
    */
}
