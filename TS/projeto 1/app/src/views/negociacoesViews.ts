import { escape } from "../decorators/escape.js";
import { Negociacoes } from "../models/negociacoes.js";
import { View } from "./view.js";

export class NegociacoesView extends View<Negociacoes> {

    @escape
    protected template(model: Negociacoes): string {
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
                        <td>${this.formatar(negociacao.data)}</td>
                        <td>${negociacao.quantidade}</td>
                        <td>${negociacao.valor}</td>
                    </tr>`;
        }).join('')}
            </table>
            `;
    }

    private formatar(data: Date): string
    {
       return new Intl.DateTimeFormat().format(data)
    }
}