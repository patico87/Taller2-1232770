package com.clientes;

import com.clases.BeneficiosCovid19;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code her

        BeneficiosCovid19 claseBeneficiosCovid19 = new BeneficiosCovid19();
        ArrayList<BeneficiosCovid19> listaBeneficios1 = new ArrayList();
        ArrayList<BeneficiosCovid19> listaBeneficios2 = new ArrayList();

        listaBeneficios1.add(new BeneficiosCovid19(getIdBeneficio(),"Auxilio a las personas mayores",   "9750000"));
        listaBeneficios1.add(new BeneficiosCovid19(getIdBeneficio(),"Auxilio a las personas sin empleo","835000"));
        listaBeneficios1.add(new BeneficiosCovid19(getIdBeneficio(),"Auxilio a las personas de  salud", "3000000"));

        listaBeneficios2.add(new BeneficiosCovid19(getIdBeneficio(),"Auxilio a las empresas","1780000"));
        listaBeneficios2.add(new BeneficiosCovid19(getIdBeneficio(),"Auxilio a la educación","800000"));
        listaBeneficios2.add(new BeneficiosCovid19(getIdBeneficio(),"Auxilio a la vivienda", "229000"));

        System.out.println("El mejor beneficio es :" + claseBeneficiosCovid19.getMejorbeneficios(listaBeneficios1,listaBeneficios2));

    }

    //Implementa un metodo que te entregue un numero aletorio para el ide de los beneficios usar el wrapper de Integer
    private static String getIdBeneficio(){
        String id ="";
        int numeroAleatorio = (int) (Math.random()*25+1);
        id = Integer.toString(numeroAleatorio);
        return id;
    }
}
