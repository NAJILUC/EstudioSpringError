package com.bolsadeideas.springboot.error.app.services;

import com.bolsadeideas.springboot.error.app.models.domain.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements  UsuarioService{

    private List<Usuario> lista;

    public UsuarioServiceImpl() {
        this.lista = new ArrayList<>();
        this.lista.add(new Usuario(1,"Camila","Torres de Najiluc"));
        this.lista.add(new Usuario(2,"Carlos","Torres"));
        this.lista.add(new Usuario(3,"Najiluc","Crack"));
        this.lista.add(new Usuario(4,"David","Navarro"));
        this.lista.add(new Usuario(5,"Manuel","Navarro"));
        this.lista.add(new Usuario(6,"Ricardo","Navarro"));
    }

    @Override
    public List<Usuario> listar() {
        return null;
    }

    @Override
    public Optional<Usuario> obtenerPorIDOptional(Integer id) {
        Usuario usuario = this.obtenerPorID(id);
        return Optional.ofNullable(usuario);
    }

    @Override
    public Usuario obtenerPorID(Integer id) {
        Usuario resultado=null;
        for (Usuario u: this.lista) {
            if(u.getId().equals(id)){
                resultado = u;
                break;
            }
        }
        return resultado;
    }
}
