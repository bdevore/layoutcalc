package net.devore.layoutcalc.domain;

import net.devore.layoutcalc.domain.layouts.MattedObjectLayout;
import net.devore.layoutcalc.domain.MattedObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by benjamindevore on 1/3/16.
 */
public class MatteBoard extends MattedObject {
    private List<MattedObject> contents = new ArrayList<MattedObject>();
    private MattedObjectLayout layout;
    private float verticalOffset;
    private float horizontalOffest;


    public MatteBoard(String label, MattedObjectLayout layout) {
        super(label);
        this.layout = layout;
    }

    /**
     * Populating constructor, setting all overlap to the same value
     *
     * @param label      A name to use when describing the object
     * @param dimensions The height and width of the object
     * @param overlap    The amount of overlap for the matte board over the object
     */
    public MatteBoard(String label, Dimension dimensions, float overlap, MattedObjectLayout layout) {
        super(label, dimensions, overlap);
        this.layout = layout;
    }

    /**
     * Populating constructor
     *
     * @param label         A name to use when describing the object
     * @param dimensions    The height and width of the object
     * @param topOverlap    The amount of top overlap
     * @param rightOverlap  The amount of right overlap
     * @param bottomOverlap The amount of bottom overlap
     * @param leftOverlap   The amount of left overlap
     */
    public MatteBoard(String label, Dimension dimensions, float topOverlap, float rightOverlap, float bottomOverlap, float leftOverlap, MattedObjectLayout layout) {
        super(label, dimensions, topOverlap, rightOverlap, bottomOverlap, leftOverlap);
        this.layout = layout;
    }

    /**
     * Add a new object to the board
     * @param mattedObject The object to add
     */
    public void addMattedObject(MattedObject mattedObject) {
        contents.add(mattedObject);
    }

    /**
     * Remove an object from the board
     * @param mattedObject The object to remove
     * @return true if the object was found and removed
     */
    public boolean removeMattedObject(MattedObject mattedObject) {
        return contents.remove(mattedObject);
    }

    /**
     * Get the right inset distance for the layout from the right edge of the board
     * @return The distance for the left right
     */
    public Insets getInsets() {
        Dimension layoutDim = layout.getLayoutPreferredDimension();
        float marginWidth = (dimensions.getWidth() - layoutDim.getWidth())/2;
        float marginHeight = (dimensions.getHeight() - layoutDim.getHeight())/2;

        Insets insets = new Insets();
        insets.setTopInset(marginHeight + verticalOffset);
        insets.setBottomInset(marginHeight - verticalOffset);
        insets.setLeftInset(marginWidth + horizontalOffest);
        insets.setRightInset(marginWidth - horizontalOffest);

        return insets;
    }
}
