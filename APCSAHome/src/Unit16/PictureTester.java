package Unit16; 
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
  public static void testNegate() {
	Picture beach = new Picture("beach.jpg");
	beach.explore();
	beach.negate();
	beach.explore();
  }
  
  public static void testGrayscale() {
	Picture beach = new Picture("beach.jpg");
	beach.explore();
	beach.grayscale();
	beach.explore();
  }
  
  public static void testFixUnderwater() { 
	Picture water = new Picture("water.jpg");
	water.explore();
	water.fixUnderwater();
	water.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }
  
  public static void testMirrorDiagonal()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.mirrorDiagonal();
    beach.explore();
  }
  
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms() {
	Picture snowman = new Picture("snowman.jpg");
	snowman.explore();
	snowman.mirrorArms();
	snowman.explore();
  }
  
  public static void testMirrorGull() {
	Picture snowman = new Picture("seagull.jpg");
	snowman.explore();
	snowman.mirrorGull();
	snowman.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testCollageTwo()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollageTwo();
    canvas.explore();
  }
  
  public static void testMyCollage()
  {
    Picture canvas = new Picture("hawaii.jpg");
    canvas.myCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2() {
	Picture swan = new Picture("swan.jpg");
	swan.edgeDetectionTwo(10);
	swan.explore();
  }
  
  public static void testEdgeDetection3() {
	Picture swan = new Picture("swan.jpg");
	swan.edgeDetectionThree(10);
	swan.explore();
  }
  
  
	public static void testBlur()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.blur(125, 120, 290, 230);
		beach.explore();
		beach.blur(42, 52, 260, 180);
		beach.explore();
	}
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal(); 
	//testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCollageTwo(); 
	//testMyCollage();
	//testAvg();
	testBlur(); 
    //testCopy();
    //testEdgeDetection();
	//testEdgeDetection2();
    //testEdgeDetection3(); 
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}