/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_classapp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Pc
 */
class Champs{
    
    private String nom;
    private String Type;
    private int Taille;
    private boolean isPrimary;
    private File path;

    public Champs() {
    }
    
    public Champs(String nom, String Type, int Taille, boolean isPrimary) throws IOException {
        this.nom = nom;
        this.Type = Type;
        this.Taille = Taille;
        this.isPrimary = isPrimary;
        //System.out.println(this.CreerChamps());
        
    }
    
    public boolean CreerChamps() throws IOException{
        File dir = new File(this.nom+".txt");
        //boolean isDirectory = dir.mkdir();
        System.out.println(dir);
        if(dir.isFile() == false){
            System.out.println(dir);
            boolean isFile = dir.createNewFile();
            return true;
        }
        return false; //création du fichier n'a pas aboutis
    }
    
    public boolean insert(String data) throws IOException{
        File fichier = new File(this.nom);
        try{
            FileWriter Ecriture = new FileWriter(fichier);
            try{
                Ecriture.write(data+"\n");
            }finally{
                Ecriture.close();
            }
        }catch(Exception e){
            System.out.println("Erreur d'écriture dans le fichier !");
        }
        return false;
    }
    
}
