"use strict";
/**
 * Variaveis
 */
// tipos primitivos = boolean, number, string
let ligado = false; //somente valores booleanos
let nome = "vander"; //somente textos
let idade = 21; //somente numeros podendo ser com pontos ou sem
let altura = 1.9;
// tipos especiais = null,undefined
let nulo = null; //somente nulo
let indefinido = undefined; //somente valores indefinidos
// tipos abrangentes = any, void
let retorno; //somente quando não retorna nada
let retornoView; //pode ser usado com qualquer valor
//objeto - sem previsibilidade
let produto = {
    //recebe somente objetos
    name: "vander",
    cidade: "fortaleza",
    idade: 21,
};
let meuProduto = {
    nome: "tenis",
    preco: 89.9,
    unidades: 10,
};
/**
 * Arrays
podem ser declarados dessas duas maneiras, sempre informando
o nome da variavel e depois o tipo e ai sim o que vai ser armazenado
*/
let dados = ["vander", "fernanda", "bel"];
let dados2 = ["jailson", "fernanda", "gisele"];
//podemos declarar uma array de multitipos
// a ordem de definição não importa
let infos = ["Vander", 30];
let infos2 = [30, "Fernanda"];
/**
 * Tuplas
 a ordem de definição importa
*/
let botelo = ["agua conta", 199.9, 123123123];
/**
 * metodos de arrays
  são os memos metodos de manipular arrays no javaScript
 */
dados.pop();
/**
 * Datas
 */
let aniversario = new Date("2024-02-21 17:00");
console.log(aniversario.toString());
