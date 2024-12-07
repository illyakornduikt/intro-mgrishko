package object;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class OBJ_Key extends SuperObject{

    public OBJ_Key() {
        name = "Key";
        try {
            image = ImageIO.read(new File("application/res/objects/key.png"));
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}