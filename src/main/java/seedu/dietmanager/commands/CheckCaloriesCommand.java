package seedu.dietmanager.commands;

import seedu.dietmanager.DailyFoodRecord;
import seedu.dietmanager.Profile;
import seedu.dietmanager.exceptions.InvalidFormatException;
import seedu.dietmanager.parser.Parser;
import seedu.dietmanager.ui.MessageBank;
import seedu.dietmanager.ui.UI;

public class CheckCaloriesCommand extends Command {
    private static final int ARGUMENTS_REQUIRED = 2;
    private String date;
    private String activityLevel;
    private double caloriesRequired;
    boolean isValidCommand = true;


    public CheckCaloriesCommand(String command, String description) throws InvalidFormatException {
        super(command);
        String[] descriptionArray = Parser.parseDescription(description, ARGUMENTS_REQUIRED);
        this.date = descriptionArray[0];
        this.activityLevel = descriptionArray[2];
    }

    @Override
    public void execute(Profile profile, UI ui) {
        double BMR;
        switch (profile.getGender()) {
        case "Male":
            BMR = 10 * profile.getWeight() + 6.25 * profile.getHeight() - 5 * profile.getAge() + 5;
            break;
        case "Female":
            BMR = 10 * profile.getWeight() + 6.25 * profile.getHeight() - 5 * profile.getAge() - 161;
            break;
        default:
            BMR = 0;
            isValidCommand = false;
        }
        switch (activityLevel) {
        case "low":
            this.caloriesRequired = BMR * 1.375;
            break;
        case "moderate":
            this.caloriesRequired = BMR * 1.55;
            break;
        case "high":
            this.caloriesRequired = BMR * 1.725;
            break;
        default:
            isValidCommand = false;
        }
        saveResult(profile);
    }

    @Override
    public void saveResult(Profile profile) {
        DailyFoodRecord record = profile.getRecordOfDay(date);
        if (isValidCommand) {
            this.result = String.format("Calories for %s:",date) + System.lineSeparator()
                    + record.showDailyCalories("breakfast") + record.showDailyCalories("lunch")
                    + record.showDailyCalories("dinner") + record.showDailyCalories();
        } else {
            this.result = MessageBank.INVALID_CALORIES_REQUIREMENT_ERROR;
        }
    }
}