package Unit16; 
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void keepOnlyBlue() {
	  Pixel[][] pixels = this.getPixels2D(); 
	  for (Pixel[] rowArray : pixels) {
		  for (Pixel pixel10bj : rowArray) {
			  pixel10bj.setRed(0);
			  pixel10bj.setGreen(0);
		  }
	  }
  }
  
  public void negate() {
	  Pixel[][] pixels = this.getPixels2D(); 
	  for (Pixel[] rowArray : pixels) {
		  for (Pixel pixel10bj : rowArray) {
			  pixel10bj.setRed(255-pixel10bj.getRed());
			  pixel10bj.setGreen(255-pixel10bj.getGreen());
			  pixel10bj.setGreen(255-pixel10bj.getBlue());
		  }
	  }
  }
  
  public void grayscale() {
	  Pixel[][] pixels = this.getPixels2D(); 
	  for (Pixel[] rowArray : pixels) {
		  for (Pixel pixel10bj : rowArray) {
			  pixel10bj.setRed((pixel10bj.getRed() + pixel10bj.getGreen() + pixel10bj.getBlue())/3);
			  pixel10bj.setGreen((pixel10bj.getRed() + pixel10bj.getGreen() + pixel10bj.getBlue())/3);
			  pixel10bj.setGreen((pixel10bj.getRed() + pixel10bj.getGreen() + pixel10bj.getBlue())/3);
		  }
	  }
  }
  
  
  public void fixUnderwater(){
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	    	if(pixelObj.getRed() <= 20 && pixelObj.getBlue() >= 150){
	    		pixelObj.setGreen(255);
		        pixelObj.setRed(0);
		        pixelObj.setBlue(0);
	    	}
	    	else{
		        pixelObj.setBlue(255);
	    	}
	      }
	    }
  }
  
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }

  public void mirrorVerticalRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int height = pixels.length;
    for (int row = 0; row < height / 2; row++)
    {
      for (int col = 0; col < pixels[0].length; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[height-1-row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontalBotToTop()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int height = pixels.length;
    for (int row = 0; row < height / 2; row++)
    {
      for (int col = 0; col < pixels[0].length; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[height-1-row][col];
        topPixel.setColor(bottomPixel.getColor());
      }
    } 
  }
  
  public void mirrorDiagonal() {
	Pixel[][] pixels = this.getPixels2D();
	Pixel leftDiag = null;
	Pixel rightDiag = null;
	for (int row = 0; row < pixels.length; row++) {
		for (int col = 0; col < pixels.length; col++) {
			leftDiag = pixels[row][col];
			rightDiag = pixels[col][row];
			leftDiag.setColor(rightDiag.getColor());
		}
	}
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        count = count + 1; 
      }
    }
    System.out.println(count);
  }
  
  public void mirrorArms()
  {
    int mirrorPoint = 195;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 158; row < mirrorPoint; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 101; col < 294; col++)
      {
        topPixel = pixels[row][col];      
        bottomPixel = pixels[mirrorPoint - row + mirrorPoint]                       
                         [col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
  }
  
  public void mirrorGull()
  {
    int mirrorPoint = 346;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 231; row < 323; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 234; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  public void copyTwo(Picture fromPic, 
          int placeRow, int placeCol, int sRow, int eRow, int sCol, int eCol)
  {
	    Pixel fromPixel = null;
	    Pixel toPixel = null;
	    Pixel[][] toPixels = this.getPixels2D();
	    Pixel[][] fromPixels = fromPic.getPixels2D();
	    for (int fromRow = sRow, toRow = placeRow; 
	         fromRow < eRow &&
	         toRow < toPixels.length; 
	         fromRow++, toRow++)
	    {
	      for (int fromCol = sCol, toCol = placeCol; 
	           fromCol < eCol &&
	           toCol < toPixels[0].length;  
	           fromCol++, toCol++)
	      {
	        fromPixel = fromPixels[fromRow][fromCol];
	        toPixel = toPixels[toRow][toCol];
	        toPixel.setColor(fromPixel.getColor());
	      }
	    }   
	  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
	  	Picture flower1 = new Picture("flower1.jpg");
	    Picture flower2 = new Picture("flower2.jpg");
	    this.copy(flower1,0,0);
	    this.copy(flower2,100,0);
	    this.copy(flower1,200,0);
	    Picture flowerNoBlue = new Picture(flower2);
	    flowerNoBlue.zeroBlue();
	    this.copy(flowerNoBlue,300,0);
	    this.copy(flower1,400,0);
	    this.copy(flower2,500,0);
	    this.mirrorVertical();
	    this.write("collage.jpg");
  }
  
  public void createCollageTwo()
  {
	  Picture flower1 = new Picture("flower1.jpg");
	  this.copyTwo(flower1,100,20,10,100,50,70);
	  this.write("collage.jpg");
  }
  
  public void myCollage() {
	 Picture snowman = new Picture("snowman.jpg");
	 Picture barb = new Picture("barbaraS.jpg");
	 Picture swan = new Picture("swan.jpg");
	 
	 snowman.keepOnlyBlue();
	 barb.negate();
	 swan.zeroBlue();
	 
	 this.copyTwo(snowman, 266, 123, 78, 162, 160, 242); 
	 this.copyTwo(barb, 100, 40, 50, 64, 41, 84);
	 this.copyTwo(swan, 300, 38, 66, 108, 310, 392);
	 this.mirrorVertical();
	 this.write("collage.jpg");
	 
  }

  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  public void edgeDetectionTwo(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    Color bottomColor = null;
    for (int row = 0; row < pixels.length-1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        bottomPixel = pixels[row+1][col];
        rightColor = rightPixel.getColor();
        bottomColor = bottomPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        if (leftPixel.colorDistance(bottomColor) > edgeDist)
        	leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  public void edgeDetectionThree(int edgeDist)
  {
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    Pixel topPixel = null;
	    Pixel[][] pixels = this.getPixels2D();
	    Color rightColor = null;
	    Color topColor = null;
	    for (int row = 1; row < pixels.length; row++)
	    {
	      for (int col = 0; 
	           col < pixels[0].length-1; col++)
	      {
	        leftPixel = pixels[row][col];
	        rightPixel = pixels[row][col+1];
	        topPixel = pixels[row-1][col];
	        rightColor = rightPixel.getColor();
	        topColor = topPixel.getColor();
	        if (leftPixel.colorDistance(rightColor) > 
	            edgeDist) 
	          leftPixel.setColor(Color.WHITE);
	        if (leftPixel.colorDistance(topColor) > edgeDist)
	          leftPixel.setColor(Color.WHITE);
//	        if (leftPixel.colorDistance(rightColor) > 
//            edgeDist && leftPixel.colorDistance(topColor) > edgeDist)
//              leftPixel.setColor(Color.BLACK);
	        else
	          leftPixel.setColor(Color.BLACK);
	      }
	    }
	  }
   
  public void blur(int x, int y, int width, int height)
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel p = null;
	  Pixel rightPixel = null;
	  Pixel bottomPixel = null;
	  
	  for (int row = y; row < y + height - 3; row++)
	  {
	    for (int col = x; col < x + width - 3; col++)
	    {
	    	p = pixels[row][col];
	    	
	    	int one = col + 1;
	    	int two = row + 1;
	    	
	    	rightPixel = pixels[row][one];
	    	bottomPixel = pixels[two][col];
	    	
	    	while (rightPixel.getColor() == p.getColor()){
	    		
	    		rightPixel = pixels[row][one];
	    		one++;
	    	} 
	    	while (bottomPixel.getColor() == p.getColor()){
	    		
		    	bottomPixel = pixels[two][col];
	    		two++;
	    	}
	    	
	    	int avgRed = (p.getRed() + rightPixel.getRed() + bottomPixel.getRed()) / 3;
	    	int avgBlue = (p.getBlue() + rightPixel.getBlue() + bottomPixel.getBlue()) / 3;
	    	int avgGreen = (p.getGreen() + rightPixel.getGreen() + bottomPixel.getGreen()) / 3;
	    	
	    	p.setRed(avgRed);
	    	p.setBlue(avgBlue);
	    	p.setGreen(avgGreen);
	    	
	    	rightPixel.setRed(avgRed);
	    	rightPixel.setBlue(avgBlue);
	    	rightPixel.setGreen(avgGreen);
	    	
	    	bottomPixel.setRed(avgRed);
	    	bottomPixel.setBlue(avgBlue);
	    	bottomPixel.setGreen(avgGreen);
	    }
	  }
  }
 
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
