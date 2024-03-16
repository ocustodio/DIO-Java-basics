package ExemploInterface.Fabrica;

import ExemploInterface.Equipamentos.Copiadora.Copiadora;
import ExemploInterface.Equipamentos.Digitalizadora.Digitalizadora;
import ExemploInterface.Equipamentos.Impressora.Impressora;
import ExemploInterface.Multifuncional.EquipMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipMultifuncional equipamento = new EquipMultifuncional();

        Digitalizadora digitalizadora = equipamento;
        Impressora impressora = equipamento;
        Copiadora copiadora = equipamento;

        digitalizadora.digitalizar();
        impressora.imprimir();
        copiadora.copiar();
    }
}
