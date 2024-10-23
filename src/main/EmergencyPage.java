package main;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EmergencyPage {

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Emergency Cases");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(10);
        grid.setVgap(10);

        Label codeLabel = new Label("Code (Red/Blue/Green):");
        TextField codeInput = new TextField();

        Label bloodTypeLabel = new Label("Blood Type:");
        TextField bloodTypeInput = new TextField();

        Label causeLabel = new Label("Cause:");
        TextField causeInput = new TextField();

        Label sectorLabel = new Label("Related Sector:");
        ComboBox<String> sectorComboBox = new ComboBox<>();
        sectorComboBox.getItems().addAll("Neurology", "Cardiology", "Dentistry", "General", "Gastroenterology");

        Button saveButton = new Button("Save Emergency Case");
        saveButton.setOnAction(e -> {
            // Logic to save emergency case
            System.out.println("Emergency Case Saved: " + codeInput.getText() + ", " + bloodTypeInput.getText());
        });

        Button backButton = new Button("Back to Staff Menu");
        backButton.setOnAction(e -> {
            Staff staffPage = new Staff();
            staffPage.start(primaryStage);
        });

        grid.addRow(0, codeLabel, codeInput);
        grid.addRow(1, bloodTypeLabel, bloodTypeInput);
        grid.addRow(2, causeLabel, causeInput);
        grid.addRow(3 , sectorLabel, sectorComboBox);
        grid.add(saveButton, 0, 4);
        grid.add(backButton, 1, 4);

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}