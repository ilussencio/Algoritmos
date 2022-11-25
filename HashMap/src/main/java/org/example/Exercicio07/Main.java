package org.example.Exercicio07;

import java.util.*;

public class Main {
    public static HashMap<String, Carro> FuncHashMap1(ArrayList<Carro> list){
        HashMap<String, Carro> hashMap = new HashMap<>();
        if(list.size() == 0){
            System.out.println("Lista Vazia!");
            return hashMap;
        }
        for(int i = 0; i < list.size(); i++){
            hashMap.put(list.get(i).getPlaca(),list.get(i));
        }
        System.out.println(hashMap);
        return hashMap;
    }

    public static HashMap<Integer, HashSet<Carro>> FuncHashMap2(ArrayList<Carro> list){
        HashMap<Integer, HashSet<Carro>> hashMap = new HashMap<>();
        for(int i = 0; i < list.size(); i ++){
            if(!hashMap.containsKey(list.get(i).getAno())){
                HashSet<Carro> carro = new HashSet<>();
                carro.add(list.get(i));
                hashMap.put(list.get(i).getAno(), carro);
            }else{
                hashMap.get(list.get(i).getAno()).add(list.get(i));
            }
        }
        return hashMap;
    }

    public static void main(String[] iftm){
        Scanner scan = new Scanner(System.in);
        //cadastrar carros e salvar em um arrayList
        ArrayList<Carro> list = new ArrayList<>();
        HashSet<String> marcas = new HashSet<>();
        int opcao = 0;
        System.out.print("Entre com a quantidade de carros: ");
        int quant = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < quant; i ++){
            Carro carro = new Carro();

            System.out.printf("Carro %d: Entre com o placa = ", i+1);
            carro.setPlaca(scan.nextLine());
            System.out.printf("Carro %d: Entre com o marca = ", i+1);
            String marca = scan.nextLine();
            carro.setMarca(marca);
            marcas.add(marca);
            System.out.printf("Carro %d: Entre com o modelo  = ", i+1);
            carro.setModelo(scan.nextLine());
            System.out.printf("Carro %d: Entre com o ano = ", i+1);
            carro.setAno(scan.nextInt());
            scan.nextLine();

            list.add(carro);
            System.out.println("------------------------------");
        }

        HashMap<String, Carro> hashMap1 = FuncHashMap1(list);
        HashMap<Integer, HashSet<Carro>> hashMap2 = FuncHashMap2(list);

        do{
            System.out.println("\n1 - Listar todos os carros");
            System.out.println("2 - Consultar carro pela placa");
            System.out.println("3 - Consultar vários carros pelo ano");
            System.out.println("4 - Listar as marcas de carros que foram cadastradas");
            System.out.println("5 - sair");
            System.out.printf("Opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    for (Carro carro : list)
                        System.out.println(carro);
                    break;
                case 2:
                    System.out.printf("Entre com a placa: ");
                    scan.nextLine();
                    String placa = scan.nextLine();
                    System.out.println(hashMap1.get(placa));
                    break;
                case 3:
                    System.out.printf("Entre com o ano: ");
                    int ano = scan.nextInt();
                    try {
                        for (Carro carro : hashMap2.get(ano))
                            System.out.println(carro);
                    } catch (NullPointerException e) {
                        System.out.println("Nenhum carro encontrado com esse ano!");
                    }
                    break;
                case 4:
                    System.out.println(marcas);
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        }while (opcao != 5);

    }
}
