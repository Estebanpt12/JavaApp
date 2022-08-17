package modelo.tipoCliente;

import java.math.BigInteger;

public class Juridica {
    private BigInteger nit;
    private BigInteger numeroIdentificacionTributaria;

    public Juridica(){}

    public BigInteger getNit() {
        return this.nit;
    }

    public void setNit(BigInteger nit) {
        this.nit = nit;
    }

    public BigInteger getNumeroIdentificacionTributaria() {
        return this.numeroIdentificacionTributaria;
    }

    public void setNumeroIdentificacionTributaria(BigInteger numeroIdentificacionTributaria) {
        this.numeroIdentificacionTributaria = numeroIdentificacionTributaria;
    }

}
