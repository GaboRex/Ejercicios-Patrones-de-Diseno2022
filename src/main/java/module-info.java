module com.example.ejerciciospatronesdediseno {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejerciciospatronesdediseno2022 to javafx.fxml;
    exports com.example.ejerciciospatronesdediseno2022;
}