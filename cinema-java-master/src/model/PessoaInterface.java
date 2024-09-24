/*
 * Projeto de Gerenciamento de Cinema em Java
 * Programação Orientada a Objetos em Java
 * Faculdade Estacio de sá
 */

package model;

/**
 * Interface para classe pessoa.
 */
public interface PessoaInterface {
    public String getNome();
    public void setNome(String nome);
    public String getRg();
    public void setRg(String rg);
    public String getCpf();
    public void setCpf(String cpf);
    public String getEndereco();
    public void setEndereco(String endereco);
    public String getTelefone();
    public void setTelefone(String telefone);
    public String getDataNasc();
    public void setDataNasc(String diaNascimento);
    public String getSalario();
    public void setSalario(String salario);    
}
