package modelo.transaccion;

import java.util.Date;

public class Transaccion {
    private String codigo;
    private Date fecha;
    private String cliente;
    private int total;
    private short iva;
    private DetalleTransaccion detalleTransaccion;

    public Transaccion() {
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return this.cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public short getIva() {
        return this.iva;
    }

    public void setIva(short iva) {
        this.iva = iva;
    }
}
