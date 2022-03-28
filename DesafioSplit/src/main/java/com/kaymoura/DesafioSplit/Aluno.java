/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kaymoura.DesafioSplit;

/**
 *
 * @author devsys-b
 */
public class Aluno {
    private String nome;
    private String curso;
    private int anoConclusao;
    private String instituicao;
    
    
    public Aluno() {
    
    }
            
    public Aluno(String nome, String curso, int anoConclusao, String instituicao){
        this.nome=nome;
        this.curso=curso;
        this.anoConclusao=anoConclusao;
        this.instituicao=instituicao;
    }
    // tendo atributos
    // bottao direito - insert code - getter and setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(int anoConclusao) {
        this.anoConclusao = anoConclusao;
    }
    
    public void setAnoConclusao(String ano) {
        this.anoConclusao = Integer.parseInt(ano);
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
    
    public String toString() {
        
        return String.format("Nome: %s\nCurso: %s\nAno:%d\nInstituição: %s\n\n", 
                   this.nome,
                   this.curso,
                   this.anoConclusao,
                   this.instituicao);
        
    }       
}
