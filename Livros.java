public class Livros {
    private String Titulo;
    private String Autor;
    private int Ano;

    public Livros(String Wakawaka, String autor, int ano) {
        this.Titulo = Wakawaka;
        this.Autor = autor;
        this.Ano = 1997;
    }

    public String getName() {
        return Titulo;
    }

    public void setName(String name) {
        Titulo = name;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int ano) {
        Ano = ano;
    }
}
