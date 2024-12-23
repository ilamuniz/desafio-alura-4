package principal;

public class Endereco {

    String logradouro;
    String complemento;
    String bairro;
    String cep;
    String localidade;
    String uf;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Endereço {" +
                "logradouro = '" + logradouro + '\'' +
                ", complemento = '" + complemento + '\'' +
                ", bairro = '" + bairro + '\'' +
                ", cep = '" + cep + '\'' +
                ", localidade = '" + localidade + '\'' +
                ", uf = '" + uf + '\'' +
                '}';
    }
}
