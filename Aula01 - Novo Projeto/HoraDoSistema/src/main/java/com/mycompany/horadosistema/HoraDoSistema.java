package com.mycompany.horadosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author santi
 */
public class HoraDoSistema {

    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("A hora do Sistema é " + relogio.toString());
             
        Locale local = Locale.getDefault();
        System.out.println("O  idioma do Sistema  é " +local.getDisplayLanguage());
        
        Toolkit resolucao = Toolkit.getDefaultToolkit();
        Dimension d= resolucao.getScreenSize();
        System.out.println("A  resolução do seu sistema é " + d.width +"X" + d.height);
        
    }
}
