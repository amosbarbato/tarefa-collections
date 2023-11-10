package java_collection;

import java.util.Arrays;
import java.util.Scanner;

public class sortedListGroup {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String femaleNames = "";
        String maleNames = "";

        System.out.println("Digite o nome e sexo das pessoas: [nome - m/f]");

        //Registrando os Nomes
        String[] listName = s.nextLine().split(", ");
        Arrays.sort(listName);

        for (String i : listName) {
            String[] gender = i.split(" - ");

            if (gender[1].equalsIgnoreCase("f")) {
                femaleNames += gender[0] + ",";
            } else if (gender[1].equalsIgnoreCase("m")) {
                maleNames += gender[0] + ",";
            }
        }

        // Separando por Grupos de Genero
        String[] femNames = femaleNames.split(",");
        String[] malNames = maleNames.split(",");

        System.out.println("Nomes Femininos");
        for (String i : femNames) {
            System.out.println(i);
        }

        System.out.println("======================");

        System.out.println("Nomes Masculinos");
        for (String i : malNames) {
            System.out.println(i);
        }

        s.close();
    }
}
