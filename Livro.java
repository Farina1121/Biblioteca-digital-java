import java.util.Objects;

public class Livro {
    private final String titulo;
    private final String autor;
    private final String isbn;
    private final int anoPublicacao;
    private boolean emprestado;

    public Livro(String titulo, String autor, String isbn, int anoPublicacao) {
        this.titulo = Objects.requireNonNull(titulo, "O título não pode ser nulo.");
        this.autor = Objects.requireNonNull(autor, "O autor não pode ser nulo.");
        this.isbn = Objects.requireNonNull(isbn, "O ISBN não pode ser nulo.");
        this.anoPublicacao = anoPublicacao;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }
        if (!(objeto instanceof Livro)) {
            return false;
        }
        Livro outroLivro = (Livro) objeto;
        return isbn.equals(outroLivro.isbn);
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }

    @Override
    public String toString() {
        return "Livro{"
                + "titulo='" + titulo + '\''
                + ", autor='" + autor + '\''
                + ", isbn='" + isbn + '\''
                + ", anoPublicacao=" + anoPublicacao
                + ", emprestado=" + emprestado
                + '}';
    }
}
