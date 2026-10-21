module ni.edu.uam.ejemploconcurrenciag3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.edu.uam.ejemploconcurrenciag3 to javafx.fxml;
    exports ni.edu.uam.ejemploconcurrenciag3;
}