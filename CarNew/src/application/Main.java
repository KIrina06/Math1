package application;
	
import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	public void start(Stage theStage) 
    {
        theStage.setTitle( "Пример работы с клавиатурой" );
 
        // Готовим корневой элемент и сцену для окна
        Group root = new Group();
        Scene theScene = new Scene( root );
        theStage.setScene( theScene );
 
        // Указываем размер канвы и добавляем ее в корневой элемент
        Canvas canvas = new Canvas( 900, 600);
        root.getChildren().add( canvas );
 
        // Создаем список с кодами нажатых клавиш
        ArrayList<String> input = new ArrayList<String>();
 
        // Обработка события нажатия на клавишу
        theScene.setOnKeyPressed(
            new EventHandler<KeyEvent>()
            {
                public void handle(KeyEvent e)
                {
                	// код клавиши
                    String code = e.getCode().toString(); 
                    if ( !input.contains(code) )
                        input.add( code );
                }
            });
 
        // обработка "отпускания" клавиши
        theScene.setOnKeyReleased(
            new EventHandler<KeyEvent>()
            {
                public void handle(KeyEvent e)
                {
                    String code = e.getCode().toString();
                    input.remove( code );
                }
            });
 
        GraphicsContext gc = canvas.getGraphicsContext2D();
 
        // Создаем объекты изображений
        Image grass = new Image( "grass.png" );
        Image car = new Image( "car.png" );
        
        
        new AnimationTimer()
        {
        	int x = 300;
            public void handle(long currentNanoTime)
            {
                // Каждый раз очищаем канву
                gc.clearRect(0, 0, 900,600);
                gc.drawImage( grass, 0, 0 );
                gc.drawImage( car, x, 250 );
                // Меняем изображение, в зависимости от кода клавиши
                if (input.contains("LEFT")) { 
                	x=x-5;
                	gc.clearRect(0, 0, 900,600);
                	gc.drawImage( grass, 0, 0 );
                    gc.drawImage( car, x, 250 );}
                
                if (input.contains("RIGHT")) {
                	x=x+5;
                	gc.clearRect(0, 0, 900,600);
                	gc.drawImage( grass, 0, 0 );
                    gc.drawImage( car, x, 250 );}
            }
        }.start();
 
        theStage.show();
    }
	public static void main(String[] args)
    {
        launch(args);
    }

}