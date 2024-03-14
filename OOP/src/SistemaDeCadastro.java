public class SistemaDeCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos", "123.456.789-0");

        marcos.setEndereco("Rua Das Marias");

        System.out.println(marcos.getNome() + ", " + marcos.getCpf());
    }
}
