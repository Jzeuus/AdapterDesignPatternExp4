/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewDrawingSys;

import com.mycompany.oldDrawingSys.Circle;

/**
 *
 * @author jesusalvarado
 */
public class CircleAdapter implements Shape{

    private Circle adaptee;
    
    public CircleAdapter(){
        this.adaptee = new Circle();
    }
    
    public CircleAdapter(Circle cir)
    {
        this.adaptee = cir;
    }
    
    @Override
    public void Draw(int x1, int y1, int x2, int y2) {
     
        x1 = (Math.abs(x2-x1))/2;
        y1 = (Math.abs(y2-y1)/2);
        y2 = (y2-y1)/2;
        adaptee.draw(x1, y1, y2);
        
    }
    
    
    
}
