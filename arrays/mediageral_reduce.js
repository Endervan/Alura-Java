// let nota1 = 10;
// let nota2 = 6;
// let nota3 = 7.5;
// let nota4 = 5;

const salaJs = [7,8,8,7,10,6.5,4,10,7];
const salaJava= [6,5,8,9,5,6];
const salaAngular = [7,3.5,8,9.5];

function mediaSala(notasDaSala){
    const somaDasNotas = notasDaSala.reduce((acumulado,atual)=> atual + acumulado,0)
    return somaDasNotas/notasDaSala.length;
}

console.log(`Media da sala de Javascript e ${mediaSala(salaJs)}` );
console.log(`Media da sala de Java e ${mediaSala(salaJava)}` );
console.log(`Media da sala de Angular e ${mediaSala(salaAngular)}` );
