package steps;

import static org.junit.Assert.*;
import io.cucumber.java.pt.*;
import java.util.*;


public class PedidosSteps {

    private Map<String, Double> cardapio;
    private boolean pedidoAceito;
    private String mensagemErro;
    private double valorTotal;
    private int tempoEstimado;

 @Dado("que o cardápio contém os seguintes itens:")
public void que_o_cardapio_contem_os_seguidos_itens(io.cucumber.datatable.DataTable dataTable) {
    cardapio = new HashMap<>();
    dataTable.asMaps().forEach(linha -> {
        double preco = Double.parseDouble(linha.get("preco")) * 100;
        cardapio.put(linha.get("item"), preco);
    });
}


    @Quando("eu peço o item {string} com quantidade {int}")
    public void eu_peco_o_item_com_quantidade(String item, int quantidade) {
        if (!cardapio.containsKey(item)) {
            pedidoAceito = false;
            mensagemErro = "Item inexistente no cardápio";
            return;
        }

        if (quantidade <= 0) {
            pedidoAceito = false;
            mensagemErro = "Quantidade inválida";
            return;
        }

        pedidoAceito = true;
        valorTotal = cardapio.get(item) * quantidade;

        
        tempoEstimado = 15;
    }

    @Então("o pedido deve ser aceito")
    public void o_pedido_deve_ser_aceito() {
        assertTrue(pedidoAceito);
    }

    @Então("o valor total deve ser {double}")
    public void o_valor_total_deve_ser(Double esperado) {
        assertEquals(esperado, valorTotal, 0.01);
    }

    @Então("o pedido deve ser rejeitado")
    public void o_pedido_deve_ser_rejeitado() {
        assertFalse(pedidoAceito);
    }

    @Então("a mensagem {string} deve ser exibida")
    public void a_mensagem_deve_ser_exibida(String mensagem) {
        assertEquals(mensagem, mensagemErro);
    }

    @Quando("aplico um desconto de {int} por cento")
    public void aplico_um_desconto_de_por_cento(int desconto) {
        double percentual = (100 - desconto) / 100.0;
        valorTotal = valorTotal * percentual;
    }

    @Então("o tempo estimado de preparo deve ser {int} minutos")
    public void o_tempo_estimado_de_preparo_deve_ser_minutos(Integer minutos) {
        assertEquals(minutos.intValue(), tempoEstimado);
    }
}
