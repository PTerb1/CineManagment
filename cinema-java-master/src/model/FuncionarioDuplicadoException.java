/*
 * Projeto de Gerenciamento de Cinema em Java
 * Programação Orientada a Objetos em Java
 * Faculdade Estacio de sá
 */


package model;

/**
 * Esta classe implementa a exceção para funcionários já cadastrados no sistema.
 */
public class FuncionarioDuplicadoException extends Exceptions {
    
    public FuncionarioDuplicadoException(){
        super("Funcionário já cadastrado!");
    }
    
}
