/*
 * Projeto de Gerenciamento de Cinema em Java
 * Programação Orientada a Objetos em Java
 * Faculdade Estacio de sá
 */


package model;

/**
 * Esta classe descreve atributos e métodos necessários para manipular filmes no sistema. 
 */
public class Filme {

    private int codFilme; //apenas gerado no arquivo
    private String titulo;
    private String genero;
    private String sinopse;
    private String diretor;
    private int ano;
    private String clasIndicativa;
    private int duracao; //em minutos
    
    public Filme(int codFilme, String titulo, String genero, String sinopse, String diretor, int ano, String clasIndicativa, int duracao){
        this.codFilme = codFilme;
        this.titulo = titulo;
        this.genero = genero;
        this.sinopse = sinopse;
        this.diretor = diretor;
        this.ano = ano;
        this.clasIndicativa = clasIndicativa;
        this.duracao = duracao;
    }
    
    public Filme(String titulo, String genero, String sinopse, String diretor, int ano, String clasIndicativa, int duracao){
        this.titulo = titulo;
        this.genero = genero;
        this.sinopse = sinopse;
        this.diretor = diretor;
        this.ano = ano;
        this.clasIndicativa = clasIndicativa;
        this.duracao = duracao;
    }
    
    public Filme(){
    }
    
    /**
     * Obter código do filme.
     * @return codFilme
     */
    public int getCodFilme(){
        return codFilme;
    }
    
    /**
     * Definir código do filme.
     * @param codFilme 
     */
    public void setCodFilme(int codFilme){
        this.codFilme = codFilme;
    }
    
    /**
     * Obter título do filme.
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Definir título do filme.
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obter gênero do filme.
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Definir gênero do filme.
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Obter sinopse do filme.
     * @return the sinopse
     */
    public String getSinopse() {
        return sinopse;
    }

    /**
     * Definir sinopse do filme.
     * @param sinopse the sinopse to set
     */
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    /**
     * Obter diretor do filme.
     * @return the diretor
     */
    public String getDiretor() {
        return diretor;
    }

    /**
     * Definir diretor do filme.
     * @param diretor the diretor to set
     */
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    /**
     * Obter ano de lançamento do filme.
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * Definir ano de lançamento do filme.
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * Obter classificação indicativa do filme.
     * @return the clasIndicativa
     */
    public String getClasIndicativa() {
        return clasIndicativa;
    }

    /**
     * Definir classificação indicativa do filme.
     * @param clasIndicativa the clasIndicativa to set
     */
    public void setClasIndicativa(String clasIndicativa) {
        this.clasIndicativa = clasIndicativa;
    }

    /**
     * Obter duração do filme (em minutos).
     * @return the duracao
     */
    public int getDuracao() {
        return duracao;
    }

    /**
     * Definir duração do filme (em minutos).
     * @param duracao the duracao to set
     */
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }    
    
}
