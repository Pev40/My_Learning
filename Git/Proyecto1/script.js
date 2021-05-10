var nombre = document.getElementById("nombre");
var botonazo = document.addEventListener("click","boton");
console.log("WAWAW");
console.log(botonazo.addEventListener("click","boton"));
function mostrarBienvenida(){
    if(botonazo){
        alert("Bienvenido " + nombre);
    }
}
