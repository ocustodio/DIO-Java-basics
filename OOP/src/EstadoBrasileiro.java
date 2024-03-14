public enum EstadoBrasileiro {
    RIO_DE_JANEIRO ("RJ", "Rio de Janeiro", 21),
    SAO_PAULO ("SP", "Sao Paulo", 11),
    PIAUI ("PI", "Piaui", 23),
    MARANHAO ("MA", "Maranhao", 41);

    private String nome;
    private String sigla;
    private int codIbge;

    private EstadoBrasileiro(String sigla, String nome, int codIbge) {
        this.nome = nome;
        this.sigla = sigla;
        this.codIbge = codIbge;
    }

    public int getCodIbge() {
        return codIbge;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
