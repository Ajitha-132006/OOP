package main;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EnterNewPatient {

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Enter New Patient");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(10);
        grid.setVgap(10);

        Label nameLabel = new Label("Name:");
        TextField nameInput = new TextField();

        Label ageLabel = new Label("Age:");
        TextField ageInput = new TextField();

        Label bedNoLabel = new Label("Bed No:");
        TextField bedNoInput = new TextField();

        Label sectorLabel = new Label("Sector:");
        ComboBox<String> sectorComboBox = new ComboBox<>();
        sectorComboBox.getItems().addAll("Neurology", "Cardiology", "Dentistry", "General", "Gastroenterology");

        Label doctorLabel = new Label("Doctor:");
        TextField doctorInput = new TextField();

        Label bloodTypeLabel = new Label("Blood Type:");
        TextField bloodTypeInput = new TextField();

        Label phoneNumberLabel = new Label("Phone Number:");
        TextField phoneNumberInput = new TextField();

        Label guardianNameLabel = new Label("Guardian Name:");
        TextField guardianNameInput = new TextField();

        Label guardianPhoneNumberLabel = new Label("Guardian Phone Number:");
        TextField guardianPhoneNumberInput = new TextField();

        Button saveButton = new Button("Save Patient");
        saveButton.setOnAction(e -> {
            // Logic to save patient details
            System.out.println("Patient Saved: " + nameInput.getText());
        });

        Button backButton = new Button("Back to Maintain Patient Data");
        backButton.setOnAction(e -> {
            MaintainPatientData maintainPatientDataPage = new MaintainPatientData();
            maintainPatientDataPage.start(primaryStage);
        });

        grid.addRow(0, nameLabel, nameInput);
        grid.addRow(1, ageLabel, ageInput);
        grid.addRow(2, bedNoLabel, bedNoInput);
        grid.addRow(3, sectorLabel, sectorComboBox);
        grid.addRow(4, doctorLabel, doctorInput);
        grid.addRow(5, bloodTypeLabel, bloodTypeInput);
        grid.addRow(6, phoneNumberLabel, phoneNumberInput);
        grid.addRow(7, guardianNameLabel, guardianNameInput);
        grid.addRow(8, guardianPhoneNumberLabel, guardianPhoneNumberInput);
        grid.add(saveButton, 0, 9);
        grid.add(backButton, 1, 9);

        Scene scene = new Scene(grid, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}