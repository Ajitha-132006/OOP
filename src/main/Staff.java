package main;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Staff {

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Staff Menu");

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10));

        Button emergencyButton = new Button("Emergency Cases");
        emergencyButton.setOnAction(e -> {
            EmergencyPage emergencyPage = new EmergencyPage();
            emergencyPage.start(primaryStage);
        });

        Button viewAppointmentsButton = new Button("View Booked Appointments");
        viewAppointmentsButton.setOnAction(e -> {
            ViewAppointments viewAppointmentsPage = new ViewAppointments();
            viewAppointmentsPage.start(primaryStage);
        });

        Button maintainPatientDataButton = new Button("Maintain Patient Data");
        maintainPatientDataButton.setOnAction(e -> {
            MaintainPatientData maintainPatientDataPage = new MaintainPatientData();
            maintainPatientDataPage.start(primaryStage);
        });

        Button backButton = new Button("Back to Main Menu");
        backButton.setOnAction(e -> {
            Main mainMenu = new Main();
            mainMenu.start(primaryStage);
        });

        vbox.getChildren().addAll(emergencyButton, viewAppointmentsButton, maintainPatientDataButton, backButton);

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}