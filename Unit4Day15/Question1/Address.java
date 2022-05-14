package Unit4Day15.Question1;

import java.io.Serializable;

public class Address implements Serializable{

    private String state;
    private String city;
    private String pincode;

   public Address() {
       super();
   }
   public Address(String state, String city, String pincode) {
       super();
       this.state = state;
       this.city = city;
       this.pincode = pincode;
   }
   public String getState() {
       return state;
   }
   public void setState(String state) {
       this.state = state;
   }
   public String getName() {
       return city;
   }
   public void setName(String city) {
       this.city =city;
   }
   public String getPincode() {
       return pincode;
   }
   public void setPincode(String pincode) {
       this.pincode = pincode;
   }



}

