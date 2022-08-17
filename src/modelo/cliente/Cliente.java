package modelo.cliente;

import java.math.BigInteger;
import java.util.Date;

import modelo.tipoCliente.Juridica;
import modelo.tipoCliente.Natural;

public class Cliente {
    private String nombres;
    private String apellidos;
    private BigInteger numeroIdentificacion;
    private String direccion;
    private BigInteger numeroTelefono;
    private boolean tipoCliente;
    private Juridica juridica;
    private Natural natural;
    
    public Cliente (){}


    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public BigInteger getNumeroIdentificacion() {
        return this.numeroIdentificacion;
    }

    public void setNumeroIdentificacion(BigInteger numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public BigInteger getNumeroTelefono() {
        return this.numeroTelefono;
    }

    public void setNumeroTelefono(BigInteger numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public boolean isTipoCliente() {
        return this.tipoCliente;
    }

    public boolean getTipoCliente() {
        return this.tipoCliente;
    }

    public void setTipoCliente(boolean tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public void setJuridica(BigInteger nit, BigInteger numeroIdentificacionT){
        juridica.setNit(nit);
        juridica.setNumeroIdentificacionTributaria(numeroIdentificacionT);
    }

    public void setNatural(Date fechaNacimiento, String email){
        natural.setEmail(email);
        natural.setFechaNacimiento(fechaNacimiento);
    }
}
