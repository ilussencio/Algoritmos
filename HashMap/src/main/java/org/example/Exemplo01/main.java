package org.example.Exemplo01;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] iftm){
        HashMap<String, String> dddPorMunicipio = new HashMap<>();
        dddPorMunicipio.put("Sao paulo", "11");
        dddPorMunicipio.put("Rio de janeiro","22");
        dddPorMunicipio.put("belo horizonte", "31");

        for(Map.Entry<String, String> x : dddPorMunicipio.entrySet()){
            System.out.println(x.getKey() +" : "+x.getValue());
        }
    }
}
