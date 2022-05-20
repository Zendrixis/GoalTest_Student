
package goaltest;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;




public class Goal {
        private Image dukeImage = new Image(getClass().getResource("Images/Duke.png").toString());
        private ImageView dukeImageView = new ImageView();

        private int ycord;
        private int xcord;





    public Goal(int x,int y){
        dukeImageView.setImage(dukeImage);
        this.ycord = y;
        this.xcord = x;

        dukeImageView.setLayoutX(x);
        dukeImageView.setLayoutY(y);

         GoalTest.root.getChildren().addAll(dukeImageView);
        interactions();

    }
    
    private void interactions(){
        //Exercise 4   
        
    }
}
