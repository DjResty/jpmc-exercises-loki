package objects;

/**
 * Created by nxtlvl on 9/28/2016.
 */
public class Customer extends Person{

    private String address;
    private int telephoneNumber;
    private int customerId;
    private String customer;

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public  String introduceYourself(){
        return "Hi I am a " + customer + ". My name is " + getFirstName() + " " + getLastName() + ".";
    }

    public String productType(String food){
        return "I want to buy  a " + food + ".";
    }
}
