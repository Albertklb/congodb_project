/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_classapp;

import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.DragEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 *
 * @author el-pro
 */
public class HomeController implements Initializable {
    BDD db = new BDD();
    String path = "F:\\BDD\\JavaFX_ClassApp\\test\\";
    Table table = new Table();
    @FXML
    private Pane zoneGestionTable;

    @FXML
    private ListView<?> liste_Table;

    @FXML
    private TextField Input_Nouvelle_Table;

    @FXML
    private ListView<?> listeDonneesChamps;

    @FXML
    private Text TextNomTable;
    
    @FXML
    private VBox zonneHome;
    
    @FXML
    private TextField nomBDD;
    
    @FXML
    private Text msgErreure;
    
    @FXML
    private StackPane zonneChamps;
    
    
    @FXML
    private TextField nom1;

    @FXML
    private TextField type1;

    @FXML
    private TextField Taille1;

    @FXML
    private  CheckBox Cle1;

    @FXML
    private TextField nom2;

    @FXML
    private TextField type2;

    @FXML
    private TextField Taille2;

    @FXML
    private  CheckBox Cle2;

    @FXML
    private TextField nom3;

    @FXML
    private TextField type3;

    @FXML
    private TextField Taille3;

    @FXML
    private  CheckBox Cle3;

    @FXML
    private TextField nom4;

    @FXML
    private TextField type4;

    @FXML
    private TextField Taille4;

    @FXML
    private  CheckBox Cle4;
    
    @FXML
    void ActonCreer(ActionEvent event) {
        //msgErreure.setText(nomBDD.getText());
        path+=nomBDD.getText();
        boolean isCreated = db.CreerBDD(path);
        if(isCreated == true){
            //msgErreure.setText("Je suis Jésus");
            zoneGestionTable.setVisible(true);
            zonneHome.setVisible(false);
        }else{
            msgErreure.setVisible(true);
        }
        
    }
    
    

    @FXML
    void ActionTaperREquete(ActionEvent event) {

    }
    
    @FXML
    void CreerNouvelleTable(ActionEvent event) {
        System.out.println(path);
        path+="\\"+Input_Nouvelle_Table.getText();
        if(table.CreerBDD(path)){
            System.out.println("Creéation de la table effectué avec succès !");
            zonneChamps.setVisible(true);
        }else{
            System.out.println("Erreur de creation de table !");
        }
    }
    
    @FXML
    void EnregistrerChamps(ActionEvent event) throws IOException {
        if(nom1.getText() != null ){
            String path1 = path+"\\"+nom1.getText();
            String path2 = path+"\\"+nom2.getText();
            String path3 = path+"\\"+nom3.getText();
            String path4 = path+"\\"+nom4.getText();
            Champs chmp1 = new Champs(path1,type1.getText(),parseInt(Taille1.getText()),Cle1.isSelected());
            chmp1.CreerChamps();
            Champs chmp2 = new Champs(path2,type2.getText(),parseInt(Taille2.getText()),Cle2.isSelected());
            chmp2.CreerChamps();
            Champs chmp3 = new Champs(path3,type3.getText(),parseInt(Taille3.getText()),Cle3.isSelected());
            chmp3.CreerChamps();
            Champs chmp4 = new Champs(path4,type4.getText(),parseInt(Taille4.getText()),Cle4.isSelected());
            chmp4.CreerChamps();
            zonneChamps.setVisible(false);
        }else{
            System.out.println("Erreur de création de champs");
        }
        System.out.println(path);
    }

    @FXML
    void InsererDansLaTable(ActionEvent event) {
        
    }

    @FXML
    void SuprimerTable(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
