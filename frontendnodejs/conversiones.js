
function CelciusFarenheit(centigrados){
    let conversion;
    conversion = (9/5*centigrados)+32;
    if (conversion % 1 ===0){
        return conversion;
    } else {
        return conversion.toFixed(2);
    }  
}



function kilometrosMillas (km) {
    let millas=km * 0.621371
    if(millas %1 ===0) {
    return millas;
    } else {
        return millas.toFixed(2);
    }
}



function kilogramosLibras (kg){
    let libras = kg * 2.20462;
    if (libras % 1 ===0 ){
    return libras.toFixed(1); 
    } else {
        return libras.toFixed(2); 
    }
}



function pulgadasCentimetros (plg) {
    let centimetros=plg * 2.54
    if(centimetros %1 ===0) {
    return centimetros;
    } else {
        return centimetros.toFixed(2);
    }
}




function piesPulgadas (ft) {
    let plg=ft* 12;
    if(plg %1 ===0) {
    return plg;
    } else {
        return plg.toFixed(2);
    }
}


module.exports = {
    CelciusFarenheit,
    kilogramosLibras,
    kilometrosMillas,
    piesPulgadas,
    pulgadasCentimetros
  };
