"use strict";
//funções
function addNumero(x, y) {
    return x + y;
}
function addPalavra(name) {
    return name;
}
function callToTelefone(telefone) {
    return `ligando para ${telefone}`;
}
// toda vez que for associar essa função a uma variavel ela tem que ser do tipo number tambem.
let soma = addNumero(3, 4);
console.log(soma);
let frase = "O dia está ";
let palavra = addPalavra("Chuvoso");
console.log(frase + palavra);
console.log(callToTelefone(877763232));
