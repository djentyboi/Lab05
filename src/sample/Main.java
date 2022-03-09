package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.xml.crypto.Data;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        //Student ID Column
        TableColumn<StudentRecord, String> studentIDColumn = new TableColumn<>("SID");
        studentIDColumn.setMinWidth(100);
        studentIDColumn.setCellValueFactory(new PropertyValueFactory<>("studentID"));

        //Assignments Column
        TableColumn<StudentRecord, Float> assignmentsColumn = new TableColumn<>("Assignments");
        assignmentsColumn.setMinWidth(100);
        assignmentsColumn.setCellValueFactory(new PropertyValueFactory<>("assignments"));

        //Midterm Column
        TableColumn<StudentRecord, Float> midtermColumn = new TableColumn<>("Midterm");
        midtermColumn.setMinWidth(100);
        midtermColumn.setCellValueFactory(new PropertyValueFactory<>("midterm"));

        //Final Exam Column
        TableColumn<StudentRecord, Float> finalExamColumn = new TableColumn<>("Final Exam");
        finalExamColumn.setMinWidth(100);
        finalExamColumn.setCellValueFactory(new PropertyValueFactory<>("finalExam"));

        //Final Mark Column
        TableColumn<StudentRecord, Float> finalMarkColumn = new TableColumn<>("Final Mark");
        finalMarkColumn.setMinWidth(100);
        finalMarkColumn.setCellValueFactory(new PropertyValueFactory<>("finalMark"));

        //Letter Grade Column
        TableColumn<StudentRecord, Float> letterGradeColumn = new TableColumn<>("Letter Grade");
        letterGradeColumn.setMinWidth(100);
        letterGradeColumn.setCellValueFactory(new PropertyValueFactory<>("letterGrade"));

        table = new TableView<>();
        table.setItems(DataSource.getAllMarks());
        table.getColumns().addAll(studentIDColumn, midtermColumn, assignmentsColumn, finalExamColumn, finalMarkColumn, letterGradeColumn);

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Lab 05 Solution");
        primaryStage.setScene(new Scene(table));
        primaryStage.show();
    }

    TableView<StudentRecord> table;

    public static void main(String[] args) {
        launch(args);
    }
}
