/*var mat = require('./math.js');
console.log('La suma de 2+2=' + mat.add(2, 2));
console.log('El valor de PI=' + mat.PI);
console.log("La resta de 10-3= "+mat.restar(10,3));
console.log("Division  "+mat.dividir(15,3));

*/

/*var os = require('os');
console.log('Sistema operativo:' + os.platform());
console.log('Versión del OS:' + os.release());
console.log('Memoria total:' + os.totalmem() + ' bytes');
console.log('Memoria libre:' + os.freemem() + ' bytes');
*/

var fs = require('fs');

/*fs.writeFile('./archivoNuevo.txt',
    'línea 1\nLínea 2',
    function (error) {
        if (error)
            console.log(error);
        else
            console.log('El archivo fue creado');
    });

console.log('última línea del programa');
*/
function leer(error, datos) {
    if (error) {
        console.log(error);
    } else {
        console.log(datos.toString());
    }
}
fs.readFile('./archivoNuevo.txt',leer);
console.log('Fin del programa');
