/*
 * Projeto de Gerenciamento de Cinema em Java
 * Programação Orientada a Objetos em Java
 * Faculdade Estacio de sá
 */


package model;

/**
 * Esta classe implementa a exceção para gestores já cadastrados no sistema.
 */
public class GestorDuplicadoException extends Exceptions {
    public GestorDuplicadoException(){
        super("Gestor já cadastrado!");
    }
}
