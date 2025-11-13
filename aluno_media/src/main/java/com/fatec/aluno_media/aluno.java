/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.aluno_media;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author fatec-dsm2
 */
public class aluno {
    private String nome;
    ArrayList<String> media = new ArrayList<String>(3);
    int i;
    double pegarMedia;
    String situacao;
    
    public void inserirMedia(){
        for(i = 0; i < 3; i++){
            media.add(JOptionPane.showInputDialog(
                "Digite a nota TP"+(i+1)+":" 
            ));
            
        }
    }
    
    public void calcularMedia(){
        for(i = 0; i < 3; i++){
            pegarMedia += Double.parseDouble(media.get(i));
        }
       
        if(pegarMedia < 6){
            situacao = "REPROVADO";
        } else if((pegarMedia >= 6) && (pegarMedia <= 9)){
            situacao = "APROVADO";
        } else if(pegarMedia > 9){
            situacao = "OTIMO APROVEITAMENTO";
        } else {
            System.out.println("ERRO");
        }
        String calculo = "Sua media final e: " + pegarMedia/3 + " \n "+situacao;
        
        JOptionPane.showMessageDialog(
            null, 
            calculo,
            "Media Final",
            JOptionPane.INFORMATION_MESSAGE
        ); 
        
    }
}
