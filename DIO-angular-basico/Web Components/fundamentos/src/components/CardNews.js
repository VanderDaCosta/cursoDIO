class Cardnews extends HTMLElement {
    constructor() {
        super();

        //closed - não pode ser modificado por quem está de fora
        //open - pode ser manipulado por quem está do lado de fora
        const shadow = this.attachShadow({ mode: "open" });
        shadow.appendChild(this.build());
        shadow.appendChild(this.styles());
    }

    build() {
        const componentRoot = document.createElement("div");
        componentRoot.setAttribute("class", "card");

        //Card left
        const cardLeft = document.createElement("div");
        cardLeft.setAttribute("class", "cardLeft");

        const autor = document.createElement("span");
        autor.textContent = "By " + (this.getAttribute("autor") || "Anonimos");

        const linkTitle = document.createElement("a");
        linkTitle.textContent = this.getAttribute("title");
        linkTitle.href = this.getAttribute("link-url");

        const newsContent = document.createElement("p");
        newsContent.textContent = this.getAttribute("contet");

        cardLeft.appendChild(autor);
        cardLeft.appendChild(linkTitle);
        cardLeft.appendChild(newsContent);

        //Card right
        const cardRight = document.createElement("div");
        cardRight.setAttribute("class", "cardRight");

        const newsImage = document.createElement("img");
        newsImage.src = "assets/darthVader.webp";
        cardRight.appendChild(newsImage);

        componentRoot.appendChild(cardLeft);
        componentRoot.appendChild(cardRight);


        return componentRoot;
    }

    styles() {

    }
}

//usado para criar um elemento customizado
customElements.define("card-news", Cardnews);