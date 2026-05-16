package entidades;

public class Endereco {

  private String rua;
  private String cidade;
  private String cep;

  // Construtores
  public Endereco(){

  }

  public Endereco(String rua, String cidade, String cep) {
    this.rua = rua;
    this.cidade = rua;
    this.cep = cep;
  }

  // Metódos getters e setters
  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

}