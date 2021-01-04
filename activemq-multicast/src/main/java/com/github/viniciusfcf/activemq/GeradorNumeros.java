package com.github.viniciusfcf.activemq;

import java.time.Duration;
import java.util.Random;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Outgoing;

import io.smallrye.mutiny.Multi;

@ApplicationScoped
public class GeradorNumeros {

    private Random random = new Random();

    @Outgoing("numeros")                        
    public Multi<Integer> numeros() {                  
        return Multi.createFrom().ticks().every(Duration.ofSeconds(10))
                .onOverflow().drop()
                .map(tick -> random.nextInt(100));
    }

}