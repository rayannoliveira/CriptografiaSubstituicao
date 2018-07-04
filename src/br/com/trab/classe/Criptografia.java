/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trab.classe;

/**
 *
 * @author dell1
 */
public class Criptografia {
    private int id;
    private String letra;
    private  String traducao;
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the letra
     */
    public String getLetra() {
        return letra;
    }

    /**
     * @param letra the letra to set
     */
    public void setLetra(String letra) {
        this.letra = letra;
    }

    /**
     * @return the traducao
     */
    public String getTraducao() {
        return traducao;
    }

    /**
     * @param traducao the traducao to set
     */
    public void setTraducao(String traducao) {
        this.traducao = traducao;
    }
    
}
