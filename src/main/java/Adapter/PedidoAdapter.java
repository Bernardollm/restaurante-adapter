package Adapter;

public class PedidoAdapter
        implements PedidoRestaurante {

    private SistemaAntigoPedido sistemaAntigo;

    public PedidoAdapter(
            SistemaAntigoPedido sistemaAntigo
    ) {

        this.sistemaAntigo = sistemaAntigo;
    }

    @Override
    public String fazerPedido() {

        return sistemaAntigo.enviarPedido();
    }
}
