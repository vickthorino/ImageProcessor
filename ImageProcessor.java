import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 * @author Victor Marin
 */
public class ImageProcessor {
    private BufferedImage image;
    private int r,g,b;
    private Color color;
    public ImageProcessor(){}
     
    /* Invierte los bytes de una imagen */
    public void applyNegativeFilter(BufferedImage image){
    	this.image = image;
    	for(int i=0;i<image.getWidth();i++){
          	for(int j=0;j<image.getHeight();j++){
                	//se obtiene el color del pixel
                	color = new Color(foto.getRGB(i, j));
                	//se extraen los valores RGB
                	r = color.getRed();
                	g = color.getGreen();
                	b = color.getBlue();
                	//se coloca en la nueva imagen con los valores invertidos
                	foto.setRGB(i, j, new Color(255-r,255-g,255-b).getRGB());                                                                	
          	}
    	}    	
    }
    
    public BufferedImage getImage(){
    	return this.image;
    }  

}
