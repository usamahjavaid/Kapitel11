package Opgave11_2;
/*
A person has a name,
address, phone number, and e-mail address.
 */
public class Person {

   private String name;
   private String address;
   private String phoneNumber;
   private String Email;

   public Person(){

   }

   public Person(String name, String address, String phoneNumber, String email) {
      this.name = name;
      this.address = address;
      this.phoneNumber = phoneNumber;
      Email = email;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getPhoneNumber() {
      return phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   public String getEmail() {
      return Email;
   }

   public void setEmail(String email) {
      Email = email;
   }

   @Override
   public String toString() {
      return
              "name: " + name + '\'' +
              " address: " + address + '\'' +
              " phoneNumber: " + phoneNumber + '\'' +
              " Email: " + Email + '\'';
   }
}


