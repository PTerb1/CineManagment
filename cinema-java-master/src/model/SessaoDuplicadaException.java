/*
 * Projeto de Gerenciamento de Cinema em Java
 * Programação Orientada a Objetos em Java
 * Faculdade Estacio de sá
 */

package model;

/**
 * Esta classe implementa a exceção para Sessões já cadastradas (indisponíveis)
 * no sistema.
 */
public class SessaoDuplicadaException extends Exceptions {
    
    public SessaoDuplicadaException(){
        super("Sessão já cadastrada!");
    }
    
}
