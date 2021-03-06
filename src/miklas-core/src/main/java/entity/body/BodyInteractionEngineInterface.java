package entity.body;

import java.util.ArrayList;

import ch.aplu.jgamegrid.Location;
import entity.EntityInterface;

/**
 * @author wendt
 * 
 * This interface
 *
 */
public interface BodyInteractionEngineInterface {
	public void init(Body body);
	public void setMyDirection(double direction);
	public void setMyLocation(Location newLocation);
	public Location getMyLocation();
	public Location getNeighborLocationOfMyDirection();
	public double getMyDirection();
	public ArrayList<EntityInterface> getEntityAtLocation(Location poLocation);
	public EntityInterface getTopEntity(ArrayList<EntityInterface> oEntityList);
}
