package ExemploInterface.Multifuncional;

import ExemploInterface.Equipamentos.Copiadora.Copiadora;
import ExemploInterface.Equipamentos.Digitalizadora.Digitalizadora;
import ExemploInterface.Equipamentos.Impressora.Impressora;

public class EquipMultifuncional implements Copiadora, Digitalizadora, Impressora {   
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");
    }
 
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional");
    }

    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");
    }

}
