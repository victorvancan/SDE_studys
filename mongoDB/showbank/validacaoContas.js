db.createCollection("contas", {
    validator: {
        $jsonSchema: {
            bsonType: "object",
            required: ["Numero_da_Conta", "Tipo", "CPF"],
            properties: {
                Numero_Conta: {
                    bsonType: "string",
                    description: "informe corretamente o numero da conta"
                },
                Tipo: {
                    bsonType: "string",
                    enum: ["Conta corrente", "Conta poupança", "Conta salário"],
                    description: "informe corretamente o tipo da conta"
                },
                CPF: {
                    bsonType: "string",
                    description: "informe corretamente o cpf do cliente na conta"
                }
            }
        }
    }

}) 
