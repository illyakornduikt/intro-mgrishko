package object;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class OBJ_Boots extends SuperObject{
    public OBJ_Boots() {
        name = "Boots";
        try {
            image = ImageIO.read(new File("application/res/objects/boots.png"));
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}