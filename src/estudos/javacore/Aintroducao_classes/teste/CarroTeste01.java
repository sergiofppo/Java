package estudos.javacore.Aintroducao_classes.teste;

import estudos.javacore.Aintroducao_classes.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Audi";
        carro1.modelo = "A5";
        carro1.ano = 2024;

        carro2.nome = "Mercedes-Benz";
        carro2.modelo = "CLA 45 AMG";
        carro2.ano = 2022;

        System.out.println("Nome: " +carro1.nome+ " - Modelo: " +carro1.modelo+ " - Ano: "+
                carro1.ano);
        System.out.println("Nome: " +carro2.nome+ " - Modelo: " +carro2.modelo+ " - Ano: "+
                carro2.ano);
    }
}
