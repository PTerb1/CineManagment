/*
 * Projeto de Gerenciamento de Cinema em Java
 * Programação Orientada a Objetos em Java
 * Faculdade Estacio de sá
 */


package model;

/**
 * Esta classe implementa a exceção para CPF.
 */
public class CpfException extends Exceptions {
    
    public CpfException(){
        super("Número de CPF inválido!");
    }
}
