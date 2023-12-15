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
        newsImage.alt = "Foto do Dath Vader";
        newsImage.src = this.getAttribute("photo");
        cardRight.appendChild(newsImage);

        componentRoot.appendChild(cardLeft);
        componentRoot.appendChild(cardRight);


        return componentRoot;
    }

    styles() {
        const style = document.createElement("style");
        style.textContent = `
            .card {
                width: 80%;
                box-shadow: 10px 10px 31px -6px rgba(0, 0, 0, 0.75);
                -webkit-box-shadow: 10px 10px 31px -6px rgba(0, 0, 0, 0.75);
                -moz-box-shadow: 10px 10px 31px -6px rgba(0, 0, 0, 0.75);
                display: flex;
                align-items: center;
                flex-direction: row;
                justify-content: space-between;
                padding: 10px
            }

            .cardLeft {
                display: flex;
                flex-direction: column;
                justify-content: center;
                padding-left: 10px;
            }

            .cardLeft>span {
                font-weight: 400;
            }

            .cardLeft>a {
                margin-top: 15px;
                font-size: 25px;
                font-weight: bold;
                text-decoration: none;
                color: #000;
            }

            .cardLeft>p {
                color: #808080;
            }

            .cardRight>img {
                width: 350px;
                padding: 5px;
            }
        `;


        return style;
    }
}

//usado para criar um elemento customizado
customElements.define("card-news", Cardnews);