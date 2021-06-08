from Python.account import Account


class Car:
    id = int
    licencia = str
    driver = Account("","","","")
    passenger = int
    
    def __init__(self,licence,drive,passenger):
        self.licencia = licence
        self.driver = drive
        self.passenger = passenger