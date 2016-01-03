# LayoutCalc
Simple library to help in performing calculations for Matting photos. Following similar approach to AWT containers and components.

Some simple functional requirements:
 * Calculate window dimensions/positions for each photo
   * Allow for overlap of photo to set either per side or as a single value for all four sides
 * Calculate photo/matte board placement
 * Support centering of a photo on the board
 * Support stacking multiple photos either horizontally or vertically
 * Support setting of gap width between multiple photos
 * Support laying out photos in a grid
 * Allow stacking of multiple matte boards
 * Allow a label to be set for each item
 * Accept a yaml file to describe the layout
 * Generate an output report that specifies position and dimensions of each cut
 * Support imperial/metric measurements
 * Support conversion of fractions to decimal values
 * Perform validation of the results and provide warning when questionable measurements used
   * Pictures bigger than board
   * Overlapping objects
   * Too many pictures that are too big

