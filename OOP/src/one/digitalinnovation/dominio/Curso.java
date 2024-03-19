package one.digitalinnovation.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso(String titulo, String descricao) {
        super(titulo, descricao);
    }

    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
}
