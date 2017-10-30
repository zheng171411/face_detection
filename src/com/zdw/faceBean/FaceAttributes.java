package com.zdw.faceBean;

import java.lang.reflect.Method;
import java.util.List;
import com.zdw.cal.LeftEyePoint;
import com.zdw.cal.MousePoint;
import com.zdw.cal.RightEyePoint;

public class FaceAttributes {
	String image_id;
	String request_id;
	String time_used;
	List<Face> faces;
	public String getImage_id() {
		return image_id;
	}
	public void setImage_id(String image_id) {
		this.image_id = image_id;
	}
	public String getRequest_id() {
		return request_id;
	}
	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}
	public String getTime_used() {
		return time_used;
	}
	public void setTime_used(String time_used) {
		this.time_used = time_used;
	}
	public List<Face> getFaces() {
		return faces;
	}
	public void setFaces(List<Face> faces) {
		this.faces = faces;
	}
	public String toString() {
		return "image_id:" + image_id + 
				"request_id:" + request_id + "time_used:" + time_used;
	}
	public LeftEyePoint getLeftEyePoint() {
		if (faces == null) {
			return null;
		}
		LeftEyePoint leftEyePoint = new LeftEyePoint();
		LandMark landMark = faces.get(0).getLandmark();
		if (landMark == null) {
			return null;
		}
		leftEyePoint.setLeft_eye_upper_left_quarter(landMark.getLeft_eye_upper_left_quarter());
		leftEyePoint.setLeft_eye_lower_left_quarter(landMark.getLeft_eye_lower_left_quarter());
		leftEyePoint.setLeft_eye_lower_right_quarter(landMark.getLeft_eye_lower_right_quarter());
		leftEyePoint.setLeft_eye_upper_right_quarter(landMark.getLeft_eye_upper_right_quarter());
		leftEyePoint.setLeft_eye_bottom(landMark.getLeft_eye_bottom());
		leftEyePoint.setLeft_eye_center(landMark.getLeft_eye_center());
		leftEyePoint.setLeft_eye_left_corner(landMark.getLeft_eye_left_corner());
		leftEyePoint.setLeft_eye_top(landMark.getLeft_eye_top());
		leftEyePoint.setLeft_eye_right_corner(landMark.getLeft_eye_right_corner());
		leftEyePoint.setLeft_eye_pupil(landMark.getLeft_eye_pupil());
		return leftEyePoint;
	}
	public RightEyePoint getRightEyePoint() {
		if (faces == null) {
			return null;
		}
		RightEyePoint rightEyePoint = new RightEyePoint();
		LandMark landMark = faces.get(0).getLandmark();
		if (landMark == null) {
			return null;
		}
		rightEyePoint.setRight_eye_upper_left_quarter(landMark.getRight_eye_upper_left_quarter());
		rightEyePoint.setRight_eye_lower_right_quarter(landMark.getRight_eye_lower_right_quarter());
		rightEyePoint.setRight_eye_lower_left_quarter(landMark.getRight_eye_lower_left_quarter());
		rightEyePoint.setRight_eye_upper_right_quarter(landMark.getRight_eye_upper_right_quarter());
		rightEyePoint.setRight_eye_bottom(landMark.getRight_eye_bottom());
		rightEyePoint.setRight_eye_center(landMark.getRight_eye_center());
		rightEyePoint.setRight_eye_left_corner(landMark.getRight_eye_left_corner());
		rightEyePoint.setRight_eye_pupil(landMark.getRight_eye_pupil());
		rightEyePoint.setRight_eye_right_corner(landMark.getRight_eye_right_corner());
		rightEyePoint.setRight_eye_top(landMark.getRight_eye_top());
		return rightEyePoint;
	}
	public MousePoint getMousePoint() {
		if (faces == null) {
			return null;
		}
		MousePoint mousePoint = new MousePoint();
		LandMark landMark = faces.get(0).getLandmark();
		if (landMark == null) {
			return null;
		}
		mousePoint.setMouth_lower_lip_left_contour2(landMark.getMouth_lower_lip_left_contour2());
		mousePoint.setMouth_lower_lip_right_contour2(landMark.getMouth_lower_lip_right_contour2());
		mousePoint.setMouth_lower_lip_left_contour3(landMark.getMouth_lower_lip_left_contour3());
		mousePoint.setMouth_lower_lip_left_contour1(landMark.getMouth_lower_lip_left_contour1());
		mousePoint.setMouth_lower_lip_right_contour1(landMark.getMouth_lower_lip_right_contour1());
		mousePoint.setMouth_lower_lip_right_contour3(landMark.getMouth_lower_lip_right_contour3());
		mousePoint.setMouth_upper_lip_left_contour1(landMark.getMouth_upper_lip_left_contour1());
		mousePoint.setMouth_upper_lip_left_contour2(landMark.getMouth_upper_lip_left_contour2());
		mousePoint.setMouth_upper_lip_top(landMark.getMouth_upper_lip_top());
		mousePoint.setMouth_left_corner(landMark.getMouth_left_corner());
		mousePoint.setMouth_upper_lip_bottom(landMark.getMouth_upper_lip_bottom());
		mousePoint.setMouth_lower_lip_bottom(landMark.getMouth_lower_lip_bottom());
		mousePoint.setMouth_right_corner(landMark.getMouth_right_corner());
		mousePoint.setMouth_lower_lip_top(landMark.getMouth_lower_lip_top());
		mousePoint.setMouth_upper_lip_right_contour3(landMark.getMouth_upper_lip_right_contour3());
		mousePoint.setMouth_upper_lip_right_contour1(landMark.getMouth_upper_lip_right_contour1());
		mousePoint.setMouth_upper_lip_right_contour2(landMark.getMouth_upper_lip_right_contour2());
		mousePoint.setMouth_upper_lip_left_contour3(landMark.getMouth_upper_lip_left_contour3());
		return mousePoint;
	}
	public static void main(String[] args) {
		Method[] list = LeftEyePoint.class.getDeclaredMethods();
		System.out.println(list.length);
		for (Method method : list) {
			if (method.getName().contains("set")) {
//				System.out.println("leftEyePoint."
//						+ method.getName()
//						+ "(" + "landMark.g" 
//						+ method.getName().substring(1)
//						+ "()"
//						+ ");");
				System.out.println(method.getName().substring(3).toLowerCase());
			}
		}
		Method[] list2 = RightEyePoint.class.getDeclaredMethods();
		System.out.println(list2.length);
		for (Method method : list2) {
			if (method.getName().contains("set")) {
				System.out.println("rightEyePoint."
						+ method.getName()
						+ "(" + "landMark.g" 
						+ method.getName().substring(1)
						+ "()"
						+ ");");
			}
		}
		Method[] list3 = MousePoint.class.getDeclaredMethods();
		System.out.println(list3.length);
		for (Method method : list3) {
			if (method.getName().contains("set")) {
//				System.out.println("mousePoint."
//						+ method.getName()
//						+ "(" + "landMark.g" 
//						+ method.getName().substring(1)
//						+ "()"
//						+ ");");
				System.out.println(method.getName().substring(3).toLowerCase());
			}
		}
	}
}
