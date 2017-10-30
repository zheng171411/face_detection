package com.zdw.test;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zdw.faceBean.Coordinate;
import com.zdw.faceBean.Face;
import com.zdw.faceBean.FaceAttributes;
import com.zdw.faceBean.LandMark;

public class JacksonTest {
	public static void main(String[] args) throws JsonProcessingException {
		Coordinate coordinate = new Coordinate();
//		coordinate.setX(123);
//		coordinate.setY(321);
		LandMark landMark = new LandMark();
		Face face = new Face();
		face.setLandmark(landMark);
		FaceAttributes attributes = new FaceAttributes();
		List<Face> faces = new ArrayList<Face>();
		faces.add(face);
		attributes.setFaces(faces);
		ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(attributes);  
        System.out.println(json); 
	}
}
