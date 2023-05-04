public class Funcionarios {
    private String Nomee;
    private char CPF;

    public Funcionarios(String Al, char CPF) {
        this.Nomee = Al;
        this.CPF = 123-2;
    }
    public String getNomee() {
        return Nomee;
    }

    public void setNomee(String nomee) {
        Nomee = nomee;
    }

    public char getCPF() {
        return CPF;
    }

    public void setCPF(char CPF) {
        this.CPF = CPF;
    }

}
