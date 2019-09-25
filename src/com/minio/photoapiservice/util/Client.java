package com.minio.photoapiservice.util;

import io.minio.MinioClient;

public class Client {

	private static  Client SINGLE_INSTANCE = null;
	public  MinioClient minioClient; 
	
	private Client() {
		final String accessKey = "minio";
		final String secretKey = "minio123";
		final String ipPort = "http://172.19.0.1:9001";

		try {
			minioClient = new MinioClient(ipPort, accessKey, secretKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Client getInstance() {

		if (SINGLE_INSTANCE == null)
			SINGLE_INSTANCE = new Client();
		return SINGLE_INSTANCE;

	}
}
