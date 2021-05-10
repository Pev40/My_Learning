//document.addEventListener("keyup",dibujar);
document.addEventListener("keyup", dibujar);
var areaTrabajo = document.getElementById("areaDeDibujo");
var lienzo = areaTrabajo.getContext("2d");
document.addEventListener("mouseup", dibujarConMouse)
//console.log(fechaAbajo);
inicioX = 150;
inicioY = 150;

function dibujarConMouse(eventoMouse){
    console.log(eventoMouse);
    imprimirLinea(inicioX,inicioY,eventoMouse.layerX,eventoMouse.layerY);
    inicioX=eventoMouse.layerX;
    inicioY=eventoMouse.layerY;
}

var teclas = {
  UP: 38,
  DOWN: 40,
  LEFT: 37,
  RIGTH: 39,
};

function dibujar(evento) {

  console.log(evento);
  /*if(evento.keyCode == teclas.UP){
        finY = inicioY + 10;
    }
    if(evento.keyCode == teclas.DOWN){
        finY = inicioY - 10;
    }

    if(evento.keyCode == teclas.RIGTH){
        finX = inicioX + 10;
    }
    
    if(evento.keyCode == teclas.LEFT){
        finX = inicioX - 10;
    }*/

  switch (evento.keyCode) {
    case teclas.UP:
      finY = inicioY - 10;
      console.log("Arriba + 10");
      imprimirLinea(inicioX,inicioX,inicioY,finY);
      inicioY=finY;
      break;
    case teclas.DOWN:
      finY = inicioY + 10;
      console.log("Abajo + 10");
      imprimirLinea(inicioX,inicioX,inicioY,finY);
      inicioY=finY;
      break;

    case teclas.LEFT:
      finX = inicioX - 10;
      console.log("Izquierda + 10");
      imprimirLinea(inicioX,finX,inicioY,inicioY);
      inicioX=finX;
      break;

    case teclas.RIGTH:
      finX = inicioX + 10;
      console.log("Derecha + 10");
      imprimirLinea(inicioX,finX,inicioY,inicioY);
      inicioX=finX;
      
      break;
  }
}


function imprimirLinea(puntoInicioX,puntoFinalX,puntoInicialY,puntoFinalY){
    lienzo.beginPath();
    lienzo.strokeStyle = "red";
    lienzo.moveTo(puntoInicioX,puntoInicialY);
    lienzo.lineTo(puntoFinalX, puntoFinalY);
    lienzo.stroke();
    lienzo.closePath();
}