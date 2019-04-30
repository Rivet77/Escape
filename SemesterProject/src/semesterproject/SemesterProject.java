// IvyTech Dungeon Game
/* 
* IvyTech Dungeon Game is a game where the player finds a suspicious cave entrance, then enter the dungeon.
* The dungeon contains enemies and treasures. The player fights their way through many dungeon rooms
* and collects upgrades along the way. The player wins the game by making their way to the boss 
* room and defeating that boss.
*/
// Riley Tucker, Aiden Hutton
// Karen Stackhouse, Christopher Fields
// Created On 4/18/2019
package semesterproject;


import java.io.File;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


public class SemesterProject extends Application {
    // buttons
    private Button goWestBT = new Button("Go West");
    private Button goEastBT = new Button("Go East");
    private Button goNorthBT = new Button("Go North");
    private Button goSouthBT = new Button("Go South");
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
    
    // map image area
    static ImageView mapIV = new ImageView();
    
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
        
        // create outer borderpane
        BorderPane outerBorderPane = new BorderPane();
        outerBorderPane.setPadding(insets);
        // create inner borderpane for map and story output
        BorderPane innerBorderPane = new BorderPane();
        innerBorderPane.setPadding(insets);
        
        // create top, left, right, and bottom boxes for outer pane
        HBox topHBox = new HBox();
        HBox bottomHBox = new HBox();
        VBox leftHBox = new VBox();
        VBox rightHBox = new VBox();
        // create top and bottom boxes for map/story borderpane
        HBox storyOutputHBox = new HBox();
        HBox mapHBox = new HBox();
        // set box positions
        outerBorderPane.setTop(topHBox);
        outerBorderPane.setLeft(leftHBox);
        outerBorderPane.setRight(rightHBox);
        outerBorderPane.setBottom(bottomHBox);
        outerBorderPane.setCenter(innerBorderPane);
        innerBorderPane.setTop(mapHBox);
        innerBorderPane.setBottom(storyOutputHBox);
        
        // add buttons to boxes
        topHBox.getChildren().addAll(goNorthBT, goSouthBT);
        leftHBox.getChildren().add(goWestBT);
        rightHBox.getChildren().add(goEastBT);
        // add stats to bottom box
        bottomHBox.getChildren().addAll(attackBT, strengthLB, strengthTF, 
                dexterityLB, dexterityTF, constitutionLB, constitutionTF, runBT);
        // add map imageview to top box inside inner borderpane
        mapHBox.getChildren().add(mapIV);
        // add output textfield to bottom box inside inner borderpane
        storyOutputHBox.getChildren().add(storyOutputTF);
        
        // add button functions
        goWestBT.setOnAction(e -> Action.goWest());
        goEastBT.setOnAction(e -> Action.goEast());
        goNorthBT.setOnAction(e -> Action.goNorth());
        goSouthBT.setOnAction(e -> Action.goSouth());
        attackBT.setOnAction(e -> Action.attack());
        runBT.setOnAction(e -> Action.run());
        
        // properties
        // set textfields to read-only
        strengthTF.setEditable(false);
        dexterityTF.setEditable(false);
        constitutionTF.setEditable(false);
        //padding
        topHBox.setPadding(insets);
        bottomHBox.setPadding(insets);
        leftHBox.setPadding(insets);
        rightHBox.setPadding(insets);
        storyOutputHBox.setPadding(insets);
        mapHBox.setPadding(insets);
        // spacing
        topHBox.setSpacing(spacing);
        bottomHBox.setSpacing(spacing);
        leftHBox.setSpacing(spacing);
        rightHBox.setSpacing(spacing);
        storyOutputHBox.setSpacing(spacing);
        mapHBox.setSpacing(spacing);
        //alignment
        topHBox.setAlignment(Pos.CENTER);
        bottomHBox.setAlignment(Pos.CENTER);
        leftHBox.setAlignment(Pos.CENTER);
        rightHBox.setAlignment(Pos.CENTER);
        storyOutputHBox.setAlignment(Pos.CENTER);
        mapHBox.setAlignment(Pos.CENTER);
        // box sizes
        storyOutputTF.setMinSize(400, 200);
        mapIV.setFitWidth(450);
        mapIV.setFitHeight(300);
        strengthTF.setMaxWidth(statSize);
        dexterityTF.setMaxWidth(statSize);
        constitutionTF.setMaxWidth(statSize);
        // image view settings
        mapIV.setPreserveRatio(true);
        mapIV.setSmooth(true);
        mapIV.setCache(true);
        // column length
        storyOutputTF.setWrapText(true);
        
        // create a scene and put it on stage
        Scene scene = new Scene(outerBorderPane);
        primaryStage.setMinHeight(650);
        primaryStage.setMinWidth(700);
        primaryStage.setTitle("Escape!");
        primaryStage.setScene(scene);
        primaryStage.show();        
        
        // play music 
        String totallyNormalMusic = "src/semesterProject/music.mp3";
        Media oWo = new Media(new File(totallyNormalMusic).toURI().toString());
        MediaPlayer whatsThis = new MediaPlayer(oWo);
        whatsThis.play();
        
        // run application
        runGame();
    }
    
    
    public static void runGame() {
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
                    storyOutputTF.appendText("\n\n");
                    IvyTechDungeonGame.startGame();
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
