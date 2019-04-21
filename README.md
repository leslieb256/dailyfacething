# Breadcumb
The code there is working so far - have a look at the controller, I think the next thing to do is look at how to load an image that is compatible with
OpenCV detection

# Compile and Execute
javac -cp .:/usr/share/OpenCV/java/opencv-248.jar HelloCV.java 
java -cp .:/usr/share/OpenCV/java/opencv-248.jar HelloCV

# Tutorials
https://opencv-java-tutorials.readthedocs.io/en/latest/02-first-java-application-with-opencv.html
https://github.com/opencv-java/face-detection/blob/master/src/it/polito/teaching/cv/FaceDetectionController.java

# Notes
You might get this error: libdc1394 error: Failed to initialize libdc1394
Apparently it is a driver for camera hardware which I am not using so should not be an issue

