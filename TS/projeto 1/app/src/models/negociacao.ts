import { Modelo } from "../interfaces/modelo.js";


export class Negociacao implements Modelo<Negociacao>{


    constructor
        (private _data: Date,
            public readonly quantidade: number,
            public readonly valor: number) 
            { }


    public static criaDe(dataString: string, quantidadestring: string, valorstring: string): Negociacao {
        const exp = /-/g;
        const date = new Date(dataString.replace(exp, ','))
        const quantidade = parseInt(quantidadestring)
        const valor = parseFloat(valorstring)
        return new Negociacao(
            date, quantidade, valor
        );
    }

    get data(): Date {

        const data = new Date(this._data.getTime());
        return data;
    }

    public paraTexto(): string{
        return `
        Data: ${this.data},
        Quantidade: ${this.quantidade},
        Valor: ${this.valor}`;
    }

    get volume(): number {
        return this.quantidade * this.valor;
    }

    public ehIgual(negociacao: Negociacao): boolean
    {
        return this.data.getDate() === negociacao.data.getDate()
            && this.data.getMonth() == negociacao.data.getMonth()
            && this.data.getFullYear() === negociacao.data.getFullYear();
        
    }
}