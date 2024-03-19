package one.digitalinnovation.dominio;

public abstract class Conteudo {
    protected static final double XP_PADRAO = 10.0;

    protected String titulo;
    protected String descricao;


    Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public abstract double calcularXP();

    public String getDescricao() {
        return descricao;
    }

    public String getTitulo() {
        return titulo;
    }

}
