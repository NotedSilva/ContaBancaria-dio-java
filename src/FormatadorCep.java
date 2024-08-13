public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("11111111");
            System.out.println(cepFormatado);
        } catch (CepInvalidoExcpetion e) {
            System.out.println("O cep não corresponde com as regras.");
        }

    }
    static String formatarCep(String cep) throws CepInvalidoExcpetion {
        if (cep.length() != 8)
            throw new CepInvalidoExcpetion();

        return "11.111-111";
    }
}
