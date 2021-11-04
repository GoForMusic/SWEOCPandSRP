package Right;

import java.util.ArrayList;

public class GraphicEditor {
    public ArrayList<Shape> shapes;

    public GraphicEditor()
    {
        shapes = new ArrayList<Shape>();
    }

    public void addShape(Shape shape)
    {
        this.shapes.add(shape);
    }

    public void drawShape()
    {
        for(Shape shape:shapes){
            shape.draw();
        }
    }
}
