package prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache
{
    private static Map<Integer, Shape> map = new HashMap<>();

    static
    {
        map.put(1,new Rectangle());
        map.put(2,new Square());
    }

    public static Shape getShape(int id)
    {
        return (Shape) map.get(id).clone();
    }
}
