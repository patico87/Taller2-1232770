package com.clases;

import java.util.ArrayList;

public class BeneficiosCovid19 {
    //Debe ser el numero entero aleatorio puedes usar la funcion ramdom para esto
    private String id;
    private String Nombre;
    private Float ValorSubsidio;

    public BeneficiosCovid19() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Float getValorSubsidio() {
        return ValorSubsidio;
    }

    public void setValorSubsidio(String valorSubsidio) {
        ValorSubsidio = Float.parseFloat(valorSubsidio);
    }

    public BeneficiosCovid19(String id, String nombre, String valorSubsidio) {
        this.id = id;
        Nombre = nombre;
        ValorSubsidio = Float.parseFloat(valorSubsidio);
    }


    //Implementar un metodo que retorne el mejor beneficio comparando los valores de todos los beneficios
     public Float getMejorbeneficios(ArrayList<BeneficiosCovid19> ListaA,ArrayList<BeneficiosCovid19> ListaB) {
        double BeneficioLista1 = 0.0;
        double BeneficioLista1Ant = 0.0;
        double MejorBeneficioLista1 = 0.0;
        double BeneficioLista2 = 0.0;
        double BeneficioLista2Ant = 0.0;
        double MejorBeneficioLista2 = 0.0;
        double MejorBeneficio = 0.0;

         // Se recorre la lista 1 para buscar el mejor beneficio
        for (int i = 0; i < ListaA.size(); i++){

            if (BeneficioLista1Ant == 0.0) {
                BeneficioLista1Ant = ListaA.get(i).getValorSubsidio();
                MejorBeneficioLista1 = ListaA.get(i).getValorSubsidio();
            }
            else
                BeneficioLista1Ant = BeneficioLista1;
            BeneficioLista1 = ListaA.get(i).getValorSubsidio();

            if (BeneficioLista1 > BeneficioLista1Ant && BeneficioLista1 > MejorBeneficioLista1)
            {
                MejorBeneficioLista1 = BeneficioLista1;

            }
            else if (BeneficioLista1Ant > BeneficioLista1 && BeneficioLista1Ant > MejorBeneficioLista1)
            {
                MejorBeneficioLista1 = BeneficioLista1Ant;

            }
        }
       // Se recorre la lista 2 para buscar el mejor beneficio
         for (int i = 0; i < ListaB.size(); i++){

             if (BeneficioLista2Ant == 0.0) {
                 BeneficioLista2Ant = ListaB.get(i).getValorSubsidio();
                 MejorBeneficioLista2 = ListaB.get(i).getValorSubsidio();
             }
             else
                 BeneficioLista2Ant = BeneficioLista2;
             BeneficioLista2 = ListaB.get(i).getValorSubsidio();

             if (BeneficioLista2 > BeneficioLista2Ant && BeneficioLista2 > MejorBeneficioLista2)
             {
                 MejorBeneficioLista2 = BeneficioLista2;

             }
             else if (BeneficioLista2Ant > BeneficioLista2 && BeneficioLista2Ant > MejorBeneficioLista2)
             {
                 MejorBeneficioLista2 = BeneficioLista2Ant;

             }
         }

         // Se comparan ambos beneficios
         if(MejorBeneficioLista1 > MejorBeneficioLista2)
             MejorBeneficio = MejorBeneficioLista1;
         else
             MejorBeneficio = MejorBeneficioLista2;

      return Float.valueOf((float) MejorBeneficio);
     }
}
