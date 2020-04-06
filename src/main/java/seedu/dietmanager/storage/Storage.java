package seedu.dietmanager.storage;

import seedu.dietmanager.commons.core.LogsCentre;
import seedu.dietmanager.model.FoodNutritionRecord;
import seedu.dietmanager.model.Profile;
import seedu.dietmanager.ui.UI;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Storage is the public class responsible for creating and managing the data files generated from the application.
 */

public class Storage {

    /**
     * The object containing the list containing all current tasks.
     */

    private UI ui;

    private LogsCentre logsCentre;

    private Profile profile;

    private FoodNutritionRecord foodNutritionRecord;

    /**
     * The file path of the directory that contains the data file.
     */

    private static String DATA_DIRECTORY_PATH = "data";

    /**
     * The file path of the data file that contains profile information.
     */

    private static String PROFILE_FILE_PATH = DATA_DIRECTORY_PATH + File.separator + "profile.txt";

    /**
     * The file path of the data file that contains food record information.
     */

    private static String DAILY_FOOD_RECORD_FILE_PATH = DATA_DIRECTORY_PATH + File.separator + "daily-food-record.txt";

    /** To be implemented at a later stage.
     * The file path of the data file that contains food nutritional information.
     */
    
    private static String FOOD_NUTRITION_RECORD_FILE_PATH = DATA_DIRECTORY_PATH + File.separator + "food-nutrition-record.txt";

    /**
     * Constructs the Storage object.
     *
     * @param ui the object containing user interface functions.
     */

    public Storage(UI ui, LogsCentre logsCentre, Profile profile, FoodNutritionRecord foodNutritionRecord) {
        this.ui = ui;
        this.logsCentre = logsCentre;
        this.profile = profile;
        this.foodNutritionRecord = foodNutritionRecord;
        this.loadDataDirectory();
        this.loadProfileFile();
        //this.loadFoodRecordFile();
    }

    /**
     * Searches for the directory, if absent, creates a new directory.
     */

    public void loadDataDirectory() {
        Path directoryPath = Paths.get(DATA_DIRECTORY_PATH);
        if (!Files.exists(directoryPath)) {
            try {
                Files.createDirectory(directoryPath);
                logsCentre.writeInfoLog("New Directory created: " + directoryPath.getFileName().toString());
            } catch (IOException e) {
                logsCentre.writeSevereLog("Error in creating new directory");
                ui.displayFileErrorMessage();
            }
        } else {
            logsCentre.writeInfoLog("Existing Directory found: " + directoryPath.getFileName().toString());
        }
    }

    /**
     * Searches for the data file in the directory, if absent, creates a new data file. <br>
     * If data file is present, loads the existing data from the file such that it is accessible by the user.
     */

    public void loadProfileFile() {
        try {
            File profileData = new File(PROFILE_FILE_PATH);
            if (profileData.createNewFile()) {
                logsCentre.writeInfoLog("No existing Profile found, new file created: "
                        + profileData.getName().toString());
            } else {
                this.readProfileFile();
                logsCentre.writeInfoLog("Existing Profile found: "
                        + profileData.getName().toString());
            }
        } catch (IOException e) {
            logsCentre.writeSevereLog("Error in Profile data file");
            ui.displayFileErrorMessage();
        }
    }

    /**
     * Reads the data file and parses the existing data in the file, converting it into tasks which is added into
     * the tasklist such that it is accessible by the user.
     */

    public void readProfileFile() {
        try {
            File dukeData = new File(PROFILE_FILE_PATH);
            Scanner myReader = new Scanner(dukeData);
            while (myReader.hasNextLine()) {
                String dataLine = myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            ui.displayFileErrorMessage();
        }
    }

    /**
     * Clears all content in the data file.
     */

    public void clearProfileFile() {
        try {
            PrintWriter pw = new PrintWriter(PROFILE_FILE_PATH);
            pw.close();
        } catch (FileNotFoundException e) {
            ui.displayFileErrorMessage();
        }
    }

    /**
     * Rewrites the data file to reflect the current data.
     */

    public void rewriteProfileFile() {
        try {
            FileWriter myWriter = new FileWriter(PROFILE_FILE_PATH, false);
            myWriter.write("");
            myWriter.close();
        } catch (IOException e) {
            ui.displayFileErrorMessage();
        }
    }

    /**
     * Appends a new line of data into the data file.
     */

    public void writeProfileFileLine() {
        try {
            BufferedWriter myWriter = new BufferedWriter(new FileWriter(PROFILE_FILE_PATH, true));
            myWriter.write("");
            myWriter.close();
        } catch (IOException e) {
            ui.displayFileErrorMessage();
        }
    }

}
