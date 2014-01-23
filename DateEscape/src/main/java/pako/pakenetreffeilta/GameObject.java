

package pako.pakenetreffeilta;

 abstract class GameObject {
    
     private String name;
     private Boolean collision; 
     
     public GameObject(String name, boolean collision){
         this.name = name;
         this.collision = collision;
     }
     
     public String getName(){
         return this.name;
     }
     
     public boolean occupiesSpace(){
         return this.collision;
     }
}
