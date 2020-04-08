package seedu.dietmanager.commons.core;

public class MessageBank {

    public static String LOGO = "  _____   _        _     __  __\n"
            + " |  __ \\ (_)      | |   |  \\/  |\n"
            + " | |  | | _   ___ | |_  | \\  / |  __ _  _ __    __ _   __ _   ___  _ __\n"
            + " | |  | || | / _ \\| __| | |\\/| | / _` || '_ \\  / _` | / _` | / _ \\| '__|\n"
            + " | |__| || ||  __/| |_  | |  | || (_| || | | || (_| || (_| ||  __/| |\n"
            + " |_____/ |_| \\___| \\__| |_|  |_| \\__,_||_| |_| \\__,_| \\__, | \\___||_|\n"
            + "                                                       __/ |\n"
            + "                                                      |___/";

    public static String WELCOME_MESSAGE = "Welcome to Diet Manager! How may I assist you today?";

    public static String INVALID_COMMAND_MESSAGE = "Sorry, the command you have entered is invalid.";

    public static String INVALID_FORMAT_MESSAGE = "Sorry, that is an invalid command format.";

    public static String INVALID_GENDER_MESSAGE = "Sorry, that is an invalid gender.";

    public static String INVALID_AGE_MESSAGE = "Sorry, that is an invalid age.";

    public static String FILE_ERROR_MESSAGE = "An error has occurred with the data files.";

    public static String EXIT_COMMAND_MESSAGE = "Thank you and see you again soon!";

    public static String EXIT_APP_MESSAGE = "Thanks for using Diet Manager! See you again soon. :)";

    public static String NAME_CHANGE_MESSAGE = "Your username has been changed to ";

    public static String GENDER_CHANGE_MESSAGE = "Your gender has been changed to ";

    public static String HEIGHT_CHANGE_MESSAGE = "Your height has been changed to ";

    public static String AGE_CHANGE_MESSAGE = "Your age has been changed to ";

    public static String WEIGHT_CHANGE_MESSAGE = "Your weight has been changed to ";

    public static String WEIGHT_GOAL_CHANGE_MESSAGE = "Your weight goal has been changed to ";

    public static String PROFILE_UPDATE_MESSAGE = "Your profile has been successfully updated.";

    public static String PROFILE_NOT_FOUND_MESSAGE = "No existing profile found. To create a new profile, enter:\n"
            + "set-profile {name} {age} {gender} {height} {weight} {weight goal}";

    public static String BREAKFAST_RECORD_MESSAGE = "You just record the meal in the morning of: ";

    public static String LUNCH_RECORD_MESSAGE = "You just record the meal in the afternoon of: ";

    public static String DINNER_RECORD_MESSAGE = "You just record the meal in the night of: ";

    public static String MEAL_TYPE_ERROR = "You have given wrong description of time!!! "
            + "Choose from: morning/afternoon/night.";

    public static String CHECK_WEIGHT_RECORD_MESSAGE = "Here is your weight changes record:";

    public static String WEIGHT_DELETED_MESSAGE = " has been removed successfully!";

    public static String INVALID_INDEX = "Invalid index of weight! Please check and try again.";

    public static String WEIGHT_LOSS_MESSAGE = "\nGreat job! You have lost %.2f kg since the beginning!\n\n";

    public static String WEIGHT_NO_CHANGE_MESSAGE = "\nNo Pain No Gain! You have not lost weight yet! Strive on!\n\n";

    public static String WEIGHT_GAIN_MESSAGE = "\nMaintain your diet! You have gained %.2f kg since the beginning!\n\n";

    public static String FOOD_DATABASE_MESSAGE = "These are the foods stored in our database:\n";

    public static String INVALID_FOOD_FORMAT_ERROR = "Some food/foods are not added due to invalid calories info.\n";

    public static String CALORIES_MESSAGE = "Total calculable calories intake for the entire day: ";

    public static String TIME_CALORIES_MESSAGE = "total calculable calories intake: ";

    public static String MISSING_CALORIES_MESSAGE = "NOTE: There are foods without calculable calories.\n";

    public static String NO_CALORIES_MESSAGE = "There are no calculable calories data for the entire day.\n";

    public static String NO_TIME_CALORIES_MESSAGE = "there are no calculable calories data.\n";

    public static String INVALID_CALORIES_REQUIREMENT_ERROR = "You have given invalid activity level.\n";

    public static String SUFFICIENT_CALORIES_MESSAGE = "Well done!!! You have consumed sufficient calories.\n";

    public static String INSUFFICIENT_CALORIES_MESSAGE = "Ohh no!!! You have consumed too little calories.\n";

    public static String EXCESS_CALORIES_MESSAGE = "Ohh no!!! You have consumed too much calories.\n";

    public static String CALCULATE_CALORIES_MESSAGE = "Your Calories intake during the given period is ";

    public static String NO_DESCRIPTION_MESSAGE = "This command must follow by description! Please input again!";

    public static String INVALID_DATE_MESSAGE = "You should choose a date from {Monday} to {Sunday}! "
            + "Either uppercase or lowercase is supported!";

    public static String SPLIT_LINE = "----------------------------------------------------------------";

    public static String INVALID_PROFILE_MESSAGE = "Invalid profile detected. "
            + "Please set a new profile using the set-profile command.";

    public static String WEIGHT_GOAL_ACHIEVED_MESSAGE = "YOU DID IT! You have achieved your weight goal!\n\n"
            + "All girls/boys will now fall for your determination and physique! :)\n\n"
            + "You can also set a new weight goal using set-weight-goal NEW_GOAL\n";

    public static String WEIGHT_GOAL_NOT_ACHIEVED_MESSAGE = "%.2f kg more to go to meet your dream girl/boy!";

    public static final String FUNCTION_LIST =
            " _______________________________________________________________________"
                    + "______________________________________\n"
                    + "|                          Functions:                        |"
                    + "                 Descriptions:                  |\n"
                    + "|____________________________________________________________|"
                    + "________________________________________________|\n"
                    + "|   set-profile NAME AGE GENDER HEIGHT WEIGHT WEIGHTGOAL     |"
                    + "  set user's profile data                       |\n"
                    + "|   profile                                                  |"
                    + "  View user profile details                     |\n"
                    + "|   record-meal DATE TIME_PERIOD /FOOD_NAME -- CALORIE       |"
                    + "  Record meal info                              |\n"
                    + "|   check-meal DATE TIME_PERIOD                              |"
                    + "  Check meals eaten                             |\n"
                    + "|   calculate DATE                                           |"
                    + "  Calculate Calorie intake for the day          |\n"
                    + "|   calculate DATE1->DATE2                                   |"
                    + "  Calculate Calorie intake from DATE1 to DATE2  |\n"
                    + "|   list-food                                                |"
                    + "  Lists all foods info in database.             |\n"
                    + "|   addf FOOD_NAME --CALORIES                                |"
                    + "  Add new food info into database               |\n"
                    + "|   delf FOOD_NAME                                           |"
                    + "  Delete food info from database                |\n"
                    + "|   set-weight                                               |"
                    + "  Set/Update weight in user profile             |\n"
                    + "|   check-weight-progress NAME                               |"
                    + "  List index of weight progress                 |\n"
                    + "|   delete-weight INDEX                                      |"
                    + "  Delete weight from the weight progress list   |\n"
                    + "|   new-recipe MAXIMUM_FOOD_TYPES ACTIVITY_LEVEL             |"
                    + "  Randomly recommend recipe from database       |\n"
                    + "|   show-recipe                                              |"
                    + "  Show recommended recipe to user               |\n"
                    + "|   help                                                     |"
                    + "  Show this function help table                 |\n"
                    + "|   exit                                                     |"
                    + "  Exit the application                          |\n"
                    + "|____________________________________________________________|"
                    + "________________________________________________|\n"
                    + "Please key in your command: ";
}