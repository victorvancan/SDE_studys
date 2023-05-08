db.runCommand({
   collMod: "contas",
   validator: {
      $jsonSchema: {
         bsonType: "object",
         "additionalProperties": false,
         required: ["_id", "Numero_Conta", "Tipo", "CPF", "Valor"],
         properties: {
            _id: {
               bsonType: "objectId",
               description: "informe corretamente o endereço do cliente"
            },
            "Numero_Conta": {
               bsonType: "string",
               description: "Informe corretamente o numero da conta"
            },
            Tipo: {
               enum: ["Conta corrente", "Conta poupança", "Conta salário"],
               description: "informe corretamente o tipo da conta"
            },
            CPF: {
               bsonType: "string",
               minLength: 14,
               maxLength: 14,
               description: "informe corretamente o cpf do cliente na conta"
            },
            Valor: {
               bsonType: "double",
               description: "informe corretamente o valor da conta"
            }
         }
      }
   }
})
