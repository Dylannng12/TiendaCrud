package com.example.demo.Servicee;

import jakarta.persistence.*;

@Entity
@Table(name="Productos")
public class Producto {

    public Producto(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Nomproducto;

    private int Precio;

    private String Descripcion;

    @Lob
    @Column(name="imgBlob")
    private byte[] img;


    public Producto(String nomproducto, int precio, String descripcion, byte[] img) {
        Nomproducto = nomproducto;
        Precio = precio;
        Descripcion = descripcion;
        this.img = img;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomproducto() {
        return Nomproducto;
    }

    public void setNomproducto(String nomproducto) {
        Nomproducto = nomproducto;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }
}
