public class Pedido {
    private TiposCliente tipoCliente;
    private Destinos destino;
    private boolean esDiaEspecial = false;
    private double montoTotal = 0;
    private double descuento = 0;
    private double costoEnvio = 0;
    private double montoFinal = 0;

    public Pedido() {}

    public void setTipoCliente(TiposCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public void setEsDiaEspecial(boolean esDiaEspecial) {
        this.esDiaEspecial = esDiaEspecial;
    }

    public void setDestino(Destinos destino) {
        this.destino = destino;
    }

    private void imprimirResumen() {
        System.out.println("=== RESUMEN DE COMPRA===");
        System.out.println("Monto Base: $" + montoTotal);
        System.out.println("Descuento Aplicado: $" + descuento);
        System.out.println("Costo de Envío: $" + costoEnvio);
        System.out.println("Total a Pagar: $" + montoFinal);
        System.out.println("Estado: APROBADO");
    }



    public void procesarPedido() {
        if (tipoCliente == null) {
            System.out.println("Tipo de cliente inválido.");
            return;
        }
        if (montoTotal <= 0) {
            System.out.println("El monto debe ser mayor a cero.");
            return;
        }
        if (destino == null) {
            System.out.println("El destino no se ha establecido");
            return;
        }

        descuento = tipoCliente.getDescuento(montoTotal);

        if (esDiaEspecial) {
            descuento += montoTotal * 0.05;
        }

        costoEnvio = destino.getCostoEnvio(montoTotal);

        montoFinal = montoTotal - descuento + costoEnvio;

        if (montoFinal <= 0) {
            System.out.println("Error en la transacción.");
            return;
        }

        imprimirResumen();
    }
}
