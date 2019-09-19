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
       System.out.println("Digite o nome da primeira pessoa");
       p1.setNome(teclado.next());
       System.out.println("Digite as coordenadas");
       p1.setLocalizaçao(teclado.nextDouble(), teclado.nextDouble());
       
       System.out.println("Digite o nome da segunda pessoa");
       p2.setNome(teclado.next());
       System.out.println("Digite as coordenadas");
       p2.setLocalizaçao(teclado.nextDouble(), teclado.nextDouble());
       
       System.out.println("Digite o nome da terceira pessoa");
       p3.setNome(teclado.next());
       System.out.println("Digite as coordenadas");
       p3.setLocalizaçao(teclado.nextDouble(), teclado.nextDouble());
       
       double d1, d2;
       d1 = Math.min(Pessoa.distanciaEntreDuasPessoas(p1.getLocalizaçao(), p2.getLocalizaçao()), Pessoa.distanciaEntreDuasPessoas(p1.getLocalizaçao(), p3.getLocalizaçao()));
       d2 = Math.min(d1, Pessoa.distanciaEntreDuasPessoas(p2.getLocalizaçao(), p3.getLocalizaçao()));
       
       if(d2 == Pessoa.distanciaEntreDuasPessoas(p1.getLocalizaçao(), p2.getLocalizaçao()))
           return p1.getNome() + p2.getNome();
       else
           if(d2 == Pessoa.distanciaEntreDuasPessoas(p1.getLocalizaçao(), p3.getLocalizaçao()))
               return p1.getNome() + p3.getNome();
           else
               return p2.getNome() + p3.getNome();
                
       
       
       
       
   }
    
}
