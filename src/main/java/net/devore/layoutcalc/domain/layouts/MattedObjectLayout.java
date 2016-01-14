package net.devore.layoutcalc.domain.layouts;

import net.devore.layoutcalc.domain.Dimension;
import net.devore.layoutcalc.domain.Insets;
import net.devore.layoutcalc.domain.MattedObject;

/**
 * Created by benjamindevore on 1/3/16.
 */
public interface MattedObjectLayout {

    /**
     * Get the preferred overall Dimension for the layout based on the contents
     * @return A Dimension object contains the overall height and width needed to hold all contents
     */
    public Dimension getLayoutPreferredDimension();

    /**
     * Retrieve the Insets for the specified matted object. The Insets are relative to the layout containing the object.
     * @param object The MattedObject to retrieve Insets for.
     * @return The Insets for the specified MattedObject, null if the object does not exist within the layout instance
     */
    public Insets getInsetsForMattedObject(MattedObject object);
}
