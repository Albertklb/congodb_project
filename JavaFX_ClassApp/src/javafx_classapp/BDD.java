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
public class BDD {
    private String nomBdd;
    ArrayList<Table> listeDeTable;
    
    
    public boolean CreerBDD(String nomBDD){
        File dir = new File(nomBDD);
        //boolean isDirectory = dir.mkdir();
        
        if(dir.isDirectory() == false){
            boolean isDirectory = dir.mkdir();
            return isDirectory;
        }
        
        return false; //création du fichier n'a pas aboutis
    }
    
    public File OuvrirBDD(String nomBDD){
        File dir  = new File(nomBDD);
        return dir;
    }
    
    public boolean suprimerBDD(String nomBDD){
        File dir = new File(nomBDD);
        if(dir.exists()){
            dir.delete();
            return true;
        }
        return false;
    }
    
    public boolean RenomerBDD(String nomBDD,String RenameDir){
        File dir = new File(nomBDD);
        File dirRename = new File(RenameDir);
        if(dir.isDirectory()){
            dir.renameTo(dirRename);
            return true;
        }
        return false;
    }
    
    public boolean AddTable(Table newTable){
        listeDeTable.add(newTable);
        return false;
    }
    
    public int NombreTable(){ 
        return listeDeTable.size();
    }

    public String getNomBdd() {
        return nomBdd;
    }

    public ArrayList<Table> getListeDeTable() {
        return listeDeTable;
    }

    public void setNomBdd(String nomBdd) {
        this.nomBdd = nomBdd;
    }

    public void setListeDeTable(ArrayList<Table> listeDeTable) {
        this.listeDeTable = listeDeTable;
    }
}
