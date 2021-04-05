import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BlackJava extends Application {
  private final static int CARDS_PER_ROW = 13;
  private Image[] images = new Image[52]; // TOtal 52 cards
  private ImageView[] imageViewsRow1 = new ImageView[CARDS_PER_ROW];
  private ImageView[] imageViewsRow2 = new ImageView[CARDS_PER_ROW];
  private ImageView[] imageViewsRow3 = new ImageView[CARDS_PER_ROW];
  private ImageView[] imageViewsRow4 = new ImageView[CARDS_PER_ROW];


  @Override // Override the init method in the Application class
  public void init() {
    // Initialize the data fields
    // Create Images objects for the card pngs
    images[0] = new Image("cards/AD.png", 50, 0, true, true);
    images[1] = new Image("cards/2D.png", 50, 0, true, true);
    images[2] = new Image("cards/3D.png", 50, 0, true, true);
    images[3] = new Image("cards/4D.png", 50, 0, true, true);
    images[4] = new Image("cards/5D.png", 50, 0, true, true);
    images[5] = new Image("cards/6D.png", 50, 0, true, true);
    images[6] = new Image("cards/7D.png", 50, 0, true, true);
    images[7] = new Image("cards/8D.png", 50, 0, true, true);
    images[8] = new Image("cards/9D.png", 50, 0, true, true);
    images[9] = new Image("cards/10D.png", 50, 0, true, true);
    images[10] = new Image("cards/JD.png", 50, 0, true, true);
    images[11] = new Image("cards/QD.png", 50, 0, true, true);
    images[12] = new Image("cards/KD.png", 50, 0, true, true);
    images[13] = new Image("cards/AC.png", 50, 0, true, true);
    images[14] = new Image("cards/2C.png", 50, 0, true, true);
    images[15] = new Image("cards/3C.png", 50, 0, true, true);
    images[16] = new Image("cards/4C.png", 50, 0, true, true);
    images[17] = new Image("cards/5C.png", 50, 0, true, true);
    images[18] = new Image("cards/6C.png", 50, 0, true, true);
    images[19] = new Image("cards/7C.png", 50, 0, true, true);
    images[20] = new Image("cards/8C.png", 50, 0, true, true);
    images[21] = new Image("cards/9C.png", 50, 0, true, true);
    images[22] = new Image("cards/10C.png", 50, 0, true, true);
    images[23] = new Image("cards/JC.png", 50, 0, true, true);
    images[24] = new Image("cards/QC.png", 50, 0, true, true);
    images[25] = new Image("cards/KC.png", 50, 0, true, true);
    images[26] = new Image("cards/AH.png", 50, 0, true, true);
    images[27] = new Image("cards/2H.png", 50, 0, true, true);
    images[28] = new Image("cards/3H.png", 50, 0, true, true);
    images[29] = new Image("cards/4H.png", 50, 0, true, true);
    images[30] = new Image("cards/5H.png", 50, 0, true, true);
    images[31] = new Image("cards/6H.png", 50, 0, true, true);
    images[32] = new Image("cards/7H.png", 50, 0, true, true);
    images[33] = new Image("cards/8H.png", 50, 0, true, true);
    images[34] = new Image("cards/9H.png", 50, 0, true, true);
    images[35] = new Image("cards/10H.png", 50, 0, true, true);
    images[36] = new Image("cards/JH.png", 50, 0, true, true);
    images[37] = new Image("cards/QH.png", 50, 0, true, true);
    images[38] = new Image("cards/KH.png", 50, 0, true, true);
    images[39] = new Image("cards/AS.png", 50, 0, true, true);
    images[40] = new Image("cards/2S.png", 50, 0, true, true);
    images[41] = new Image("cards/3S.png", 50, 0, true, true);
    images[42] = new Image("cards/4S.png", 50, 0, true, true);
    images[43] = new Image("cards/5S.png", 50, 0, true, true);
    images[44] = new Image("cards/6S.png", 50, 0, true, true);
    images[45] = new Image("cards/7S.png", 50, 0, true, true);
    images[46] = new Image("cards/8S.png", 50, 0, true, true);
    images[47] = new Image("cards/9S.png", 50, 0, true, true);
    images[48] = new Image("cards/10S.png", 50, 0, true, true);
    images[49] = new Image("cards/JS.png", 50, 0, true, true);
    images[50] = new Image("cards/QS.png", 50, 0, true, true);
    images[51] = new Image("cards/KS.png", 50, 0, true, true);
    
    
    // Create ImageView objects for displaying images
    for (int i = 0; i < CARDS_PER_ROW; i++) {
      imageViewsRow1[i] = new ImageView();
      imageViewsRow2[i] = new ImageView();
      imageViewsRow3[i] = new ImageView();
      imageViewsRow4[i] = new ImageView();
    }    
  }
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    
    imageViewsRow1[0].setImage (images[0]);
    imageViewsRow1[1].setImage (images[1]);
    imageViewsRow1[2].setImage (images[2]);
    imageViewsRow1[3].setImage (images[3]);
    imageViewsRow1[4].setImage (images[4]);
    imageViewsRow1[5].setImage (images[5]);
    imageViewsRow1[6].setImage (images[6]);
    imageViewsRow1[7].setImage (images[7]);
    imageViewsRow1[8].setImage (images[8]);
    imageViewsRow1[9].setImage (images[9]);
    imageViewsRow1[10].setImage (images[10]);
    imageViewsRow1[11].setImage (images[11]);
    imageViewsRow1[12].setImage (images[12]);

    //imageViewsRow2[0].setImage (images[3]);
    //imageViewsRow2[1].setImage (images[4]);
    //imageViewsRow2[2].setImage (images[5]);

    imageViewsRow2[0].setImage (images[13]);
    imageViewsRow2[1].setImage (images[14]);
    imageViewsRow2[2].setImage (images[15]);
    imageViewsRow2[3].setImage (images[16]);
    imageViewsRow2[4].setImage (images[17]);
    imageViewsRow2[5].setImage (images[18]);
    imageViewsRow2[6].setImage (images[19]);
    imageViewsRow2[7].setImage (images[20]);
    imageViewsRow2[8].setImage (images[21]);
    imageViewsRow2[9].setImage (images[22]);
    imageViewsRow2[10].setImage (images[23]);
    imageViewsRow2[11].setImage (images[24]);
    imageViewsRow2[12].setImage (images[25]);

    imageViewsRow3[0].setImage (images[26]);
    imageViewsRow3[1].setImage (images[27]);
    imageViewsRow3[2].setImage (images[28]);
    imageViewsRow3[3].setImage (images[29]);
    imageViewsRow3[4].setImage (images[30]);
    imageViewsRow3[5].setImage (images[31]);
    imageViewsRow3[6].setImage (images[32]);
    imageViewsRow3[7].setImage (images[33]);
    imageViewsRow3[8].setImage (images[34]);
    imageViewsRow3[9].setImage (images[35]);
    imageViewsRow3[10].setImage (images[36]);
    imageViewsRow3[11].setImage (images[37]);
    imageViewsRow3[12].setImage (images[38]);

    imageViewsRow4[0].setImage (images[39]);
    imageViewsRow4[1].setImage (images[40]);
    imageViewsRow4[2].setImage (images[41]);
    imageViewsRow4[3].setImage (images[42]);
    imageViewsRow4[4].setImage (images[43]);
    imageViewsRow4[5].setImage (images[44]);
    imageViewsRow4[6].setImage (images[45]);
    imageViewsRow4[7].setImage (images[46]);
    imageViewsRow4[8].setImage (images[47]);
    imageViewsRow4[9].setImage (images[48]);
    imageViewsRow4[10].setImage (images[49]);
    imageViewsRow4[11].setImage (images[50]);
    imageViewsRow4[12].setImage (images[51]);

    // Create a horizontal box for row 1
    HBox hBoxRow1 = new HBox();
    hBoxRow1.getChildren().addAll(imageViewsRow1);

    // Create a horizontal box for row 2
    HBox hBoxRow2 = new HBox();
    //hBoxRow2.setAlignment(Pos.CENTER);
    hBoxRow2.getChildren().addAll(imageViewsRow2);
    
    // Create a horizontal box for row 3
    HBox hBoxRow3 = new HBox();
    hBoxRow3.getChildren().addAll(imageViewsRow3);

    // Create a horizontal box for row 4
    HBox hBoxRow4 = new HBox();
    hBoxRow4.getChildren().addAll(imageViewsRow4);

    // Create a horizontal box for row 5
    HBox hBoxRow5 = new HBox();
    Button btShowCard = new Button("Click Me");   
    Label lblStatus = new Label();
    hBoxRow5.getChildren().addAll(btShowCard, lblStatus);
        
    // Create a vertical box for arranging the 5 rows
    VBox vBox = new VBox(5);
    vBox.getChildren().addAll(hBoxRow1, hBoxRow2, hBoxRow3,hBoxRow4,hBoxRow5);
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(vBox, 900, 600);
    primaryStage.setTitle("BlackJava"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage

    btShowCard.setOnAction(e -> lblStatus.setText(" Welcome To BlackJava !!!"));    
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
} 
