package estudos.EstruturaDeDados.testes;

import java.util.ArrayList;

public class teste10 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("A");
        arrayList.add("C");
        arrayList.add(1, "B");

        System.out.println(arrayList);

        boolean existe = arrayList.contains("A");
        if (existe) {
            System.out.println(existe);
        }

        int pos = arrayList.indexOf("C");
        if (pos > -1) {
            System.out.println(pos);
        }

        System.out.println(arrayList.get(1));

        arrayList.remove(1);
        arrayList.remove("B");

        System.out.println(arrayList);
        System.out.println(arrayList.size());

        arrayList.clear();
        System.out.println(arrayList);
        System.out.println(arrayList.size());

    }
}
