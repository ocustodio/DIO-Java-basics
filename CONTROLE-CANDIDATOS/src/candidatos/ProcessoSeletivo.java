package candidatos;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"Mateus", "Jorge", "Carlos", "Maria", "Joao", "Leo", "Victor", "Camille", "Jose", "Amaral"};
        double salBase = 2000.0;

        String[] listaCandidatos =  selecionaCandidato(candidatos, salBase).toArray(new String[0]);
        imprimirCandidatos(listaCandidatos);
        ligarCandidatos(listaCandidatos);
    }

    public static String salarioPretendido(double salBase, double salCandidato) {
        if (salBase > salCandidato) return "LIGAR PARA O CANDIDATO";
        if (salBase == salCandidato) return "LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA";

        return "AGUARDANDO RESULTADO DEMAIS CANDIDATOS";
    }

    public static ArrayList<String> selecionaCandidato(String[] candidatos, double salBase) {
        
        int vagas = 0;
        ArrayList<String> listaCandidatos = new ArrayList<>();

        for(int i = 0; i < candidatos.length; i++) {
            double valorAleatorio = valorAleatorio();

            if (vagas == 5) break;

            if (valorAleatorio <= salBase) {
                listaCandidatos.add(candidatos[i]);
                vagas++;
            }
        }

        return listaCandidatos;
    }

    public static void imprimirCandidatos(String[] candidatos) {
        System.out.println("Imprimindo a lista de candidatos: ");
        for (int i = 0 ; i < candidatos.length; i++) {
            System.out.println("Candidato de num " + (i + 1) + " de nome: " + candidatos[i]);
        }
    } 

    public static void ligarCandidatos(String[] candidatos) {
        for(int i = 0; i < candidatos.length; i++) {
            entrandoEmContato(candidatos[i]);
        }

    }

    public static void entrandoEmContato(String candidato) {
        // boolean continuarTentando = true;
        boolean atendeu = false;

        for(int i = 1 ; i <= 3 ; i++) {
            atendeu = fazerLigacao();

            if(atendeu) {
                System.out.println("Conseguimos contato com " + candidato + " em " + i + " tentativa(s)!");
                break;
            }
        }

        if(!atendeu) System.out.println("Nao conseguimos contato com " + candidato);
    }

    public static boolean fazerLigacao() {
        return new Random().nextInt(3) == 1;
    }

    public static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
