const form = document.getElementById('novoItem')
const lista = documentq.getElementById("lista")
const itens = []

form.addEventListener("submit", (evento) => {
    evento.preventDefault()

    const nome = elements.target.elements['nome']
    const quantidade = elements.target.elements['quantidade']
    
    criaElemento(evento.target.elements['nome'].value, evento.target.elements['quantidade'].value)

    nome.value = ""
    quantidade.value = ""
})

function criaElemento(nome, quantidade) {
    console.log(nome)
    console.log(quantidade)

    const novoItem = document.createElement('li')
    novoItem.classList.add("item")

    const numeroItem = document.createElement('strong')
    numeroItem.innerHTML = quantidade

    novoItem.innerHTML += nome
    
    const lista = document.getElementById("lista")
    
    lista.appendChild(novoItem)

    const itemAtual = {
        "nome":nome,
        "quantidade":quantidade
    }

    itens.push(itemAtual)

    localStorage.setItem("Item", JSON.stringify(itens))
    
}