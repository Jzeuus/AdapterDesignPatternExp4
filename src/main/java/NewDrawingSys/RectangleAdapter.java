/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewDrawingSys;

import com.mycompany.oldDrawingSys.Rectangle;

/**
 *
 * @author jesusalvarado
 */
public class RectangleAdapter implements Shape {

    private Rectangle adaptee;
    
    public RectangleAdapter(){
        this.adaptee = new Rectangle();
       
    }
    
    public RectangleAdapter(Rectangle rect){
       this.adaptee = rect;
    }
    
    @Override
    public void Draw(int x1, int y1, int x2, int y2) {
        int width = Math.abs(x2-x1);
        int height = Math.abs(y2-y1);
        x1 = Math.min(x1, x2);
        y1 = Math.min(y1, y2);
        adaptee.draw(x1, y1, width, height);
        
    }
    
    
}
