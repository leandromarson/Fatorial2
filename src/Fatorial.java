/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Killer
 */
public class Fatorial {
    
    public int fatorial(int x){
        if(x==1){
            return x;
        }else{
            return x*fatorial(x-1);
        }
        
    }
    public String mostrar(int num){
        String contagem = "";
        int nn = num;
        int contador = 0;
        while(contador<num){
                if(nn==1){
                  contagem += nn+"=";  
                }else{
                contagem += nn + "X";
                }
                nn--;
                contador++;
            
        }
        return contagem;
    }
    
}
