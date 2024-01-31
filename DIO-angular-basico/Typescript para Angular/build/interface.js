"use strict";
//interfaces (type x interface)
const bot = {
    id: 1,
    name: "megaman",
    sayHeloo: function () {
        return "fala comigo";
    }
};
const bot2 = {
    id: 2,
    name: "Doende verde",
};
//console.log(bot);
//console.log(bot2);
class Pessoa {
    constructor(id, name) {
        this.id = id,
            this.name = name;
    }
    sayHeloo() {
        return `O ${this.name} está falando "Hello"!`;
    }
}
const p = new Pessoa(1, "vander");
console.log(p.sayHeloo());
