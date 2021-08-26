
package transformaciones3d;

import com.aun.j3d.utils.geometry.Color.Cube;
import com.aun.j3d.utils.universe.SimpleUniverse;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.logging.Level;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Transform3D;

public class Transformaciones3D implements PropertyChangeListener {
    
    SimpleUniverse universe = new SimpleUniverse();
    BranchGroup group = new BreanchGroup();
    ColorCube cube = new ColorCube(0.3);
    TransformGroup GT = new TransformGroup();
    Thread hilo = new Thread(this);
    
    
    double Y = 0; 
                    
  
    public Transformaciones3D() {
        hilo.start():
        
        GT.setCapabilitu(TransformeGroup.ALLOW_TRANSFORM_WRITE);
         
        GT.serTransform(transform);
        
        GT.addChild(cube);
        
        group.addChild(GT);
        
        universe.getViewingPlatform().setNominalViewingTransform();
        
        universe.addBrnchGraph(group);
        
    }
    
    public static void main(String[] arga) {
        
        new Cube3D();
        
    }
    
    public void run(){
        try {
           Y = Y+0.1;
           transform.rotX(Y);
           GT.secTransform(transform);
           Thread.sleep(10);
           
        }
        
        catch(InterruptedException ex) {
            Logger.getLogger(Transformaciones3D.class.getName()).log(Level.SEVERE, null,ex);
            
        }
        
            
    }
    
}
