package fileExplorer;

public class Controller {

    private Model model;

    private final String DEFAULT_DIR = System.getProperty("user.home");

    public Controller(Model model) {
        this.model = model;
    }

    public void selectNextFile() {
        model.selectNextFile();
    }

    public void selectPreviousFile() {
        model.selectPreviousFile();
    }

    public void startingLoadFiles() {
        model.loadFiles(DEFAULT_DIR);
    }

    public void goToSelectedDir() {
        model.goToSelectedDir();
    }

    public void goToParentDir() {
        model.goToParentDir();
    }
}
