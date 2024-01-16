//funções
function addNumero(x: number, y: number): number {
  return x + y;
}

function addPalavra(name: string): string {
  return name;
}

function callToTelefone(telefone: number | string): number | string {
  return `ligando para ${telefone}`;
}

// toda vez que for associar essa função a uma variavel ela tem que ser do tipo number tambem.
let soma: number = addNumero(3, 4);
console.log(soma);

let frase: string = "O dia está ";
let palavra: string = addPalavra("Chuvoso");
console.log(frase + palavra);

console.log(callToTelefone(877763232));

//funções assincronas
async function getDataBase(id: number): Promise<string> {
  return "Vander";
}
