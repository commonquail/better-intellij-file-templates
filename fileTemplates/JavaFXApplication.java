#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME};#end
#parse("File Header.java")

import javafx.application.Application;
import javafx.stage.Stage;

public final class ${NAME} extends Application {

    public static void main(final String[] args) {
        launch(args);
    }

    @Override
    public void start(final Stage primaryStage) {
    }
}
