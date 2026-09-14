public enum Destinos {
    LOCAL,
    NACIONAL,
    INTERNACIONAL;

    public double getCostoEnvio(double montoTotal) {
        return switch ( this ) {
            case LOCAL -> 50.0;
            case NACIONAL -> montoTotal > 1500 ? 0 : 150.0;
            case INTERNACIONAL -> montoTotal > 3000 ? 100.0 : 500.0;
        };
    }
}
