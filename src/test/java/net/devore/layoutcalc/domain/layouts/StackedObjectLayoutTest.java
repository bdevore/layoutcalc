package net.devore.layoutcalc.domain.layouts;

import net.devore.layoutcalc.domain.Dimension;
import net.devore.layoutcalc.domain.MattedObject;
import net.devore.layoutcalc.domain.Picture;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by bdevore on 1/10/16.
 */
public class StackedObjectLayoutTest {

    @Test
    public void testSingleObjectDimensionNoGapCalculation() {
        Picture p = new Picture("A",new Dimension(5f,7f),0f);
        List<MattedObject> list = new ArrayList<MattedObject>();
        list.add(p);

        MattedObjectLayout layout = new StackedObjectLayout(list);
        Dimension layoutDimension = layout.getLayoutPreferredDimension();
        assertEquals("Height dimensions did not match", 5f, layoutDimension.getHeight(),0f);
        assertEquals("Width dimensions did not match", 7f, layoutDimension.getWidth(),0f);
    }

    @Test
    public void testSingleObjectDimensionWithGapCalculation() {
        Picture p = new Picture("A",new Dimension(5f,7f),0f);
        List<MattedObject> list = new ArrayList<MattedObject>();
        list.add(p);

        MattedObjectLayout layout = new StackedObjectLayout(list, false, 1f);
        Dimension layoutDimension = layout.getLayoutPreferredDimension();
        assertEquals("Height dimensions did not match", 5f, layoutDimension.getHeight(),0f);
        assertEquals("Width dimensions did not match", 7f, layoutDimension.getWidth(),0f);
    }

    @Test
    public void testTwoObjectsVerticalWithNoGapCalculation() {
        Picture p = new Picture("A",new Dimension(5f,7f),0f);
        Picture p2 = new Picture("B",new Dimension(5f,7f),0f);
        List<MattedObject> list = new ArrayList<MattedObject>();
        list.add(p);
        list.add(p2);

        MattedObjectLayout layout = new StackedObjectLayout(list);
        Dimension layoutDimension = layout.getLayoutPreferredDimension();
        assertEquals("Height dimensions did not match", 10f, layoutDimension.getHeight(),0f);
        assertEquals("Width dimensions did not match", 7f, layoutDimension.getWidth(),0f);
    }

    @Test
    public void testTwoObjectsHorizontalWithNoGapCalculation() {
        Picture p = new Picture("A",new Dimension(5f,7f),0f);
        Picture p2 = new Picture("B",new Dimension(5f,7f),0f);
        List<MattedObject> list = new ArrayList<MattedObject>();
        list.add(p);
        list.add(p2);

        MattedObjectLayout layout = new StackedObjectLayout(list,true,0f);
        Dimension layoutDimension = layout.getLayoutPreferredDimension();
        assertEquals("Height dimensions did not match", 5f, layoutDimension.getHeight(),0f);
        assertEquals("Width dimensions did not match", 14f, layoutDimension.getWidth(),0f);
    }

    @Test
    public void testTwoObjectsVerticalWithGapCalculation() {
        Picture p = new Picture("A",new Dimension(5f,7f),0f);
        Picture p2 = new Picture("B",new Dimension(5f,7f),0f);
        List<MattedObject> list = new ArrayList<MattedObject>();
        list.add(p);
        list.add(p2);

        MattedObjectLayout layout = new StackedObjectLayout(list, false, 1f);
        Dimension layoutDimension = layout.getLayoutPreferredDimension();
        assertEquals("Height dimensions did not match", 11f, layoutDimension.getHeight(),0f);
        assertEquals("Width dimensions did not match", 7f, layoutDimension.getWidth(),0f);
    }

    @Test
    public void testTwoObjectsHorizontalWithGapCalculation() {
        Picture p = new Picture("A",new Dimension(5f,7f),0f);
        Picture p2 = new Picture("B",new Dimension(5f,7f),0f);
        List<MattedObject> list = new ArrayList<MattedObject>();
        list.add(p);
        list.add(p2);

        MattedObjectLayout layout = new StackedObjectLayout(list, true, 1f);
        Dimension layoutDimension = layout.getLayoutPreferredDimension();
        assertEquals("Height dimensions did not match", 5f, layoutDimension.getHeight(),0f);
        assertEquals("Width dimensions did not match", 15f, layoutDimension.getWidth(),0f);
    }

    @Test
    public void testThreeObjectsVerticalWithGapCalculation() {
        Picture p = new Picture("A",new Dimension(5f,7f),0f);
        Picture p2 = new Picture("B",new Dimension(5f,7f),0f);
        Picture p3 = new Picture("C",new Dimension(5f,7f),0f);
        List<MattedObject> list = new ArrayList<MattedObject>();
        list.add(p);
        list.add(p2);
        list.add(p3);

        MattedObjectLayout layout = new StackedObjectLayout(list, false, 1f);
        Dimension layoutDimension = layout.getLayoutPreferredDimension();
        assertEquals("Height dimensions did not match", 17f, layoutDimension.getHeight(),0f);
        assertEquals("Width dimensions did not match", 7f, layoutDimension.getWidth(),0f);
    }

    @Test
    public void testThreeObjectsHorizontalWithGapCalculation() {
        Picture p = new Picture("A",new Dimension(5f,7f),0f);
        Picture p2 = new Picture("B",new Dimension(5f,7f),0f);
        Picture p3 = new Picture("C",new Dimension(5f,7f),0f);
        List<MattedObject> list = new ArrayList<MattedObject>();
        list.add(p);
        list.add(p2);
        list.add(p3);

        MattedObjectLayout layout = new StackedObjectLayout(list, true, 1f);
        Dimension layoutDimension = layout.getLayoutPreferredDimension();
        assertEquals("Height dimensions did not match", 5f, layoutDimension.getHeight(),0f);
        assertEquals("Width dimensions did not match", 23f, layoutDimension.getWidth(),0f);
    }
}
