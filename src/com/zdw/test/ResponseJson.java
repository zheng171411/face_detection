package com.zdw.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zdw.faceBean.FaceAttributes;

public class ResponseJson {
	public static void main(String[] args) throws IOException {
		long cur = System.currentTimeMillis();
		File file = new File("C:\\Users\\zdw\\Desktop\\test.txt");
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						new FileInputStream(file),"utf-8"));
		System.out.println(System.currentTimeMillis() - cur);
		String data = null;
		String res = "";
		while ((data = br.readLine()) != null) {
			res += data;	
//			java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("(\")(.*?)(\")");
//			Matcher matcher = pattern.matcher(data);
//			while (matcher.find()) {
//				String string = matcher.group(2);
//				if (!string.equals("x") && !string.equals("y")) {
//					System.out.println("Coordinate " + matcher.group(2) + ";");	
//				}
//			}
		}
		System.out.println(System.currentTimeMillis() - cur);
		res = res.replace(" ", "");
		//System.out.println(res.length());
		ObjectMapper mapper = new ObjectMapper();
		FaceAttributes faceAttributes = mapper.readValue(res, FaceAttributes.class);
		System.out.println(faceAttributes.getRightEyePoint().getRight_eye_center().toString());
		System.out.println(faceAttributes.getLeftEyePoint().getLeft_eye_center().toString());
		System.out.println(System.currentTimeMillis() - cur);
	}
}

