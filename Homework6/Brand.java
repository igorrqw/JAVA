
package Homework6;

public class Brand {
    private String brand;
    private String country;
    

    public Brand(String brand, String country){
        this.brand = brand;
        this.country = country;
        }

    public String getBrand() {return brand;}
    public String getCountry() {return country;}

    @Override
    public String toString() {
        return "Brand [brand= " + brand + ", country= " + country + "]";
    }
}