package main;

import javafx.geometry.Insets;

import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.control.ComboBox;

import javafx.scene.control.DatePicker;

import javafx.scene.control.Label;

import javafx.scene.layout.GridPane;

import javafx.stage.Stage;

public class BookAppointment {
    private String selectedDate;

    private String selectedTime;

    private String selectedSector;



    public void start(Stage primaryStage) {

        primaryStage.setTitle("Book Appointment");



        GridPane grid = new GridPane();

        grid.setPadding(new Insets(10));

        grid.setHgap(10);

        grid.setVgap(10);



        Label dateLabel = new Label("Select Date:");

        DatePicker datePicker = new DatePicker();

        datePicker.setOnAction(e -> selectedDate = datePicker.getValue().toString());



        Label timeLabel = new Label("Select Time:");

        ComboBox<String> timeComboBox = new ComboBox<>();

        timeComboBox.getItems().addAll("9am-12pm", "12pm-2pm", "2pm-5pm");

        timeComboBox.setValue(selectedTime);

        timeComboBox.setOnAction(e -> selectedTime = timeComboBox.getValue());



        Label sectorLabel = new Label("Select Sector:");

        ComboBox<String> sectorComboBox = new ComboBox<>();

        sectorComboBox.getItems().addAll("Neurology", "Cardiology", "Dentistry", "General", "Gastroenterology");

        sectorComboBox.setValue(selectedSector);

        sectorComboBox.setOnAction(e -> selectedSector = sectorComboBox.getValue());



        Button bookButton = new Button("Book Appointment");

        bookButton.setOnAction(e -> {

            // Logic to fetch available doctors

            AppointmentBooking appointmentBooking = new AppointmentBooking();

            String[] availableDoctors = appointmentBooking.getAvailableDoctors(selectedTime, selectedSector);



            // Display available doctors (can use alert or display on UI)

            System.out.println("Available doctors: ");

            for (String doc : availableDoctors) {

                System.out.println(doc);

            }

        });



        Button backButton = new Button("Back to Patient Menu");

        backButton.setOnAction(e -> {

            // Navigate back to Patient menu

            Patient patientPage = new Patient();

            patientPage.start(primaryStage);

        });



        // Layout

        grid.addRow(0, dateLabel, datePicker);

        grid.addRow(1, timeLabel, timeComboBox);

        grid.addRow(2, sectorLabel, sectorComboBox);

        grid.add(bookButton, 0, 3);

        grid.add(backButton, 1, 3);



        Scene scene = new Scene(grid, 400, 300);

        primaryStage.setScene(scene);

        primaryStage.show();

    }
}