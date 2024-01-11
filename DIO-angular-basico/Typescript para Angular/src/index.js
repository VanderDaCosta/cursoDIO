/**
 * Variaveis
 */
// tipos primitivos = boolean, number, string
var ligado = false; //somente valores booleanos
var nome = "vander"; //somente textos
var idade = 21; //somente numeros podendo ser com pontos ou sem
var altura = 1.9;
// tipos especiais = null,undefined
var nulo = null; //somente nulo
var indefinido = undefined; //somente valores indefinidos
// tipos abrangentes = any, void
var retorno; //somente quando não retorna nada
var retornoView; //pode ser usado com qualquer valor
//objeto - sem previsibilidade
var produto = {
    //recebe somente objetos
    name: "vander",
    cidade: "fortaleza",
    idade: 21,
};
var meuProduto = {
    nome: "tenis",
    preco: 89.9,
    unidades: 10,
};
/**
 * Arrays
podem ser declarados dessas duas maneiras, sempre informando
o nome da variavel e depois o tipo e ai sim o que vai ser armazenado
*/
var dados = ["vander", "fernanda", "bel"];
var dados2 = ["jailson", "fernanda", "gisele"];
//podemos declarar uma array de multitipos
// a ordem de definição não importa
var infos = ["Vander", 30];
var infos2 = [30, "Fernanda"];
/**
 * Tuplas
 a ordem de definição importa
*/
var botelo = ["agua conta", 199.9, 123123123];
/**
 * metodos de arrays
  são os memos metodos de manipular arrays no javaScript
 */
dados.pop();
/**
 * Datas
 */
var aniversario = new Date("2024-02-21 17:00");
console.log(aniversario.toString());
