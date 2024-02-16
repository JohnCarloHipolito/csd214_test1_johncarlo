module com.triosstudent.csd214_test1_johncarlo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.triosstudent.csd214_test1_johncarlo to javafx.fxml;
    exports com.triosstudent.csd214_test1_johncarlo;
}