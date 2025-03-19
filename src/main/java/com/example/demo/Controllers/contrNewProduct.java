package com.example.demo.Controllers;

import com.example.demo.Repository.ProductoRepository;
import com.example.demo.Servicee.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.ByteArrayInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Base64;
import java.util.Map;

import static org.hibernate.type.descriptor.java.DataHelper.extractBytes;


@RestController
@RequestMapping("/NewProduct")
public class contrNewProduct {

    @Autowired
    private ProductoRepository productoRepository;

    @PostMapping("/Product")
    public void IngresoDedatos(@RequestBody Map<String, String> payload) {

         try{

             String base64 = payload.get("base64");

              String nombre= payload.get("nombre");

             String precio= payload.get("precio").toString();

             String descripcion= payload.get("descripcion");

             System.out.println(nombre+precio+descripcion);

             byte[] imgbytes = Base64.getDecoder().decode(base64);

             Producto producto = new Producto();
             producto.setImg(imgbytes);

             // productoRepository.save(producto);

          }catch (Exception e){

             System.out.println("Error en la Entrada");

         }
    }
}
