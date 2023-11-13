import { Negociacoes } from "../models/negociacoes.js";
import { View } from "./view.js";

export class NegociacoesView extends View<Negociacoes> {

    
    template(model: Negociacoes): string {
        return `
            <table class="table table-hover table-bordered">
                <thead>
                    <tr>
                        <th>Data</th>
                        <th>QUANTIDADE</th>
                        <th>VALOR</th>
                    </tr>
                </thead>
            <tbody>
            </tbody>
                ${model.lista().map(negociacao => {
            return `
                    <tr>
                        <th>${new Intl.DateTimeFormat().format(negociacao.data)}</th>
                        <th>${negociacao.quantidade}</th>
                        <th>${negociacao.valor}</th>
                    </tr>`;
        }).join('')}
            </table>
            `;
    }

}