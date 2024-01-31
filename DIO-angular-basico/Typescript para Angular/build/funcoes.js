"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
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
//funções assincronas
function getDataBase(id) {
    return __awaiter(this, void 0, void 0, function* () {
        return "Vander";
    });
}
