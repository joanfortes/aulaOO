/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1;

/**
 *
 * @author ice
 */
public class Pessoa {
    private String nome;
    private Localizaçao localizaçao;
    
    public static double distanciaEntreDuasPessoas(Localizaçao l1, Localizaçao l2){
        return Math.sqrt(Math.pow(l2.getX()-l1.getX(), 2) + Math.pow(l2.getY()-l1.getY(), 2));
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Localizaçao getLocalizaçao() {
        return localizaçao;
    }

    public void setLocalizaçao(double x, double y) {
        localizaçao.setX(x);
        localizaçao.setY(y);
        
    }
    
}
