class TituloDinamico extends HTMLElement {
    constructor() {
        super();


        const shadow = this.attachShadow({ mode: "open" })


        //base do componente <h1>Vander<h1/>
        const componentRoot = document.createElement('h1');
        componentRoot.textContent = this.getAttribute("titulo");

        //estilizar o componente
        const style = document.createElement('style');
        style.textContent = `
            h1{
                color: red;
            }
        `;

        //enviar para a shadow
        //tudo que for criado separado é necessario depois anexar a nossa sombra
        shadow.appendChild(componentRoot);
        shadow.appendChild(style);

    }
}

//nunca esquecer disso
customElements.define("titulo-dinamico", TituloDinamico);