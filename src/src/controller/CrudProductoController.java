/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.producto.Producto;

/**
 *
 * @author Esteban
 */
public class CrudProductoController {
    ArrayList<Producto> listaProducto;
    
    public CrudProductoController(){
        listaProducto = new ArrayList<>();
    }
    
    public void addProducto(String[] nuevoProducto){
        Producto producto = new Producto();
        producto.setCodigo(nuevoProducto[0]);
        producto.setNombre(nuevoProducto[1]);
        producto.setDescripcion(nuevoProducto[2]);
        producto.setValorUnitario(Integer.parseInt(nuevoProducto[3]));
        producto.setCantidadExistencia(Integer.parseInt(nuevoProducto[4]));
        producto.setTipoProducto(nuevoProducto[5]);
        producto.setPerecederos(nuevoProducto[6]);
        producto.setRefrigerados(nuevoProducto[7], Short.valueOf(nuevoProducto[8]));
        producto.setEnvasado(nuevoProducto[9], Short.valueOf(nuevoProducto[10]), nuevoProducto[11]);
        listaProducto.add(producto);
    }
    
    public void deleteProducto(int index){
        listaProducto.remove(index);
    }
    
    public void writeListaProducto(){
        File file = new File("Productos.txt");
        try {
            PrintWriter writer; 
            writer = new PrintWriter(file);
            writer.print(""); 
            writer.close(); 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CrudProductoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for(int i=0; i<listaProducto.size();i++){
                printWriter.println(listaProducto.get(i).getCodigo()+","+listaProducto.get(i).getNombre()+","+
                                    listaProducto.get(i).getDescripcion()+","+listaProducto.get(i).getValorUnitario()+","+
                                    listaProducto.get(i).getCantidadExistencia()+","+listaProducto.get(i).getTipoProducto()+","+
                                    listaProducto.get(i).getPerecederos()+","+listaProducto.get(i).getRefrigeradosCodigo()+","+
                                    listaProducto.get(i).getRefrigeradosTemperatura()+","+listaProducto.get(i).getEnvasadoFecha()+","+
                                    listaProducto.get(i).getEnvasadoPeso()+","+listaProducto.get(i).getEnvasadoPais()+",");
            printWriter.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(CrudProductoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*public String getRow(int index){
        Producto producto = listaProducto.get(index);
        if(producto.getPerecederos() == null){
            producto.setPerecederos =
        }
    }*/
    
    public void editProducto(int indexProducto, int campo, String valor){
       Producto producto = listaProducto.get(indexProducto);
       switch(campo){
           case 1:
               producto.setCodigo(valor);
               listaProducto.set(indexProducto, producto);
           break;
           case 2:
               producto.setNombre(valor);
               listaProducto.set(indexProducto, producto);
           break;
           case 3:
               producto.setDescripcion(valor);
               listaProducto.set(indexProducto, producto);
           break;
           case 4:
               producto.setValorUnitario(Integer.parseInt(valor));
               listaProducto.set(indexProducto, producto);
           break;
           case 5:
               producto.setCantidadExistencia(Integer.parseInt(valor));
               listaProducto.set(indexProducto, producto);
           break;
           case 6:
               producto.setTipoProducto(valor);
               listaProducto.set(indexProducto, producto);
           break;
           case 7:
               producto.setPerecederos(valor);
               listaProducto.set(indexProducto, producto);
           break;
           case 8:
               producto.setRefrigeradosCodigo(valor);
               listaProducto.set(indexProducto, producto);
           break;
           case 9:
               producto.setRefrigeradosTemperatura(Short.valueOf(valor));
               listaProducto.set(indexProducto, producto);
           break;
           case 10:
               producto.setEnvasadoFecha(valor);
               listaProducto.set(indexProducto, producto);
           break;
           case 11:
               producto.setEnvasadoPeso(Short.valueOf(valor));
               listaProducto.set(indexProducto, producto);
           break;
           case 12:
               producto.setEnvasadoPais(valor);
               listaProducto.set(indexProducto, producto);
           break;
       }
    }
}
