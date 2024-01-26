//generics - é o tipo que você vai definir depois podendo passar como parâmentro
function concatArray<T>(...itens: T[]): T[] {
  return new Array().concat(...itens);
}
const numArray = concatArray<number[]>([1, 2], [3]);
const stgArray = concatArray<string[]>(["vander", "rosa"], ["fernanda", "maria"]);

console.log(numArray);
console.log(stgArray);
