public enum TiposCliente {
    REGULAR,
    VIP,
    NUEVO;

    public double getDescuento(double montoTotal) {
        return switch ( this ) {
            case REGULAR -> montoTotal > 1000 ? montoTotal * 0.05 : 0.0;
            case VIP -> {
                if (montoTotal > 2000) {
                    yield montoTotal * 0.20;
                } else if (montoTotal > 1000) {
                    yield montoTotal * 0.15;
                } else {
                    yield montoTotal * 0.10;
                }
            }
            case NUEVO -> 50.0;
        };
    }
}
