package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFx extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button botaoA = new Button("A");
        Button botaoB = new Button("B");
        Button botaoC = new Button("C");

        botaoA.setOnAction(e -> System.out.println("Botao A"));
        botaoB.setOnAction(e -> System.out.println("Botao B"));
        botaoC.setOnAction(e -> System.exit(0));

        VBox box = new VBox(10);
        box.setAlignment(Pos.CENTER);
        box.getChildren().addAll(botaoA, botaoB, botaoC);

        Scene unicaCena = new Scene(box, 200, 400);

        primaryStage.setScene(unicaCena);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
