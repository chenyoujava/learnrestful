package com.example.annotation.method;

public class EBookResourceImpl implements BookResource {

	@Override
	public String getWeight() {
		return "150M";
	}
}
