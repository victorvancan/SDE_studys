import { negociacaoController } from "./controllers/negociacaoController.js";
const controller = new negociacaoController();
const form = document.querySelector('.form');
if (form) {
    form.addEventListener('submit', event => {
        event.preventDefault();
        controller.adiciona();
    });
}
else {
    throw Error('Nao foi possivel inicializar a aplicacao. verifique se o form existe');
}
