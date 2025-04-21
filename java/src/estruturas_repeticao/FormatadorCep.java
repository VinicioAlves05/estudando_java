package estruturas_repeticao;

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765864");
            System.out.println(cepFormatado);
        } catch (CepInvalidoExeception e) {
            System.out.println("O cep não corresponde com as regras de negócio");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoExeception{
        if(cep.length() != 8)
          throw new CepInvalidoExeception();

        //Simulando um cep formatado
        return "23.765-864";

    }
}
