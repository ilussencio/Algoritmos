package iftm.edu.br.StringBuilder;

public class App {
    public static void main(String[] args){
        StringBuilder texto1 = new StringBuilder();
        StringBuilder texto2 = new StringBuilder("Lucas Ilussencio");
        texto1.append(texto2);
        texto1.insert(4, "Meu nome e ");
        System.out.println(texto1);
    }
}
