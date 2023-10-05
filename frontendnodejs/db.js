var mysql = require('mysql');
// crea la configuracion de conexion
var conexion = mysql.createConnection(
    {
        host: "localhost",
        user: "root",
        password: "open",
        database: "test"
    });
// se conecta a la bd
conexion.connect(function (error) {
    if (error)
        console.log('Problemas de conexion con mysql ' + error);
});

console.log("conectado a la bd");


var datosregistro = {
    cui: "987654321369",
    nombre: "Juan Perez",
    edad: 22
};
conexion.query("insert into persona set ?",
    datosregistro,
    function (error, resultado) {
        if (error) {
            console.log(error);
            return;
        }
    });

conexion.query(
    "select cui, nombre, edad from persona ",
    function (error, filas) {
        if (error) {
             console.log(error); 
             return; 
        }
        for (var i = 0; i < filas.length; i++) {
            console.log(filas[i].cui + " - " + filas[i].nombre + " " + filas[i].edad);
        }
    });

    conexion.end();

