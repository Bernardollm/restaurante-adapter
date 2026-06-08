package Adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestauranteTest {

    @Test
    void deveAdaptarSistemaAntigo() {

        SistemaAntigoPedido sistemaAntigo =
                new SistemaAntigoPedido();

        PedidoRestaurante pedido =
                new PedidoAdapter(
                        sistemaAntigo
                );

        assertEquals(
                "Pedido enviado para a cozinha",
                pedido.fazerPedido()
        );
    }

    @Test
    void deveUsarInterfaceDoRestaurante() {

        PedidoRestaurante pedido =
                new PedidoAdapter(
                        new SistemaAntigoPedido()
                );

        assertNotNull(
                pedido.fazerPedido()
        );
    }

    @Test
    void deveRetornarMensagemCorreta() {

        PedidoRestaurante pedido =
                new PedidoAdapter(
                        new SistemaAntigoPedido()
                );

        assertTrue(
                pedido.fazerPedido()
                        .contains("cozinha")
        );
    }
}
