package application;
    
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
 
public class Main extends Application {
    @Override
    public void start(Stage ps) {
        ps.setTitle("Animation");
        Group root = new Group();
        Scene myScene = new Scene(root);
        ps.setScene(myScene);
        
        Canvas canvas = new Canvas(1000, 750);
        root.getChildren().add(canvas);
        
        Image car = new Image("car.png");
        Image grass = new Image("grass.png");
        Image road = new Image("road.png");
                
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        final long startNanoTime=System.nanoTime();
        System.out.println(startNanoTime);
        
        new AnimationTimer() {
 
            @Override
            public void handle(long t) {
                double diff = (t-startNanoTime)/10000000.0;
                
                System.out.println(diff);
                double x = 0;
                double y = 0;
                	x = -150-30*Math.cos(diff);
                    y = 180;                
               gc.drawImage(grass, 0, 0);
				gc.drawImage(road, x, y);
                gc.drawImage(car, 350, 200);
                
            }
            
            
        }.start();
        
        
        //gc.drawImage(sun, 196, 196);
        ps.show();
            }
    
    public static void main(String[] args) {
        launch(args);
    }
}