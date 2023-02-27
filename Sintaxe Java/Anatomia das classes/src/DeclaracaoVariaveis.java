public class DeclaracaoVariaveis {

    public static void main(String[] args){

        String primeiroNome = "Luiz";
        String segundoNome = "Henrique";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
