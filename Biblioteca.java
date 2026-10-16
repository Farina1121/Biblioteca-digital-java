import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

public class Biblioteca {
    private final Set<Livro> livros = new HashSet<>();

    public boolean adicionarLivro(Livro livro) {
        return livros.add(Objects.requireNonNull(livro, "O livro não pode ser nulo."));
    }

    public boolean removerLivroPorIsbn(String isbn) {
        Objects.requireNonNull(isbn, "O ISBN não pode ser nulo.");
        return livros.removeIf(livro -> livro.getIsbn().equals(isbn));
    }

    public List<Livro> procurarPorTitulo(String titulo) {
        Objects.requireNonNull(titulo, "O título não pode ser nulo.");
        List<Livro> resultados = new ArrayList<>();
        String tituloPesquisado = titulo.toLowerCase(Locale.ROOT);
        for (Livro livro : livros) {
            if (livro.getTitulo().toLowerCase(Locale.ROOT).contains(tituloPesquisado)) {
                resultados.add(livro);
            }
        }
        return resultados;
    }

    public List<Livro> procurarPorAutor(String autor) {
        Objects.requireNonNull(autor, "O autor não pode ser nulo.");
        List<Livro> resultados = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                resultados.add(livro);
            }
        }
        return resultados;
    }

    public List<Livro> listarLivrosOrdenadosPorAno() {
        List<Livro> resultados = new ArrayList<>(livros);
        resultados.sort(Comparator.comparingInt(Livro::getAnoPublicacao)
                .thenComparing(Livro::getTitulo)
                .thenComparing(Livro::getIsbn));
        return resultados;
    }

    public boolean emprestarLivro(String isbn) {
        Livro livro = procurarPorIsbn(isbn);
        if (livro == null || livro.isEmprestado()) {
            return false;
        }
        livro.setEmprestado(true);
        return true;
    }

    public boolean devolverLivro(String isbn) {
        Livro livro = procurarPorIsbn(isbn);
        if (livro == null || !livro.isEmprestado()) {
            return false;
        }
        livro.setEmprestado(false);
        return true;
    }

    private Livro procurarPorIsbn(String isbn) {
        Objects.requireNonNull(isbn, "O ISBN não pode ser nulo.");
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }
}
