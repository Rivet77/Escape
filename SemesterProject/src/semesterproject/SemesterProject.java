// Semester Project
// Take user through a 'choose your own adventure' style story
// Riley Tucker
// 10-20-2018
package semesterproject;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class SemesterProject extends Application {
    // buttons
    private Button goLeftBT = new Button("Go Left");
    private Button goRightBT = new Button("Go Right");
    private Button goStraightBT = new Button("Go Straight");
    private Button goBackBT = new Button("Go Back");
    private Button attackBT = new Button("Attack");
    private Button runBT = new Button("Run");
    
    // labels
    private Label strengthLB = new Label("Attack Power:");
    private Label dexterityLB = new Label("Speed:");
    private Label constitutionLB = new Label("Health:");
    
    // textfields
    public static TextField strengthTF = new TextField();
    public static TextField dexterityTF = new TextField();
    public static TextField constitutionTF = new TextField();
    
    // textarea
    static TextArea storyOutputTF = new TextArea();
    
    // varibles
    private Insets insets = new Insets(6, 6, 6, 6);
    private int spacing = 10;
    private int statSize = 50;
    
    // set boolean to stop 'selectRace()' function after game is started
    static boolean raceSelected = false;
    // set boolean to stop 'startGame()' function after game is started
    static boolean gameStarted = false;
    
    // GUI
    @Override
    public void start(Stage primaryStage) { 
        
        // create gridpane
        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(insets);
        
        // create top, left, right, bottom, and center boxes
        HBox topHBox = new HBox();
        HBox centerHBox = new HBox();
        HBox bottomHBox = new HBox();
        VBox leftHBox = new VBox();
        VBox rightHBox = new VBox();
        // set box positions
        borderPane.setTop(topHBox);
        borderPane.setLeft(leftHBox);
        borderPane.setRight(rightHBox);
        borderPane.setBottom(bottomHBox);
        borderPane.setCenter(centerHBox);
        
        // add buttons to boxes
        topHBox.getChildren().addAll(goStraightBT, goBackBT);
        leftHBox.getChildren().add(goLeftBT);
        rightHBox.getChildren().add(goRightBT);
        // add stats to bottom box
        bottomHBox.getChildren().addAll(attackBT, strengthLB, strengthTF, 
                dexterityLB, dexterityTF, constitutionLB, constitutionTF, runBT);
        // add output to center box
        centerHBox.getChildren().add(storyOutputTF);
        
        // add button functions
        goLeftBT.setOnAction(e -> Action.goLeft());
        goRightBT.setOnAction(e -> Action.goRight());
        goStraightBT.setOnAction(e -> Action.goStraight());
        goBackBT.setOnAction(e -> Action.goBack());
        attackBT.setOnAction(e -> Action.attack());
        runBT.setOnAction(e -> Action.run());
        
        // properties
        // set textfields to read-only
        strengthTF.setEditable(false);
        dexterityTF.setEditable(false);
        constitutionTF.setEditable(false);
        //padding
        topHBox.setPadding(insets);
        centerHBox.setPadding(insets);
        bottomHBox.setPadding(insets);
        leftHBox.setPadding(insets);
        rightHBox.setPadding(insets);
        // spacing
        topHBox.setSpacing(spacing);
        centerHBox.setSpacing(spacing);
        bottomHBox.setSpacing(spacing);
        leftHBox.setSpacing(spacing);
        rightHBox.setSpacing(spacing);
        //alignment
        topHBox.setAlignment(Pos.CENTER);
        centerHBox.setAlignment(Pos.CENTER);
        bottomHBox.setAlignment(Pos.CENTER);
        leftHBox.setAlignment(Pos.CENTER);
        rightHBox.setAlignment(Pos.CENTER);
        // box size
        storyOutputTF.setMinSize(400, 300);
        strengthTF.setMaxWidth(statSize);
        dexterityTF.setMaxWidth(statSize);
        constitutionTF.setMaxWidth(statSize);
        // colomn length
        storyOutputTF.setWrapText(true);
        
        // create a scene and put it on stage
        Scene scene = new Scene(borderPane);
        primaryStage.setMinHeight(500);
        primaryStage.setMinWidth(500);
        primaryStage.setTitle("Escape!");
        primaryStage.setScene(scene);
        primaryStage.show();        
        
        // run application
        run();
    }
    
    
    public static void run() {
        // welcome player
        storyOutputTF.appendText("Welcome to Escape!\n");
        
        // choose race
        storyOutputTF.appendText("\nChoose a race.\nYou can be a human, an elf,"
                + " or a dwarf.\nEach race has different stats.\n");
        storyOutputTF.appendText("Enter 'h', 'e', or 'd'. Without the quotes"
                + " to choose between them.\n\n");
        storyOutputTF.appendText("Press the 'Enter' key to start the game once "
                + "you've selected your race.\n\n");
        selectRace();
        
        // start game when enter is pressed
        startGame();
    }
    
    
    // select race and set stats
    public static void selectRace() { 
            storyOutputTF.setOnKeyTyped((KeyEvent event) -> {
                String input = event.getCharacter();
                if (!raceSelected) {
                    
                    if (("h".equals(input)) || ("H".equals(input))) {
                        storyOutputTF.appendText("\nYou chose Human. - ");
                        Human human = new Human();
                        human.setHumanStats();
                        setStats();
                    }
                    if (("e".equals(input)) || ("E".equals(input))) {
                        storyOutputTF.appendText("\nYou chose Elf. - ");
                        Elf elf = new Elf();
                        elf.setElfStats();
                        setStats();
                    }
                    if (("d".equals(input)) || ("D".equals(input))) {
                        storyOutputTF.appendText("\nYou chose Dwarf. - ");
                        Dwarf dwarf = new Dwarf();
                        dwarf.setDwarfStats();
                        setStats();
                    }
                }
            });
    }
    
    
    // set the attack, speed, and health text fields
    public static void setStats() { 
        String str = Integer.toString(FantasyRace.getCharacterAttackPower());
        String dex = Integer.toString(FantasyRace.getCharacterSpeed());
        String con = Integer.toString(FantasyRace.getCharacterHealth());
        strengthTF.setText(str);
        dexterityTF.setText(dex);
        constitutionTF.setText(con);
    }
    
    
    // start game when enter is pressed
    public static void startGame() { 
        storyOutputTF.setOnKeyPressed((KeyEvent event) -> {
            KeyCode key = event.getCode();
            if (!gameStarted) { 
                if (key.equals(KeyCode.ENTER)) { 
                    Escape.startGame();
                    raceSelected = true;
                    gameStarted = true;
                }
            }
        });
    }
    
    
    public static void main(String[] args) {
        // launch GUI     
        launch(args);
        
    }
    
}
