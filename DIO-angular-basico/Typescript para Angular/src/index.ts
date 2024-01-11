/**
 * Variaveis
 */

// tipos primitivos = boolean, number, string
let ligado: boolean = false; //somente valores booleanos
let nome: string = "vander"; //somente textos
let idade: number = 21; //somente numeros podendo ser com pontos ou sem
let altura: number = 1.9;

// tipos especiais = null,undefined
let nulo: null = null; //somente nulo
let indefinido: undefined = undefined; //somente valores indefinidos

// tipos abrangentes = any, void
let retorno: void; //somente quando não retorna nada
let retornoView: any; //pode ser usado com qualquer valor

//objeto - sem previsibilidade
let produto: object = {
  //recebe somente objetos
  name: "vander",
  cidade: "fortaleza",
  idade: 21,
};

//objeto tipado - com previsibilidade
type ProdutoLoja = {
  nome: string;
  preco: number;
  unidades: number;
};

let meuProduto: ProdutoLoja = {
  nome: "tenis",
  preco: 89.9,
  unidades: 10,
};

/**
 * Arrays
podem ser declarados dessas duas maneiras, sempre informando
o nome da variavel e depois o tipo e ai sim o que vai ser armazenado
*/
let dados: string[] = ["vander", "fernanda", "bel"];
let dados2: Array<string> = ["jailson", "fernanda", "gisele"];

//podemos declarar uma array de multitipos
// a ordem de definição não importa
let infos: (string | number)[] = ["Vander", 30];
let infos2: (string | number)[] = [30, "Fernanda"];

/**
 * Tuplas
 a ordem de definição importa
*/
let botelo: [string, number, number] = ["agua conta", 199.9, 123123123];

/**
 * metodos de arrays
  são os memos metodos de manipular arrays no javaScript
 */
dados.pop();

/**
 * Datas
 */
let aniversario:Date = new Date("2024-02-21 17:00");
console.log(aniversario.toString());