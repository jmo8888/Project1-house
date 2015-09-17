/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael K�lling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square house;
    private Square houseHider;
    private Square window;
    private Square windowHider;
    private Square pane1;
    private Square pane2;
    private Square pane3;
    private Square pane4;
    private Triangle roof;
    private Circle sun;
    private Square door;
    private Square doorHider;
    private Circle doorKnob;
    private Person me;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        house = new Square();
        house.moveHorizontal(-220);
        house.moveVertical(50);
        house.changeSize(180);
        house.makeVisible();
        
        houseHider = new Square();
        houseHider.changeColor("white");
        houseHider.moveHorizontal(-65);
        houseHider.moveVertical(50);
        houseHider.changeSize(160);
        houseHider.makeVisible();    
   
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-210);
        window.moveVertical(70);
        window.changeSize(80);
        window.makeVisible();    
        
        windowHider = new Square();
        windowHider.changeColor("red");
        windowHider.moveHorizontal(-145);
        windowHider.moveVertical(70);
        windowHider.changeSize(80);
        windowHider.makeVisible();
        
        pane1 = new Square();
        pane1.changeColor("white");
        pane1.moveHorizontal(-205);
        pane1.moveVertical(80);
        pane1.changeSize(25);
        pane1.makeVisible();
        
        pane2 = new Square();
        pane2.changeColor("white");
        pane2.moveHorizontal(-175);
        pane2.moveVertical(80);
        pane2.changeSize(25);
        pane2.makeVisible();        
        
        pane3 = new Square();
        pane3.changeColor("white");
        pane3.moveHorizontal(-205);
        pane3.moveVertical(115);
        pane3.changeSize(25);
        pane3.makeVisible();
        
        pane4 = new Square();
        pane4.changeColor("white");
        pane4.moveHorizontal(-175);
        pane4.moveVertical(115);
        pane4.changeSize(25);
        pane4.makeVisible();         
        
        roof = new Triangle();  
        roof.changeColor("black");
        roof.changeSize(90, 180);
        roof.moveHorizontal(-42);
        roof.moveVertical(-60);
        roof.makeVisible();      
        
        door = new Square();
        door.changeColor("yellow");
        door.moveHorizontal(-100);
        door.moveVertical(120);
        door.changeSize(60);
        door.makeVisible();          
        
        doorHider = new Square();
        doorHider.changeColor("white");
        doorHider.moveHorizontal(-64);
        doorHider.moveVertical(120);
        doorHider.changeSize(60);
        doorHider.makeVisible();   
        
        doorKnob = new Circle();
        doorKnob.changeColor("green");
        doorKnob.moveHorizontal(0);
        doorKnob.moveVertical(170);
        doorKnob.changeSize(10);
        doorKnob.makeVisible();    
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(120);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();        
        
        me = new Person();
        me.moveHorizontal(120);
        me.moveVertical(67);
        me.makeVisible();       
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (house != null)   // only if it's painted already...
        {
            house.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (house != null)   // only if it's painted already...
        {
            house.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
