/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;

/**
 *
 * @author ivanf
 */
public class GestionCuerpoDeAgua {
    
    ArrayList<CuerpoDeAgua> cuerpo = new ArrayList<>();
    
    public void addCuerpo(CuerpoDeAgua x){
        cuerpo.add(x);
    }
    
    public String listado(){
        String lis="";
        for (int i = 0; i < cuerpo.size(); i++) {
            CuerpoDeAgua get = cuerpo.get(i);
            lis+= i + get.toString()+"\n";
        }
        return lis;
    }
    
    public String hallarNivel(){
        String nivel = "";
        for (int i = 0; i < cuerpo.size(); i++) {
          CuerpoDeAgua get = cuerpo.get(i);
          nivel += get.nivel()+"\n";
      }
        return nivel;
    }
    
    public int contarMediosInferior(){
        int c = 0;
        for (int i = 0; i < cuerpo.size(); i++) {
            CuerpoDeAgua get = cuerpo.get(i);
            if(get.nivel().equals("MEDIO") || get.nivel().equals("BAJO") || get.nivel().equals("SIN RIESGO")){
                c++;
            }
        }
        return c;
    }
    
    public String cuerposMedios(){
        String medio = "";
        boolean validacion = true;
        for (int i = 0; i < cuerpo.size(); i++) {
            CuerpoDeAgua get = cuerpo.get(i);
            if(get.nivel().equals("MEDIO")){
                medio += get.getNombre()+" ";
            }else{
                validacion = false;
            }
        }
        
        if(validacion){
            medio = "NA";
        }
        
        return medio;
    }
    
    public String ircaBajo(){
        String identicador = "";
        for (int i = 0; i < cuerpo.size(); i++) {
            CuerpoDeAgua get = cuerpo.get(i);
            if(get.getIrca() == menor()){
                identicador = get.getNombre()+" "+get.getIdCuerpoDeAgua();
            }
        }
        return identicador;
    }
    
    private float menor(){
        float menor = 99999999;
        for (int i = 0; i < cuerpo.size(); i++) {
            CuerpoDeAgua get = cuerpo.get(i);
            if(get.getIrca() < menor){
                menor = get.getIrca();
            }
        }
        return menor;
    } 
    
    
      

    
}
