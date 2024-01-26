//Classes
class Personagem {
  name: string;
  strength: number;
  skill: number;

  constructor(name: string, strength: number, skill: number) {
    this.name = name;
    this.strength = strength;
    this.skill = skill;
  }

  attack(): void {
    console.log(`Attack with ${this.strength} points`);
  }

  private defender(): void {
    console.log(`Defender with ${this.strength} points`);
  }
}

const p1 = new Personagem("Vander", 10, 98);
console.log(p1);
p1.attack();

/* modificadores de acesso ( data modifiers ):
    -public = pode ser acessada tanto de dentro como de fora da Classe
    -private = so pode ser acessada por dentro da Classe
    -protected = do pode ser acessado por dentro da classe ou por uma subclasse que herdem essa Classe
        
*/

//Sub-classes
class Magician extends Personagem {
  magicPoints: number;
  constructor(
    name: string,
    strength: number,
    skill: number,
    magicPoints: number
  ) {
    super(name, strength, skill);
    this.magicPoints = magicPoints;
  }
}

const p2 = new Magician("Mago", 9, 30, 100);
console.log(p2);