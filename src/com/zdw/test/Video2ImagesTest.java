package com.zdw.test;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.imageio.ImageIO;

import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameGrabber.Exception;
import org.bytedeco.javacv.Java2DFrameConverter;

public class Video2ImagesTest {
	public static void main(String[] args) throws Exception {
		File file = new File("D:\\test\\test3.mp4");
        FFmpegFrameGrabber ff = FFmpegFrameGrabber.createDefault(file);
        ff.start();
        int ffLength = ff.getLengthInFrames();
        System.out.println(ffLength);
//        List<Integer> randomGrab = random(ffLength, 1);
//        int maxRandomGrab = randomGrab.get(randomGrab.size() - 1);
        Frame f;
        int i = 0;
        while (i < ffLength) {
            f = ff.grabImage();
//            if (randomGrab.contains(i)) {
                doExecuteFrame(f, "D:\\test\\images", i+"", i);
//            }
//            if (i >= maxRandomGrab) {
//                break;
//            }
            i++;
        }
        ff.stop();
		
	}
    public static void doExecuteFrame(Frame f, String targerFilePath, String targetFileName, int index) {
        if (null == f || null == f.image) {
            return;
        }
         
        Java2DFrameConverter converter = new Java2DFrameConverter();
 
        String imageMat = "jpg";
        String FileName = targerFilePath + File.separator + targetFileName + "_" + index + "." + imageMat;
        BufferedImage bi = converter.getBufferedImage(f);
        File output = new File(FileName);
        try {
            ImageIO.write(bi, imageMat, output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public static List<Integer> random(int baseNum, int length) {
 
        List<Integer> list = new ArrayList<Integer>(length);
        while (list.size() < length) {
            Integer next = (int) (Math.random() * baseNum);
            if (list.contains(next)) {
                continue;
            }
            list.add(next);
        }
        Collections.sort(list);
        return list;
    }
}
