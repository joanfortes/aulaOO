/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1;

import java.util.Scanner;

/**
 *
 * @author ice
 */
public class LocalizePessoasMaisProximas {
    
   public static String pessoasMaisProximas(){
       Scanner teclado = new Scanner(System.in);
       Pessoa p1 = new Pessoa();
       Pessoa p2 = new Pessoa();
       Pessoa p3 = new Pessoa();
       Localizacao l1 = new Localizacao();
       Localizacao l2 = new Localizacao();
       Localizacao l3 = new Localizacao();
       
       System.out.println("Digite o nome da primeira pessoa");
       p1.setNome(teclado.next());
       System.out.println("Digite as coordenadas");
       l1.setX(teclado.nextDouble());
       l1.setY(teclado.nextDouble());
       p1.setLocalizacao(l1);
       
       System.out.println("Digite o nome da primeira pessoa");
       p1.setNome(teclado.next());
       System.out.println("Digite as coordenadas");
       l2.setX(teclado.nextDouble());
       l2.setY(teclado.nextDouble());
       p1.setLocalizacao(l2);
       
       System.out.println("Digite o nome da primeira pessoa");
       p1.setNome(teclado.next());
       System.out.println("Digite as coordenadas");
       l3.setX(teclado.nextDouble());
       l3.setY(teclado.nextDouble());
       p1.setLocalizacao(l3);
       
       
       
       double d1, d2;
       d1 = Math.min(Pessoa.distanciaEntreDuasPessoas(p1.getLocalizacao(), p2.getLocalizacao()), Pessoa.distanciaEntreDuasPessoas(p1.getLocalizacao(), p3.getLocalizacao()));
       d2 = Math.min(d1, Pessoa.distanciaEntreDuasPessoas(p2.getLocalizacao(), p3.getLocalizacao()));
       
       if(d2 == Pessoa.distanciaEntreDuasPessoas(p1.getLocalizacao(), p2.getLocalizacao()))
           return p1.getNome() + p2.getNome();
       else
           if(d2 == Pessoa.distanciaEntreDuasPessoas(p1.getLocalizacao(), p3.getLocalizacao()))
               return p1.getNome() + p3.getNome();
           else
               return p2.getNome() + p3.getNome();
                
       
       
       
       
   }
    
}
