package main;

import javafx.geometry.Insets;

import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.control.Label;

import javafx.scene.layout.GridPane;

import javafx.stage.Stage;

public class DoctorSchedule {
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Doctor Schedule");



        GridPane grid = new GridPane();

        grid.setPadding(new Insets(10));

        grid.setHgap(10);

        grid.setVgap(10);



        // Example of doctor schedules

        Label doctor1 = new Label("Dr. Smith (Cardiology): 9am - 12pm");

        Label doctor2 = new Label("Dr. Johnson (Neurology): 12pm - 3pm");

        Label doctor3 = new Label("Dr. Williams (Dentistry): 3pm - 6pm");



        Button backButton = new Button("Back to Patient Menu");

        backButton.setOnAction(e -> {

            // Navigate back to Patient menu

            Patient patientPage = new Patient();

            patientPage.start(primaryStage);

        });



        grid.add(doctor1, 0, 0);

        grid.add(doctor2, 0, 1);

        grid.add(doctor3, 0, 2);

        grid.add(backButton, 0, 3);



        Scene scene = new Scene(grid, 400, 300);

        primaryStage.setScene(scene);

        primaryStage.show();

    }
}