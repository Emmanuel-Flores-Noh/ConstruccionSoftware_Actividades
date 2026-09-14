public class SistemaPedidos {
    public static void main(String[] args) {
        Pedido nuevoPedido = new Pedido();
        nuevoPedido.setTipoCliente(TiposCliente.VIP);
        nuevoPedido.setMontoTotal(1500.0);
        nuevoPedido.setEsDiaEspecial(true);
        nuevoPedido.setDestino(Destinos.NACIONAL);
        nuevoPedido.procesarPedido();
    }
}