package org.juan.apiservlet.webapp.headers.services;

import org.juan.apiservlet.webapp.headers.models.Producto;

import java.util.Arrays;
import java.util.List;

public class ProductoServiceImpl implements ProductoService{

    @Override
    public List<Producto> listar(){
        return Arrays.asList(new Producto(1L,"notebook","computación",175000),
                new Producto(2L,"mesa escritorio","oficina",10000),
                new Producto(3L,"teclado","computación",40000));
    }

}
