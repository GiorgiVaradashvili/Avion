/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedro.ieslaencanta.com.dawairtemplate.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import pedro.ieslaencanta.com.dawairtemplate.model.sprites.Fighter;
import pedro.ieslaencanta.com.dawairtemplate.model.sprites.SpriteMove;

/**
 * @author DAM
 */
public class Bullet extends SpriteMove{
    
    private Image img;
    private static String pathurl = "bullets/bullet_right.png";
    private Direction direccion;
    
    public Bullet(Coordenada c, Rectangle board){
        super(3,new Size(17,3),c,true,true,board);
        this.img = new Image(getClass().getResourceAsStream("/" + Bullet.pathurl));
        this.direccion=direccion;
        this.img=img;
              
    }
    
    @Override
    public void draw(GraphicsContext gc) {
        gc.drawImage(img, 0, 0, 17, 3, this.posicion.getX(), this.posicion.getY(), this.size.getWidth(), this.size.getHeight());
    }

}
