package main;

import javafx.geometry.Insets;

import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.control.Label;

import javafx.scene.control.TextField;

import javafx.scene.layout.GridPane;

import javafx.stage.Stage;

public class PersonalInfo {
    private String name;

    private String age;

    private String gender;

    private String bloodType;

    private String medicalHistory;

    private String address;

    private String phoneNumber;

    private String aadharNumber;


    public void start(Stage primaryStage) {

        primaryStage.setTitle("Personal Info");


        GridPane grid = new GridPane();

        grid.setPadding(new Insets(10));

        grid.setHgap(10);

        grid.setVgap(10);


        Label nameLabel = new Label("Name:");

        TextField nameInput = new TextField(name);

        Label ageLabel = new Label("Age:");

        TextField ageInput = new TextField(age);

        Label genderLabel = new Label("Gender:");

        TextField genderInput = new TextField(gender);

        Label bloodLabel = new Label("Blood Type:");

        TextField bloodInput = new TextField(bloodType);

        Label historyLabel = new Label("Medical History:");

        TextField historyInput = new TextField(medicalHistory);

        Label addressLabel = new Label("Address:");

        TextField addressInput = new TextField(address);

        Label phoneLabel = new Label("Phone Number:");

        TextField phoneInput = new TextField(phoneNumber);

        Label aadharLabel = new Label("Aadhar Number:");

        TextField aadharInput = new TextField(aadharNumber);


        Button saveButton = new Button("Save");

        saveButton.setOnAction(e -> {

            // Save details to class variables

            name = nameInput.getText();

            age = ageInput.getText();

            gender = genderInput.getText();

            bloodType = bloodInput.getText();

            medicalHistory = historyInput.getText();

            address = addressInput.getText();

            phoneNumber = phoneInput.getText();

            aadharNumber = aadharInput.getText();

        });


        Button backButton = new Button("Back to Patient Menu");

        backButton.setOnAction(e -> {

            // Navigate back to Patient menu

            Patient patientPage = new Patient();

            patientPage.start(primaryStage);

        });


        // Layout

        grid.addRow(0, nameLabel, nameInput);

        grid.addRow(1, ageLabel, ageInput);

        grid.addRow(2, genderLabel, genderInput);

        grid.addRow(3, bloodLabel, bloodInput);

        grid.addRow(4, historyLabel, historyInput);

        grid.addRow(5, addressLabel, addressInput);

        grid.addRow(6, phoneLabel, phoneInput);

        grid.addRow(7, aadharLabel, aadharInput);

        grid.add(saveButton, 0, 8);

        grid.add(backButton, 1, 8);


        Scene scene = new Scene(grid, 400, 400);

        primaryStage.setScene(scene);

        primaryStage.show();

    }
}