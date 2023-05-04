public class Biblioteca {
    private String nome;
    private String Dono;
    private String Funcionários;
    private String Livros;

    public Biblioteca(String nome, String dono, String funcionários, String livros) {
        this.nome = nome;
        Dono = dono;
        Funcionários = funcionários;
        Livros = livros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDono() {
        return Dono;
    }

    public void setDono(String dono) {
        Dono = dono;
    }

    public String getFuncionários() {
        return Funcionários;
    }

    public void setFuncionários(String funcionários) {
        Funcionários = funcionários;
    }

    public String getLivros() {
        return Livros;
    }

    public void setLivros(String livros) {
        Livros = livros;
    }
}
