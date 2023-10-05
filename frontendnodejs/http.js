var http = require('http');

var servidor = http.createServer(
    function (peticion, respuesta) {
        respuesta.writeHead(200,
            { 'Content-Type': 'text/html' });
        respuesta.write(
            '<!doctype html><html><head></head>' +
            '<body><h1>Hola Mundo 2023</h1></body></html>');
        respuesta.end();
    });
    servidor.listen(8080);
    console.log('Servidor web iniciado');
    