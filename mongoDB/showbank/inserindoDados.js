db.clientes.insertOne({nome: "Allana Esther Lara Monteiro",
"cpf": "207.588.7003-96",
"data_nascimento": "15/03/1962",
"genero": "Feminino",
"profissao": "Servente de obras",
"endereco": "Rua Deputado João Moura Santos, número 155, Matadouro, Teresina, PI, 64004-340",
"status_Civil": "Divorciado(a)"
})


db.clientes.find()

db.contas.insert({"Numero_da_Conta": "04938-1",
"Agência": "5575",
"Tipo": "Conta salário",
"CPF": "207.588.703-96",
"Valor": 308})

db.contas.find()


db.clientes.insert({"nome": "Cauê Luan da Paz",
 "cpf": "426.239.760-23",
 "data_nascimento": "16/02/1967",
 "genero": "Masculino", 
 "profissao": "Vendedor em comércio atacadista", 
 "endereco": "Rua Vinte e Quatro, número 121, Três Vendas, Pelotas, RS, 96071-380", 
 "status_civil": "união estavel"})
 
 db.contas.insert({"Numero_da_Conta": "0265177-7",
"Agência": "0944",
"Tipo": "Conta salário",
"CPF": "426.239.760-23",
"Valor": "1411"})


