/*function Car(licence,driver,passenger){
    this.id;
    this.licence = licence;
    this.driver = driver;
    this.passenger = passenger;
}

Car.prototype.printDataCar = function(){
    console.log(this.driver);
    console.log(this.driver.name);
    console.log(this.driver.document);
}*/

class Car{

    constructor(license,driver,passenger){
        this.id;
        this.license = license;
        this.driver = driver;
        this.passenger = passenger;
    }

    printDataCar() {
        console.log(this.driver);
        console.log(this.driver.name);
        console.log(this.driver.document);
    }

}