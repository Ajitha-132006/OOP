package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hospital Management System");

        Button patientButton = new Button("Patient");
        patientButton.setOnAction(e -> new Patient().start(primaryStage));

        Button staffButton = new Button("Staff");
        staffButton.setOnAction(e -> new Staff().start(primaryStage));

        Button doctorButton = new Button("Doctor");
        doctorButton.setOnAction(e -> System.out.println("Doctor page"));

        VBox layout = new VBox(10);
        layout.getChildren().addAll(patientButton, staffButton, doctorButton);

        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}