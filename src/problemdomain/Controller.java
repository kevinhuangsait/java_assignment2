package problemdomain;

import java.util.*;

/**
 * Base class for sort controllers.
 * @author 831719
 *
 */
public abstract class Controller {
    public abstract void sort(Polygon[] items, Comparator<Polygon> comparator); 
}