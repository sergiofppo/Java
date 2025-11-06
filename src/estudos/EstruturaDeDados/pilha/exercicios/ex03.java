package estudos.EstruturaDeDados.pilha.exercicios;

import estudos.EstruturaDeDados.pilha.Livro;
import estudos.EstruturaDeDados.pilha.Pilha;

public class ex03 {
    public static void main(String[] args) {
        Pilha<Livro> pilha = new Pilha<Livro>(20);

        Livro livro1 = new Livro();
        livro1.setNome("1984");
        livro1.setIsbn("978-0-452-28423-4");
        livro1.setAutor("George Orwell");
        livro1.setAnoLancamento("1949");

        Livro livro2 = new Livro();
        livro2.setNome("Dom Casmurro");
        livro2.setIsbn("978-85-359-0277-0");
        livro2.setAutor("Machado de Assis");
        livro2.setAnoLancamento("1899");

        Livro livro3 = new Livro();
        livro3.setNome("O Pequeno Príncipe (Le Petit Prince)");
        livro3.setIsbn("978-85-359-0278-7");
        livro3.setAutor("Antoine de Saint-Exupéry");
        livro3.setAnoLancamento("1943");

        pilha.empilha(livro1);
        pilha.empilha(livro2);
        pilha.empilha(livro3);

        System.out.println(pilha);

        pilha.desempilha();

        System.out.println(pilha);

        System.out.println(pilha.topo());

        System.out.println(pilha.isEmpty());

    }
}
