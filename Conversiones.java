import java.time.LocalDateTime;

public class Conversiones {
    private String monedaBase;
    private String monedaObjetivo;
    private double cantidadParaCambiar;
    private double cantidadCambiada;
    private LocalDateTime cambios;


    public Conversiones(String monedaBase, String monedaOjetivo, double cantidadParaCambiar, double cantidadCambiada){
        this.monedaBase = monedaBase;
        this.monedaObjetivo = monedaOjetivo;
        this.cantidadParaCambiar = cantidadParaCambiar;
        this.cantidadCambiada = cantidadCambiada;
        this.cambios = LocalDateTime.now();


    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public void setMonedaBase(String monedaBase) {
        this.monedaBase = monedaBase;
    }

    public String getMonedaOjetivo() {
        return monedaObjetivo;
    }

    public void setMonedaOjetivo(String monedaOjetivo) {
        this.monedaObjetivo = monedaOjetivo;
    }

    public double getCantidadParaCambiar() {
        return cantidadParaCambiar;
    }

    public void setCantidadParaCambiar(double cantidadParaCambiar) {
        this.cantidadParaCambiar = cantidadParaCambiar;
    }

    public double getCantidadCambiada() {
        return cantidadCambiada;
    }

    public void setCantidadCambiada(double cantidadCambiada) {
        this.cantidadCambiada = cantidadCambiada;
    }

    public LocalDateTime getCambios() {
        return cambios;
    }

    public void setCambios(LocalDateTime cambios) {
        this.cambios = cambios;
    }
}
