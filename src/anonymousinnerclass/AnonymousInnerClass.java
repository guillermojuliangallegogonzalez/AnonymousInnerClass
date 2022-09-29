package anonymousinnerclass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author guillermogallegogonzalez
 * @version 1.0
 * Contacto: guillermojulian.gallegogonzalez@gmail.com
 */
public class AnonymousInnerClass extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //Clase importada
        Class inner = new Class();
        
        //Botones que al ser accionados harán uso de las respectivas funciones
        Button btn_new = new Button("Nuevo");
        btn_new.setOnAction((ActionEvent event) -> {
            inner.New();
        });
        
        Button btn_open = new Button("Abrir");
        btn_open.setOnAction((ActionEvent event) -> {
            inner.Open();
        });
        
        Button btn_save = new Button("Guardar");
        btn_save.setOnAction((ActionEvent event) -> {
            inner.Save();
        });
        
        Button btn_print = new Button("Imprimir");
        btn_print.setOnAction((ActionEvent event) -> {
            inner.Print();
        });
        
        //Contenedor de botones
        HBox hbox=new HBox(8);
        hbox.getChildren().add(btn_new);
        hbox.getChildren().add(btn_open);
        hbox.getChildren().add(btn_save);
        hbox.getChildren().add(btn_print);
        
        //Lienzo
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(hbox);
        
        //Escena
        Scene scene;        
        scene = new Scene(borderPane);
        primaryStage.setTitle("AnonymousHandlerDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
