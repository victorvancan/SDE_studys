use modelagem

db.clientes.insertOne({
"_id": 4,
"Nome": "Juliana Eloá Brito",
"CPF": "208.862.381-70",
"Data_Nascimento": "26/06/1991",
"Genero": "Feminino",
"Profissao": "Trabalhador de serviços de limpeza",
"Endereco": {
    "Rua": "Euza D'Aparecida Roriz dos Anjos",
    "Numero": 617,
    "Bairro": "Setor Leste",
    "Cidade": "Luziânia",
    "Estado": "GO",
    "CEP": "72803-590"},
"Contas": {
    "Numero_Conta": "0189393-9",
    "Agência": "5575",
    "Tipo": "Conta salário",
    "CPF": "208.862.381-70",
    "Valor": 5.242},
"Status_Civil": "Solteiro(a)"})