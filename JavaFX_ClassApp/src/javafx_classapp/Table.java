    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_classapp;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pc
 */
class Table extends BDD{
    
    ArrayList<Champs> listeDeChamps = new ArrayList<Champs>();
    private String nomPath;

    public Table() {
        
    }
    
    public boolean CreerTABLE(String nomTABLE){
        nomPath = nomTABLE;
        File dir = new File(nomTABLE);
        //boolean isDirectory = dir.mkdir();
        
        if(dir.isDirectory() == false){
            boolean isDirectory = dir.mkdir();
            return isDirectory;
        }
        
        return false; //création du fichier n'a pas aboutis
    }
    
    
    public File OuvrirTABLE(String nomTABLE){
        File dir  = new File(nomTABLE);
        return dir;
    }
    
    public boolean suprimerTABLE(String nomTABLE){
        File dir = new File(nomTABLE);
        if(dir.exists()){
            dir.delete();
            return true;
        }
        return false;
    }
    
    public boolean RenomerTABLE(String nomTABLE,String RenameDir){
        File dir = new File(nomTABLE);
        File dirRename = new File(RenameDir);
        if(dir.isDirectory()){
            dir.renameTo(dirRename);
            return true;
        }
        return false;
    }
    
    public boolean AddChamps(Champs newChamps){
        listeDeChamps.add(newChamps);
        return false;
    }
    
    public int NombreChamps(){
        return listeDeChamps.size();
    }

    public String getNomPath() {
        return nomPath;
    }
    
    
}
