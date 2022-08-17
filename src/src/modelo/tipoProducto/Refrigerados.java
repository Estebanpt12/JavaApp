package modelo.tipoProducto;

public class Refrigerados {
    private String codigoAprobacion;
    private short temperaturaRecomendada;

    public Refrigerados() {
    }

    public String getCodigoAprobacion() {
        return this.codigoAprobacion;
    }

    public void setCodigoAprobacion(String codigoAprobacion) {
        this.codigoAprobacion = codigoAprobacion;
    }

    public short getTemperaturaRecomendada() {
        return this.temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(short temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

}
