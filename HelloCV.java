import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;
import org.opencv.objdetect.CascadeClassifier;

/**
 * 
 * Load the Haar Cascade for face detection
 * Using Haar as apparently more accurate than LBP
 * 
 */

public class HelloCV {

    public static void main(String[] args){
        // Check if OpenCV library is available
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Mat mat = Mat.eye(3, 3, CvType.CV_8UC1);
        System.out.println("mat = " + mat.dump());
        
        // face cascade classifier
        CascadeClassifier faceCascade;
        int absoluteFaceSize;
        String classifierPath;
        
        faceCascade = new CascadeClassifier();
        absoluteFaceSize = 0;
        classifierPath = "resources/haarcascades/haarcascade_frontalface_alt.xml";
        
        // Load the Haar Cascade Classifier
        faceCascade.load(classifierPath);
        System.out.println("Face detection cascade loaded from: " + classifierPath);
         
        // Load image and convert to greyscale
        // OpenCV 2.x   
        
        String imagePath = "EC60031.JPG";
        Mat img = Highgui.imread("EC60031.JPG", Highgui.CV_LOAD_IMAGE_GRAYSCALE);
        System.out.println("image loaded");
        
        // OpenCV 3.x
        // Mat img = Imgcodecs.imread("path/to/img", Imgcodecs.CV_LOAD_IMAGE_GRAYSCALE);
        
        FROM HERE
        // MIGHT HAVE TO ROTATE IMAGE - CAN WE RAD OUT THE DIRECTION FROM EXIF?
        // CALC HOW BIG THE FCE SHOUDL BE (@ NOMINAL 20% of FRAME) - set facesize attrib
        // DETECT THE FACE/EYES
        // work out the transforms (rotate, crop, resize)
        // fill void with an average colour or just grey or a zoomed in version heavily blurred.
         
    }
}