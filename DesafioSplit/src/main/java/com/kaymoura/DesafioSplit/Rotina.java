/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kaymoura.DesafioSplit;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author devsys-b
 */
public class Rotina {
    public static void main(String[] args) {
        String li = "Maiara;Redes de Computadores;2019;SENAI";
        Aluno a1 = separaString(li);
        System.out.println(a1.toString());
    }
    public static Aluno separaString(String texto){
        texto = texto + ";"; // Preparar string
        List<String> arrayCampos = new ArrayList();
        String aux = "";
        
        for(int i=0; i<=texto.length(); i++){
            if (texto.charAt(i) == ';') {
                // Atribuir valor a array String
                arrayCampos.add(aux);
                
                // zerar auxiliar
                aux = "";
                
            } else {
                aux = aux + texto.charAt(i);
                
            }    
        }
        // Exibição do vetor - somente para teste.
        for (String t : arrayCampos) {
            System.out.println(t);
        }
        
        Aluno alunoTemp = new Aluno();
        alunoTemp.setNome(arrayCampos.get(0));
        alunoTemp.setCurso(arrayCampos.get(1));
        alunoTemp.setAnoConclusao(arrayCampos.get(2));
        alunoTemp.setInstituicao(arrayCampos.get(3));
        
        return alunoTemp;
    }
}
