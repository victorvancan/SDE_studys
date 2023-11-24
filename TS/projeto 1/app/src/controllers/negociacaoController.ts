import { logarTempoDeExecucao } from "../decorators/LogarTempoDeExecucao.js";
import { domInjector } from "../decorators/domInjector.js";
import { inspect } from "../decorators/inspect.js";
import { DiaDaSemana } from "../enums/DiasDaSemana.js";
import { Negociacao } from "../models/negociacao.js";
import { Negociacoes } from "../models/negociacoes.js";
import { NegociacoesService } from "../services/negociacoesService.js";
import { imprimir } from "../utils/imprimir.js";
import { MensagemView } from "../views/mensagemView.js";
import { NegociacoesView } from "../views/negociacoesViews.js";

export class negociacaoController {
    @domInjector('#data')
    private inputData: HTMLInputElement;
    @domInjector('#quantidade')
    private inputQuantidade: HTMLInputElement;
    @domInjector('#valor')
    private inputValor: HTMLInputElement;
    private negociacoes = new Negociacoes();
    private negociacoesView = new NegociacoesView('#negociacoesView', true);
    private mensagemView = new MensagemView('#mensagemView');
    private negociacoesService = new NegociacoesService();

    constructor() {
        this.negociacoesView.update(this.negociacoes)
    }
    @inspect
    @logarTempoDeExecucao()
    public adiciona(): void {
        const negociacao = Negociacao.criaDe(
            this.inputData.value,
            this.inputQuantidade.value,
            this.inputValor.value
        );
        if (!this.ehDiaUtil(negociacao.data)) {
            this.mensagemView.update('Apenas negocios em dias uteis sao aceitos');
            return;
        }
        this.negociacoes.adiciona(negociacao);
        imprimir(negociacao, this.negociacoes);
        this.limparFormulario();
        this.atualizaView();

    }

    importaDados(): void {

        this.negociacoesService.obterNegociacoesDoDia()
            .then(negociacoesDeHoje => {
                return negociacoesDeHoje.filter(
                    negociacoesDeHoje => {
                        return this.negociacoes
                        .lista()
                        .some(Negociacao => Negociacao
                                            .ehIgual(negociacoesDeHoje));
                    }
                )
            })
            .then(negociacoesDeHoje => {
                for (let negociacao of negociacoesDeHoje) {
                    this.negociacoes.adiciona(negociacao)
                }
                this.negociacoesView.update(this.negociacoes);
            })

    }

    private ehDiaUtil(data: Date) {
        return data.getDay() > DiaDaSemana.DOMINGO && data.getDay() < DiaDaSemana.SABADO;
    }



    private limparFormulario(): void {
        this.inputData.value = '';
        this.inputQuantidade.value = '';
        this.inputValor.value = '';
        this.inputData.focus();
    }

    private atualizaView(): void {
        this.negociacoesView.update(this.negociacoes)
        this.mensagemView.update('Negociacao adiconada com sucesso!');
    }
}