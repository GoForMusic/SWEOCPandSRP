package Wrong;

import java.util.ArrayList;

public class GraphicEditor {
    public ArrayList<Shape> shapes;

    public GraphicEditor()
    {
        shapes = new ArrayList<Shape>();
    }

    public void addShape(Shape s)
    {
        this.shapes.add(s);
    }

    public void drawCircle(Shape shape){

    }

    public void drawnRectangle(Shape shape){

    }

    public void drawShape()
    {
        for(Shape shape:shapes){
            if(shape.getType()==1){
                drawnRectangle(shape);
            }else if(shape.getType()==2){
                drawCircle(shape);
            }
        }
    }
}
