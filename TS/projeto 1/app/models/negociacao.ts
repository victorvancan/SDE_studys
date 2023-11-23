export class Negociacao {


    constructor
        (private _data: Date,
            public readonly quantidade: number,
            public readonly valor: number) {

    }

    get data(): Date {

        const data = new Date(this._data.getTime());
        return data;
    }


    get volume(): number {
        return this.quantidade * this.valor;
    }

    public static criaDe(dataString: string, quantidadestring: string, valorstring: string): Negociacao {
        const exp = /-/g;
        const date = new Date(dataString.replace(exp, ','))
        const quantidade = parseInt(quantidadestring)
        const valor = parseFloat(valorstring)
        return new Negociacao(
            date, quantidade, valor
        );
    }
}