package estudos.EstruturaDeDados.testes;

import estudos.EstruturaDeDados.Lista;

import java.util.ArrayList;

public class teste12 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>(5);

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("A");

        System.out.println(arrayList.lastIndexOf("A"));
    }
}
