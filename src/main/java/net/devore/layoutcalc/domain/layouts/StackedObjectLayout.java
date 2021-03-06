package net.devore.layoutcalc.domain.layouts;

import net.devore.layoutcalc.domain.Dimension;
import net.devore.layoutcalc.domain.Insets;
import net.devore.layoutcalc.domain.MattedObject;

import java.util.List;

/**
 * Simple layout that supports stacking pictures horizontally or vertically
 * Created by bdevore on 1/10/16.
 */
public class StackedObjectLayout implements MattedObjectLayout {
    private List<MattedObject> mattedObjectList;
    private boolean horizontalStack;
    private float interObjectGap;

    /**
     * Constructor for StackedObjectLayout
     *
     * @param mattedObjectList The list of objects to be managed by the layout
     */
    public StackedObjectLayout(List<MattedObject> mattedObjectList) {
        this.mattedObjectList = mattedObjectList;
    }

    /**
     * Constructor for StackedObjectLayout
     *
     * @param mattedObjectList The list of objects to be managed by the layout
     * @param horizontalStack  Flag, if true, indicates that the objects are to be stacked horizontally, false if
     *                         vertically
     * @param interObjectGap   The distance of the gap between each object in the list
     */
    public StackedObjectLayout(List<MattedObject> mattedObjectList, boolean horizontalStack, float interObjectGap) {
        this.mattedObjectList = mattedObjectList;
        this.horizontalStack = horizontalStack;
        this.interObjectGap = interObjectGap;
    }

    /**
     * Get the preferred overall Dimension for the layout based on the contents
     *
     * @return A Dimension object contains the overall height and width needed to hold all contents
     */
    public Dimension getLayoutPreferredDimension() {
        float height = 0f;
        float width = 0f;
        int itemCount = 0;

        // For horizontal, height will be maximum height of objects and width will be cumulative
        // with the opposite for vertical
        for (MattedObject obj : mattedObjectList) {
            Dimension dim = obj.getDimensions();
            itemCount++;

            if (horizontalStack) {
                if (dim.getHeight() > height) {
                    height = dim.getHeight();
                }

                width += dim.getWidth();
                if (itemCount > 1) {
                    width += interObjectGap;
                }
            } else {
                if (dim.getWidth() > width) {
                    width = dim.getWidth();
                }

                height += dim.getHeight();
                if (itemCount > 1) {
                    height += interObjectGap;
                }
            }
        }
        return new Dimension(height, width);
    }

    /**
     * Retrieve the Insets for the specified matted object. The Insets are relative to the layout containing the object.
     *
     * @param object The MattedObject to retrieve Insets for.
     * @return The Insets for the specified MattedObject, null if the object does not exist within the layout instance
     */
    public Insets getInsetsForMattedObject(MattedObject object) {
        Insets insets = null;
        int index = mattedObjectList.indexOf(object);

        // Found the object
        if (index >= 0) {

            Dimension layoutDimension = getLayoutPreferredDimension();

            // Insets are calculated based on horizontal or vertical layout
            // The inset for the 'non-stacked' dimension should be the difference between the
            // preferred dimension and the object dimension
            // Insets for the 'stacked' dimension are based on the size of objects above and below
            // the current object
            insets = new Insets();
        }

        return insets;
    }

    /* Getters and setters */

    public float getInterObjectGap() {
        return interObjectGap;
    }

    public void setInterObjectGap(float interObjectGap) {
        this.interObjectGap = interObjectGap;
    }

    public boolean isHorizontalStack() {
        return horizontalStack;
    }

    public void setHorizontalStack(boolean horizontalStack) {
        this.horizontalStack = horizontalStack;
    }
}
