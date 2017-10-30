package com.zdw.faceBean;

public class Face {
	LandMark landmark;
	String face_token;
	Attributes attributes;
	FaceRectangle face_rectangle;
	public LandMark getLandmark() {
		return landmark;
	}

	public void setLandmark(LandMark landmark) {
		this.landmark = landmark;
	}

	public String getFace_token() {
		return face_token;
	}

	public void setFace_token(String face_token) {
		this.face_token = face_token;
	}

	public Attributes getAttributes() {
		return attributes;
	}

	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	public FaceRectangle getFace_rectangle() {
		return face_rectangle;
	}

	public void setFace_rectangle(FaceRectangle face_rectangle) {
		this.face_rectangle = face_rectangle;
	}
	
}
