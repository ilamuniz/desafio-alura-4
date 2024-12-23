package principal;

public class Aplicacao {

    public static void main(String[] args) {
        ConsultaCep consultaCep = new ConsultaCep();
        Endereco novoEndereco = consultaCep.buscarEndereco("70083900");
        System.out.println(novoEndereco);
    }

}
