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
    
    
        const itemAtual = {
            "nome":nome.value,
            "quantidade":quantidade.value
        }
    
        itens.push(itemAtual)
    
        localStorage.setItem("Itens", JSON.stringify(itens))

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
    numeroItem.innerHTML = item.quantidade

    novoItem.innerHTML += item.nome
    
    const lista = document.getElementById("lista")
    
    lista.appendChild(novoItem)
    
}