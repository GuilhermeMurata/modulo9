package br.com.murata;


public class Exercicio_mod9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroPrimitivo = scanner.nextInt();

        Integer numeroWrapper = Integer.valueOf(numeroPrimitivo);

        int valor = 5;
        Integer wrapper = Integer.valueOf(valor);
        System.out.println(wrapper);
    }
}