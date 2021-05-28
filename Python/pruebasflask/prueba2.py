from flask import Flask
from flask import request

app = Flask(__name__)  # instancia


@app.route('/')  # wrap (decorator)
def index():

    return 'Hola mundo'  # return string

# GET param


@app.route('/method1')
def method1():
    param = request.args.get('param1', 'without data')
    return 'the param is : ' + str(param)

# params followed by slashes


@app.route('/method2/')  # accept 0 params
@app.route('/method2/<name>/')  # one param
@app.route('/method2/<name>/<int:dni>')  # two params
def method2(name='No data', dni='no dni'):
    return 'the param is: ' + str(name) + ' ' + str(dni)


@app.route('/method3/')  # accept 0 params
@app.route('/method3/<name>/')  # one param
@app.route('/method3/<name>/<apellido>')  # two params
def method3(name = 'No tiene', apellido = 'No reguistra'):
    return 'Mi nombre es: '+ str(name) + ' ' + str(apellido)


@app.route('/method4/')  # accept 0 params
@app.route('/method4/<int:num1>/')  # one param
@app.route('/method4/<int:num1>/<int:num2>/<int:num3>')  # two params
def method4(num1 = 0, num2 = 0, num3 = 0):
    return 'EL promedio es: ' + str(float((num1+num2+num3)/3))


if __name__ == '__main__':
    app.run(debug=True, port=8080)  # lunch server
    