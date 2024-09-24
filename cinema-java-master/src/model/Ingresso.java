/*
 * Projeto de Gerenciamento de Cinema em Java
 * Programação Orientada a Objetos em Java
 * Faculdade Estacio de sá
 */

package model;

/**
 * Esta classe descreve atributos e métodos necessários para manipular os ingressos
 * emitidos após a seleção de uma sessão.
 */
public class Ingresso {

    private String tipo;
    private double valor;
    private Sessao sessao;
    
    public Ingresso(String tipo, double valor, Sessao sessao){
        this.tipo = tipo;
        this.valor = valor;
        this.sessao = sessao;
    }
    
    /**
     * Obter tipo do ingresso.
     * @return tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Definir tipo do ingresso.
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obter valor do ingresso.
     * @return valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * Definir valor do ingresso.
     * @param valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Obter sessão correspondente ao ingresso.
     * @return sessao
     */
    public Sessao getSessao() {
        return sessao;
    }

    /**
     * Definir sessão que deverá corresponder ao ingresso.
     * @param sessao
     */
    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }   
    
}
