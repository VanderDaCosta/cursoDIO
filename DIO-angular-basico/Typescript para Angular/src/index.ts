//interfaces (type x interface)

// em ambos pode ser usado o "readonly", que faz com que a propriedade não consiga ser modificada pois ela so pode ser lida
//type -  usado para tipar uma OBJETO
type robot = {
  id: number;
  name: string;
};

const bot: robot2 = {
  id: 1,
  name: "megaman",
  sayHeloo: function (): string {
    return "fala comigo";
  }
};
const bot2: robot = {
  id: 2,
  name: "Doende verde",
};

//interface -  m ais usado quando se trabalha com CLASSE
interface robot2 {
  id: number;
  name: string;
  sayHeloo(): string;
}
//console.log(bot);
//console.log(bot2);

class Pessoa implements robot2{
  id: number;
  name: string;
  
  constructor(id:number , name:string){
    this.id= id,
    this.name=name
  }
  sayHeloo(): string {
    return `O ${this.name} está falando "Hello"!`;
  }
} 

const p = new Pessoa(1, "vander");
console.log(p.sayHeloo());