public class motor {
    private int potência;
    private int cavalos;

    public motor(int potência, int cavalos) {
        this.potência = potência;
        this.cavalos = cavalos;
    }

    public int getPotência() {
        return potência;
    }

    public void setPotência(int potência) {
        this.potência = potência;
    }

    public int getCavalos() {
        return cavalos;
    }

    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }
}
