/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User2021SD
 */
public class Producto {
   private String descripcion;
   private double precio;
   private int stock;
   private Categoria rubro;
   private int codigo;

    public Producto(String descripcion, Categoria rubro, double precio, int stock, int codigo) {
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
        this.rubro=rubro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Categoria getRubro() {
        return rubro;
    }

    public void setRubro(Categoria rubro) {
        this.rubro = rubro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    } 
        public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
   
   
}
