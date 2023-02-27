public class tipos_variaveis {
    public static void main(String[] args){
        int anoNascimento;
        int anoFabricacao = 2021;
        double salarioMinimo = 2500;
        byte idade = 123;
        short ano = 2021;
        int cep = 53080075;
        long cpf = 12309856790L;
        float pi = 3.14F;
        double salario = 1275.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 1;
        numero = 2;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
        // VALOR_DE_PI = 10.75; --> erro
}
