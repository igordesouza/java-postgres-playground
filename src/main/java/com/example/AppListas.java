package com.example;

// import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class AppListas {
    public static void main(String[] args) {
        List lista = new LinkedList();
        lista.add(new Cidadao());
        lista.add(new Cliente());
        lista.add("Isso é uma string");
        lista.add(123);
        System.out.println(lista);


        List<Cliente> listaClientes = new ArrayList<>();    

        var cliente1 = new Cliente();
        cliente1.setNome("Manoel");
        cliente1.setCidade("Fortaleza");

        var cliente2 = new Cliente();
        cliente2.setNome("Breno");
        cliente2.setCidade("Manaus");

        listaClientes.add(cliente1);
        listaClientes.add(cliente1);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente2);
        listaClientes.add(cliente1);
        listaClientes.add(cliente1);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente2);
        listaClientes.remove(0);
        listaClientes.remove(0);
        listaClientes.remove(0);
        listaClientes.remove(cliente1); 

        int i = listaClientes.size()-1;
        listaClientes.remove(i);


        // System.out.println(listaClientes);

        for (Cliente cliente : listaClientes) {
            System.out.println(cliente);
        }

        
    }
    
}
