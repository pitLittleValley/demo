package com.example.demo.service;

//import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;

public class EntidadServiceFactory {
   // @Value("${db.structure}")
    private String dbStructure;

@Autowired
EntidadServiceS1 serviceS1;


    private EntidadServiceS2 serviceS2;

    public EntidadService getService() {
        if ("S1".equals(dbStructure)) {
            return serviceS1;
        } else if ("S2".equals(dbStructure)) {
            return serviceS2;
        }
        throw new IllegalStateException("Estructura no soportada: " + dbStructure);
    }

}
