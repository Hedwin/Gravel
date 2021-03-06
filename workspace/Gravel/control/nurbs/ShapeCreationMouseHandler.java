package control.nurbs;


import control.DragMouseHandler;

import model.NURBSShape;
import model.Messages.NURBSCreationMessage;

/**
 * mouse drag handling for all mouse modes implementing shape creation
 * these are the first modi of HyperEdgeShape-Stuff where the basic shape is created
 *
 * Each implementing Class should provide one way to create shapes
 *
 * @author Ronny Bergmann
 *
 */
public interface ShapeCreationMouseHandler extends DragMouseHandler 
{
	/**
	 * Set Shape to an empty/null object
	 */
	public void resetShape();
	
	/**
	 * Get Parameters for NURBSShapeFactory of the actually created Shape
	 * @return
	 */
	public NURBSCreationMessage getShapeParameters();

	/**
	 * Set the Shape externally with NURBSShapeFactory-Parameters
	 * This method also updates the internal shape, which is provided by @see getShape();
	 * @param nm
	 */
	public void setShapeParameters(NURBSCreationMessage nm);

	/**
	 * Get Shape for drawing, if not null, else null is returned
	 * @return
	 */
	public NURBSShape getShape();
}
