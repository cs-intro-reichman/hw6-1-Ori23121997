import java.awt.Color;

import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;


public class Editor4 {
    public static void main (String[] args){
		String filename = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] imageIn  = Runigram.read(filename);
        Color[][] imageGray = Runigram.grayScaled(imageIn);
		Color[][] imageOut = null;
        Runigram.setCanvas(imageIn);
        Runigram.morph(imageIn, imageGray, n);	
	}
}