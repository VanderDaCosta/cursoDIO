//decorators
function apiVerson(version: string) {
  //factore- funcção que retorna outra função
  return (target: any) => {
    Object.assign(target.prototype, { __version: version, __name: "vander" });
  };
}

//atribute decorator
function minLength(length: number) {
  return (target: any, key: string) => {
    let _value = target[key]

    //metodo de leitura
    const getter = () => _value;
    //metodo para setar
    const setter = (value:string) => {
        if(value.length < length){
            throw new Error(`tamanho menor do que ${length}`);
        }else {
            _value = value;
        }
    };

    Object.defineProperty(target, key, {
        get: getter,
        set:setter,
    });

  };
}

@apiVerson("1.10")
class Api {
  @minLength(3)
  name: string;

  constructor(name: string) {
    this.name = name;
  }
}

const api = new Api("produtos");
/*
os decorators ainda são experimentais, se tentarmos rodar da maneira "normal" onde 
vai tentar compilar esse arquivo e vai da um erro pois não vai existir a propriedade "__version"
*/

console.log(api.name);