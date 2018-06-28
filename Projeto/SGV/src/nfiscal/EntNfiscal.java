/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nfiscal;

/**
 *
 * @author tassi
 */
public class EntNfiscal {
    private int numero;
    private Itens[] itens;
    private String cpf;
    private String Date;

    public EntNfiscal(int numero, Itens[] itens, String cpf, String Date) {
        this.numero = numero;
        this.itens = itens;
        this.cpf = cpf;
        this.Date = Date;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Itens[] getItens() {
        return itens;
    }

    public void setItens(Itens[] itens) {
        this.itens = itens;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
    
    
}
