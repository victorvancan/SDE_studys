function tocaSom(idTagAudio) {
    document.querySelector(idTagAudio).play();
}

const listaDeTeclas = document.querySelectorAll('.tecla');


for (let contador = 0; contador < listaDeTeclas.length; contador++) {

    const instrumento = listaDeTeclas[contador].classList[1];
    //template string
    const idAudio = `#som_${instrumento}`;

    listaDeTeclas[contador].onclick = function () {
        tocaSom(idAudio)
    }

}
