package com.github.viniciusfcf.activemq;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class ConsumidorUmNumeros {
    
    @Incoming("consumidor-um")                                  
    public void consuma(int numero) {
        System.out.println("Consumidor UM " + numero);
    }
}
