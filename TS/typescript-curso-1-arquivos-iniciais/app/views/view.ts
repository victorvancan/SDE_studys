import { logarTempoDeExecucao } from "../decorators/LogarTempoDeExecucao.js";
import { inspect } from "../decorators/inspect.js";

export abstract class View<T>{
    protected elemento: HTMLElement;
    private escapar = false;

    constructor(seletor: string, escapar?: boolean) {
        const elemento = document.querySelector(seletor)
        if (elemento) {
            this.elemento = elemento as HTMLElement;
        }
        else {
            throw new Error(`Elemento ${seletor} não encontrado`)
        }

        if (escapar) {
            this.escapar = escapar;
        }
    }

    @logarTempoDeExecucao(true)
    @inspect
    public update(model: T): void {

        let template = this.template(model);
        if (this.escapar) {
            template = template.replace(/<script>[\s\S]*?<\/script>/, '')
        }
    }

    protected abstract template(model: T): string;
}