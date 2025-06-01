package estudos;

public class aula05_EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 17;
                if (idade < 15) {
                    System.out.println("infantil");
                } else if (idade >= 15 && idade < 18) {
                    System.out.println("juvenil");
                } else {
                    System.out.println("adulto");
                }
    }
}
