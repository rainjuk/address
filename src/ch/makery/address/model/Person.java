package ch.makery.address.model;




import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;



/**
 * Model class for a Person.
 *
 * @author Marco Jakob
 */
public class Person {

    private final StringProperty firstName;
    
    private final StringProperty street;
    private final StringProperty rodplata;
    private final StringProperty finotdel;
    private final StringProperty city;


    /**
     * Default constructor.
     */
    public Person() {
        this(null);
    }

    /**
     * Constructor with some initial data.
     * 
     * @param firstName
     * @param lastName
     */
    public Person(String firstName) {
        this.firstName = new SimpleStringProperty(firstName);
        

        // Some initial dummy data, just for convenient testing.
        this.street = new SimpleStringProperty("‘»Œ");
        this.rodplata = new SimpleStringProperty("‘»Œ");
        this.finotdel = new SimpleStringProperty("‘»Œ");
        this.city = new SimpleStringProperty("‘»Œ");
  
    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }
    public String getStreet() {
        return street.get();
    }

    public void setStreet(String street) {
        this.street.set(street);
    }

    public StringProperty streetProperty() {
        return street;
    }
   
    public String getRodplata() {
        return rodplata.get();
    }

    public void setRodplata(String rodplata) {
        this.rodplata.set(rodplata);
    }

    public StringProperty rodplataProperty() {
        return rodplata;
    }
    public String getFinotdel() {
        return finotdel.get();
    }

    public void setFinotdel(String finotdel) {
        this.finotdel.set(finotdel);
    }

    public StringProperty finotdelProperty() {
        return finotdel;
    }
    public String getCity() {
        return city.get();
    }

    public void setCity(String city) {
        this.city.set(city);
    }

    public StringProperty cityProperty() {
        return city;
    }

  
}