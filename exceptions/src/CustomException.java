public class CustomException {
    public static void main(String[] args) {
        String cep;

        try {
            cep = formatarCep("21645522d");
            System.out.println(cep);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }

        return cep;
    }
}
