module com.georgiancollege.week01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.georgiancollege.week01 to javafx.fxml;
    exports com.georgiancollege.week01;
}