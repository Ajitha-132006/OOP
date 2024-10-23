package main;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ViewAppointments {

    public void start(Stage primaryStage) {
        primaryStage.setTitle("View Booked Appointments");

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10));

        Label dateLabel = new Label("Select Date:");
        DatePicker datePicker = new DatePicker();

        Button viewButton = new Button("View Appointments");
        viewButton.setOnAction(e -> {
            // Logic to fetch appointments for the selected date
            System.out.println("Appointments for " + datePicker.getValue());
        });

        Button backButton = new Button("Back to Staff Menu");
        backButton.setOnAction(e -> {
            Staff staffPage = new Staff();
            staffPage.start(primaryStage);
        });

        vbox.getChildren().addAll(dateLabel, datePicker, viewButton, backButton);

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}