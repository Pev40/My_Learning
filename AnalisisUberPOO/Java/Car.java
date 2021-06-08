package Java;

public class Car {
    Integer id;
    String licence;
    Account driver;
    Integer passagenger;

    public Car(String licence, Account driver){
        this.licence = licence;
        this.driver = driver;
    }

    void printDataCar(){
        System.out.println("license: "+licence+" Driver: "+driver.name);
    }

}
