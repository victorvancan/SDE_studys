const form = document.getElementById('novoItem')
const lista = documentq.getElementById("lista")
const itens = Json.parse(localStorage.getItem("itens")) || []

item.forEach(element => {
    console.log(element)
});

form.addEventListener("submit", (evento) => {
    evento.preventDefault()

    const nome = elements.target.elements['nome']
    const quantidade = elements.target.elements['quantidade']

    const existe = itens.find(element => element.nome === nome.value)

    const itemAtual = {
        "nome": nome.value,
        "quantidade": quantidade.value
    }

    if (existe) {
        itemAtual.id = itens[itens.length -1] ? (itens[itens.length -1]).id + 1 : 0

        atulizaElemento(itemAtual)
        itens[itens.findIndex(element => element.id === existe.id)] = itemAtual
    } else {
        itemAtual.id = existe.id

        criaElemento(itemAtual)
        itens.push(itemAtual)
    }



    localStorage.setItem("Itens", JSON.stringify(itens))

    nome.value = ""
    quantidade.value = ""
})

function criaElemento(nome, quantidade) {
    console.log(nome)
    console.log(quantidade)

    const novoItem = document.createElement('li')
    novoItem.classList.add("item")

    const numeroItem = document.createElement('strong')
    numeroItem.innerHTML = item.quantidade
    numeroItem.dataset.id = item.id
    novoItem.innerHTML += item.nome

    const lista = document.getElementById("lista")

    novoItem.appendChild(botaoDeleta(item.id))

    lista.appendChild(novoItem)

}

function atulizaElemento(item) {
    document.querySelector("[data-id='" + item.id + "']")
}

function botaoDeleta(id) {
    const elementoBotao = document.createElement("button")
    elementoBotao.innerText = "x"

    elementoBotao.addEventListener("click", function()
    {
        deletaElemento(this.parentNode, id)
    })
    return elementoBotao
}

function deletaElemento(tag, id)
{
    tag.remove

    itens.splice(itens.findIndex(element => element.id === id),1)

    localStorage.setItem("Itens", JSON.stringify(itens))

}