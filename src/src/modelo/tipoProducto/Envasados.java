package modelo.tipoProducto;


public class Envasados {
    private String fechaEnvasado;
    private short pesoEnvase;
    private String paisEnvase;

    public Envasados() {
    }

    public String getFechaEnvasado() {
        return this.fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public short getPesoEnvase() {
        return this.pesoEnvase;
    }

    public void setPesoEnvase(short pesoEnvase) {
        this.pesoEnvase = pesoEnvase;
    }

    public String getPaisEnvase() {
        return this.paisEnvase;
    }

    public void setPaisEnvase(String paisEnvase) {
        this.paisEnvase = paisEnvase;
    }
}
