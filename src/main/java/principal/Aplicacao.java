package principal;

import java.io.IOException;
import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();
        System.out.println("Digite um CEP válido: ");
        var cep = leitor.nextLine();
        try {
            Endereco novoEndereco = consultaCep.buscarEndereco(cep);
            System.out.println(novoEndereco);
            GeradorJson gerador = new GeradorJson();
            gerador.geraJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
