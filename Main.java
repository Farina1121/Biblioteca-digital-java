public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", "978-85-359-0277-5", 1899);
        Livro livro2 = new Livro("O Alienista", "Machado de Assis", "978-85-359-0278-2", 1882);
        Livro livro3 = new Livro("A Hora da Estrela", "Clarice Lispector", "978-85-359-0308-6", 1977);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        System.out.println("Livro removido: "
                + biblioteca.removerLivroPorIsbn("978-85-359-0278-2"));

        System.out.println("\nBusca por título (\"estrela\"): "
                + biblioteca.procurarPorTitulo("estrela"));
        System.out.println("\nBusca por autor (\"Machado de Assis\"): "
                + biblioteca.procurarPorAutor("Machado de Assis"));
        System.out.println("\nLivros ordenados por ano:");
        for (Livro livro : biblioteca.listarLivrosOrdenadosPorAno()) {
            System.out.println(livro);
        }

        System.out.println("\nPrimeiro empréstimo: "
                + biblioteca.emprestarLivro("978-85-359-0277-5"));
        System.out.println("Tentativa de emprestar novamente: "
                + biblioteca.emprestarLivro("978-85-359-0277-5"));
        System.out.println("Livro devolvido: "
                + biblioteca.devolverLivro("978-85-359-0277-5"));
    }
}
