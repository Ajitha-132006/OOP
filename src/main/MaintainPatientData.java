package main;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MaintainPatientData {

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Maintain Patient Data");

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10));

        Button enterNewPatientButton = new Button("Enter New Patient");
        enterNewPatientButton.setOnAction(e -> {
            EnterNewPatient enterNewPatientPage = new EnterNewPatient();
            enterNewPatientPage.start(primaryStage);
        });

        Button viewDataButton = new Button("View Patient Data");
        viewDataButton.setOnAction(e -> {
            ViewData viewDataPage = new ViewData();
            viewDataPage.start(primaryStage);
        });

        Button backButton = new Button("Back to Staff Menu");
        backButton.setOnAction(e -> {
            Staff staffPage = new Staff();
            staffPage.start(primaryStage);
        });

        vbox.getChildren().addAll(enterNewPatientButton, viewDataButton, backButton);

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}