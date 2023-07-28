module com.svbd.svbd {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires java.sql;
    requires org.hibernate.orm.core;
    requires jakarta.persistence;
    requires java.naming;

    opens com.svbd.svbd to javafx.fxml;
    opens com.svbd.svbd.controller to javafx.fxml;
    opens com.svbd.svbd.entity to org.hibernate.orm.core, javafx.base;

    exports com.svbd.svbd;
    exports com.svbd.svbd.settings;
    exports com.svbd.svbd.controller;
}