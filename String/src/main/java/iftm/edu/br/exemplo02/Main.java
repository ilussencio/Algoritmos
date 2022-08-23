package exemplo02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();
        String partes[] = data.split("/");
        System.out.println("Estamos no dia "+partes[0]+" do mes.");
        scan.close();
    }
}
