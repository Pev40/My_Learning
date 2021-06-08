from Python.account import Account
from Python.car import Car


if __name__ == "__main__":
    print("Hello")
    car = Car("AWN123",Account("Piero","74624957","pevv2016@gmail.com","Piero1234"),5)
    print(vars(car))
    print(vars(car.driver))