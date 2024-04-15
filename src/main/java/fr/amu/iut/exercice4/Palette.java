package fr.amu.iut.exercice4;


import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Palette extends Application {

    private int nbVert = 0;
    private int nbRouge = 0;
    private int nbBleu = 0;

    private Button vert;
    private Button rouge;
    private Button bleu;

    private BorderPane root;
    private Label label;
    private Pane panneau;
    private HBox bas;
    private Label helloLabel;

    @Override
    public void start(Stage primaryStage) throws Exception {
       this.vert=new Button("vert");
       this.rouge=new Button("rouge");
       this.bleu=new Button("bleu");

       this.root=new BorderPane();
       this.label= new Label();
       this.panneau= new Pane();
       this.bas= new HBox();


       bas.setAlignment(Pos.CENTER);

       bas.getChildren().addAll(vert,rouge,bleu);
       root.setBottom(bas);
       root.setCenter(panneau);

       vert.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
           if (nbVert<2){
               nbVert+=1;
        }
           else panneau.setStyle("-fx-background-color: rgb(0,180,160);");
               label.setText("Vert choisi 3 fois");
               BorderPane.setAlignment(label,Pos.CENTER);
               root.setTop(label);
       });
        rouge.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            if (nbRouge<2){
                nbRouge+=1;
            }
            else panneau.setStyle("-fx-background-color: rgb(255,0,0);");
            label.setText("Rouge choisi 3 fois");
            BorderPane.setAlignment(label,Pos.CENTER);
            root.setTop(label);
        });

        bleu.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            if (nbBleu<2){
                nbBleu+=1;
            }
            else panneau.setStyle("-fx-background-color: rgb(0,0,255);");
            label.setText("Bleu choisi 3 fois");
            BorderPane.setAlignment(label,Pos.CENTER);
            root.setTop(label);
        });

       Scene scene =new Scene(root, 600,400);
       primaryStage.setScene(scene);
        primaryStage.show();
    }
}

