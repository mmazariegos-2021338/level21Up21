var url = require('url');
var objetourl = url.parse(pedido.url);
console.log("path completo del recurso y parámetros: "+objetourl.path);
console.log("solo el path y nombre del recurso : "+objetourl.pathname);
console.log("parámetros del recurso :" +objetourl.query);
