package User;

import java.util.HashMap;

/**
 * Created by Daniel and Cris on 1/9/2015.
 */
public class User {
    private String email; // static
    private String fullName; // static
    private String make; // dynamic
    private String model; // dynamic
    private String color; // dynamic
    private boolean driver; // dynamic
    private int ridesGiven; // dynamic
    private int ridesReceived;
    private int minute; // dynamic
    private int hour; // dynamic
    //TBD: Current location, to be pulled from maps, dynamic
    //TBD: Route, to be pulled from maps, dynamic
    private int seats; // dynamic
    private String[] reviews; // dynamic. How can multiple users access this?
    //TBD: payment method
    private boolean driving; // dynamic
    // private String address; // dynamic - TBD
    private boolean toCampus; // dynamic. Incomplete
    private int phone; // dynamic

    public User(String email, int phone) { // Passenger Account creation
        this.email = email;
        // this.fullName TBD - to be pulled from facebook
        this.phone = phone;
        this.driver = false;
    }

    public User(String email, int phone, String make, String model, String color) { // Driver Account creation
        this.email = email;
        // this.fullName TBD - to be pulled from facebook
        this.phone = phone;
        this.driver = true;
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public User() {};

    public String getEmail() {return this.email; }

    public void setEmail(String email) {this.email = email; }

    public String getFullName() { return this.fullName; }

    // Note: Don't need fullName setter, will pull from facebook

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() { return this.color; }

    public void setColor(String color) { this.color = color; }

    public boolean getDriver() {
        return driver;
    }

    public void setDriver(boolean driver) {
        this.driver = driver;
    }

    public int getRidesGiven() {
        return this.ridesGiven;
    }

    public void setRidesGiven(int ridesGiven) {
        this.ridesGiven = ridesGiven;
    }

    public int getRidesReceived() {
        return this.ridesReceived;
    }

    public void setRidesReceived(int ridesReceived) {
        this.ridesReceived = ridesReceived;
    }

    public int getMinute(){
        return this.minute;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public int getHour(){
        return this.hour;
    }

    public int getSeats(){
        return this.seats;
    }

    public void setSeats(int seats){
        this.seats = seats;
    }

    public String[] getReviews(){
        return this.reviews;
    }

    public void setReviews(String[] reviews){
        this.reviews = reviews;
    }

    public boolean getDriving(){
        return this.driving;
    }

    public void setDriving(boolean driving){
        this.driving = driving;
    }

/*   TBD - get and set Address
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    } */

    public boolean getToCampus() {
        return this.toCampus;
    }

    public void setToCampus(boolean toCampus) {
        this.toCampus = toCampus;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getPhone() {
        return this.phone;
    }


}

//Hash Map of all users.  When a new user is added use the setValue call to add it
// to the firebase database
//Map<String, User> users = new HashMap<String, User>();
