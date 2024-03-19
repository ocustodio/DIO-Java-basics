package one.digitalinnovation.dominio;

import java.time.LocalDateTime;

public class Mentoria extends Conteudo {
    private LocalDateTime data;

    public Mentoria(String titulo, String descricao) {
        super(titulo, descricao);
    }

    public double calcularXP() {
        return XP_PADRAO;
    };

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public LocalDateTime getData() {
        return data;
    }
}
