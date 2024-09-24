/*
 * Projeto de Gerenciamento de Cinema em Java
 * Programação Orientada a Objetos em Java
 * Faculdade Estacio de sá
 */

package model;

/**
 * Esta classe implementa a exceção para filmes já cadastrados no sistema.
 */
public class FilmeDuplicadoException extends Exceptions {
    
    public FilmeDuplicadoException(){
        super("Filme já cadastrado!");
    }
    
}
