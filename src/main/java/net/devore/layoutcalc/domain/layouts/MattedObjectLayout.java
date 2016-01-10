package net.devore.layoutcalc.domain.layouts;

import net.devore.layoutcalc.domain.Dimension;

/**
 * Created by benjamindevore on 1/3/16.
 */
public interface MattedObjectLayout {

    /**
     * Get the preferred overall Dimension for the layout based on the contents
     * @return A Dimension object contains the overall height and width needed to hold all contents
     */
    public Dimension getLayoutPreferredDimension();
}
