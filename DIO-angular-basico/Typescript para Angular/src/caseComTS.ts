type Hero = {
    nome: string;
    vulgo: string;
    telefone: string;
};

function ligarPara(heroi: Hero) {
    console.log("ligando para: " + heroi.telefone);
};

ligarPara({
    nome: "Steve Rogers",
    vulgo: "Capitão America",
    telefone: "11 31713388"
});