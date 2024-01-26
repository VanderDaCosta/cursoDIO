"use strict";
//generics -
function concatArray(...itens) {
    return new Array().concat(...itens);
}
const numArray = concatArray([1, 2], [3]);
const stgArray = concatArray(["vander", "rosa"], ["fernanda", "maria"]);
console.log(numArray);
console.log(stgArray);
