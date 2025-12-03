# language: pt
@hamburgueria
Funcionalidade: Pedidos na hamburgueria Peppa Lanches
  Para realizar pedidos corretos
  Como cliente
  Eu quero saber se o item pode ser pedido, o valor total e o tempo estimado

  Contexto:
    Dado que o cardápio contém os seguintes itens:
      | item         | preco |
      | x-bacon      | 25.00 |
      | x-salada     | 22.00 |
      | batata frita | 12.00 |

  @feliz
  Cenário: Pedido simples de item existente
    Quando eu peço o item "x-bacon" com quantidade 1
    Então o pedido deve ser aceito
      E o valor total deve ser 25.00

  @inexistente
  Cenário: Pedido de item inexistente
    Quando eu peço o item "milk-shake" com quantidade 1
    Então o pedido deve ser rejeitado
      E a mensagem "Item inexistente no cardápio" deve ser exibida

  @quantidade
  Cenário: Pedido com quantidade inválida
    Quando eu peço o item "x-salada" com quantidade 0
    Então o pedido deve ser rejeitado
      E a mensagem "Quantidade inválida" deve ser exibida

  @desconto
  Cenário: Pedido com desconto de 10 por cento
    Quando eu peço o item "batata frita" com quantidade 2
      E aplico um desconto de 10 por cento
    Então o valor total deve ser 21.60

  @sla
  Cenário: Calcular tempo estimado de preparo
    Quando eu peço o item "x-bacon" com quantidade 1
    Então o tempo estimado de preparo deve ser 15 minutos
