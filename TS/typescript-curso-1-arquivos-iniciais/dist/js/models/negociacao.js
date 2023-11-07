class Negocicao {
    #data;
    #quantidade;
    #valor;


    constructor(data, quantidade, valor)
    {
        this.#data = data;
        this.#valor = valor;
        this.#quantidade = quantidade;
    }

    get data()
    {
        return this.#data;
    }

    get quantidade()
    {
        return this.#quantidade;
    }

    get valor()
    {
        return this.#valor;
    }

    get volume()
    {
        return this.#quantidade * this.#valor;
    }
}