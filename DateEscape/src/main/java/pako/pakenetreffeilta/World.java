package pako.pakenetreffeilta;

import java.util.HashMap;
        

public class World {
    
    private HashMap<Coordinate, GameObject> locationsWithCollision;
    private HashMap<Coordinate, GameObject> locationsSansCollision;
    
    public World(){
        locationsWithCollision = new HashMap<>();
        this.createWorld();
    }
    
    public void createWorld(){
}
    
    public void moveObjectToXY(Coordinate coordinate, GameObject gameObject){
        if (!locationsWithCollision.containsKey(coordinate) && gameObject.occupiesSpace()) {
            this.locationsWithCollision.put(coordinate, gameObject);
        }
        else if (!gameObject.occupiesSpace()) {
            this.locationsSansCollision.put(coordinate, gameObject);
        }
    }
    
    public GameObject getGameObjectFromCoordinate(Coordinate coordinate){
        if (locationsWithCollision.containsKey(coordinate)) {
            return locationsWithCollision.get(coordinate);
        }
        if (locationsSansCollision.containsKey(coordinate)) {
            return locationsSansCollision.get(coordinate);
        }
        return null;
    }
}   
