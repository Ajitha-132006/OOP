package main;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ViewData {

    public void start(Stage primaryStage) {
        primaryStage.setTitle("View Patient Data");

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10));

        Label patientDataLabel = new Label("Patient Data:");
        // Logic to fetch and display patient data
        Label patientData = new Label("Patient 1: John Doe, 30, Neurology, Dr. Smith, A+, 1234567890, Jane Doe, 9876543210");

        vbox.getChildren().addAll(patientDataLabel, patientData);

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}