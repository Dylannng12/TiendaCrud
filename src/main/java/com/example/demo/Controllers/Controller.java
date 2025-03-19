package com.example.demo.Controllers;

import com.example.demo.Servicee.Producto;
import com.example.demo.Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;

import static org.hibernate.type.descriptor.java.DataHelper.extractBytes;

@RestController
@RequestMapping("/ver")
public class Controller {

    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping
    public void ver(){
        Producto producto = new Producto();

        try {

            FileInputStream img = new FileInputStream("/home/dylan/Documentos/TiendaRCRUD/src/main/resources/static/img/remera-negra-puesta11-c2126ceece9c419cbb16513266147936-1024-1024.png");

            //BufferedImage imgf = ImageIO.read(img);

            //WritableRaster raster = imgf.getRaster();

            //DataBufferByte data = (DataBufferByte) raster.getDataBuffer();

            byte[] rtn = extractBytes(img);
            producto.setNomproducto("Remera Negra");
            producto.setDescripcion("Es una Remera negra");
            producto.setPrecio(90000);
            producto.setImg(rtn);
            try {

            }catch (Exception q){

                System.out.println("Error al guardar");

            }

        }catch (Exception e){

            System.out.println("Error en la lectura");

        }
        productoRepository.save(producto);
    }
}