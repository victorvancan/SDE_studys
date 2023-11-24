export class Negociacao {
    constructor(_data, quantidade, valor) {
        this._data = _data;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    static criaDe(dataString, quantidadestring, valorstring) {
        const exp = /-/g;
        const date = new Date(dataString.replace(exp, ','));
        const quantidade = parseInt(quantidadestring);
        const valor = parseFloat(valorstring);
        return new Negociacao(date, quantidade, valor);
    }
    get data() {
        const data = new Date(this._data.getTime());
        return data;
    }
    paraTexto() {
        return `
        Data: ${this.data},
        Quantidade: ${this.quantidade},
        Valor: ${this.valor}`;
    }
    get volume() {
        return this.quantidade * this.valor;
    }
    ehIgual(negociacao) {
        return this.data.getDate() === negociacao.data.getDate()
            && this.data.getMonth() == negociacao.data.getMonth()
            && this.data.getFullYear() === negociacao.data.getFullYear();
    }
}
//# sourceMappingURL=negociacao.js.map