var direc = document.getElementById("zonaDeDibujo");
var lienzo = direc.getContext("2d");
var puntoInicioX = document.getElementById("Xinicio");
var puntoFinX = document.getElementById("Xfin");
var puntoFinY = document.getElementById("Yfin");
var puntoInicioY = document.getElementById("Yinicio");
var color = document.getElementById("color");
var boton = document.getElementById("botonEnviar");
//console.log(lienzo);
boton.addEventListener("click", dibujar);
console.log(color);
console.log(puntoInicioX);
console.log(puntoFinX);
console.log(puntoInicioY);

function dibujar() {
  lienzo.beginPath();
  lienzo.strokeStyle = color.value;
  lienzo.moveTo(parseInt(puntoInicioX.value), parseInt(puntoInicioY.value));
  lienzo.lineTo(parseInt(puntoFinX.value), parseInt(puntoFinY.value));
  lienzo.stroke();
  lienzo.closePath();
  console.log(color.value);
  typeof color;
  console.log(puntoInicioX.value);
  console.log(puntoFinX.value);
  console.log(puntoInicioY.value);
}

for (i = 30; i > 0; i--) {
  dibujar("pink", 300, (i + 1) * 10, i, 0);
  dibujar("blue", (i + 1) * 10, 300, 0, i);
  dibujar("green", (i + 1) * 10, i - 105, 0, i);
}
