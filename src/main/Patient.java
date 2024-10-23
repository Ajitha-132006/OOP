package main;

import javafx.geometry.Insets;

import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.layout.VBox;

import javafx.stage.Stage;

public class Patient {
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Patient Menu");


        VBox vbox = new VBox(10);

        vbox.setPadding(new Insets(10));


        Button personalInfoButton = new Button("Personal Info");

        personalInfoButton.setOnAction(e -> {

            // Navigate to Personal Info Page

            PersonalInfo personalInfoPage = new PersonalInfo();

            personalInfoPage.start(primaryStage);

        });


        Button bookAppointmentButton = new Button("Book Appointment");

        bookAppointmentButton.setOnAction(e -> {

            // Navigate to Book Appointment Page

            BookAppointment bookAppointmentPage = new BookAppointment();

            bookAppointmentPage.start(primaryStage);

        });


        Button viewScheduleButton = new Button("View Doctor Schedule");

        viewScheduleButton.setOnAction(e -> {

            // Navigate to Doctor Schedule Page

            DoctorSchedule doctorSchedulePage = new DoctorSchedule();

            doctorSchedulePage.start(primaryStage);

        });


        Button backButton = new Button("Back to Main Menu");

        backButton.setOnAction(e -> {

            // Navigate back to the Main Menu

            Main mainMenu = new Main();

            mainMenu.start(primaryStage);

        });


        vbox.getChildren().addAll(personalInfoButton, bookAppointmentButton, viewScheduleButton, backButton);


        Scene scene = new Scene(vbox, 300, 200);

        primaryStage.setScene(scene);

        primaryStage.show();

    }
}