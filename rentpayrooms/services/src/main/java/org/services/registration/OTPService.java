package org.services.registration;

import java.io.IOException;
import java.security.SecureRandom;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Service
public class OTPService {
	private Map<String, OTP> otpCache=new HashMap<>();
	@Autowired
	RestTemplate restTemplate= new RestTemplate();
	
	private class OTP{
		private Timestamp otpExpiryTime;
		private int otpValue;
		
		public OTP(Timestamp otpExpiryTime, int otpValue) {
			super();
			this.otpExpiryTime = otpExpiryTime;
			this.otpValue = otpValue;
		}
		public Timestamp getOtpExpiryTime() {
			return otpExpiryTime;
		}
		public void setOtpExpiryTime(Timestamp otpExpiryTime) {
			this.otpExpiryTime = otpExpiryTime;
		}
		public int getOtpValue() {
			return otpValue;
		}
		public void setOtpValue(int otpValue) {
			this.otpValue = otpValue;
		}
	}
	
	
	
	public void sendOtp(String mobileNo) {
		OkHttpClient client = new OkHttpClient();
		
		int otp=8899;
		
		String authKey="d7e2dfacb37079e19bd19ce330e9b1";
		String message="Hey, Your one time password of rentpayrooms is "+otp;
		
		
		Request request = new Request.Builder()
		  .url("http://text.oriolinfotech.com/rest/services/sendSMS/sendGroupSms?AUTH_KEY="+authKey+"&message="+message+"&senderId=DEMOOS&routeId=1&mobileNos=7000899621&smsContentType=english")
		  .get()
		  .addHeader("Cache-Control", "no-cache")
		  .build();


		try {
			Response response = client.newCall(request).execute();
			System.out.println(response.code());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void send() {
		String requestUrl=null;
		ResponseEntity<?> response=null;
		String providerUrl="http://text.oriolinfotech.com/rest/services/sendSMS/sendGroupSms";
		String apiKey="e262473ec8c690d368224ddfc95d96ae";
		int upperBound=999999;
		int lowerBound=111111;
		int otp=new SecureRandom().nextInt(upperBound-lowerBound)+lowerBound;
		String message="Hey, Your one time password of rentpayrooms is "+otp;
		String sender="samsft";
		String mobileNumber="9849500143";
		
		requestUrl=providerUrl+"?AUTH_KEY="+apiKey+"&message="+message+"&senderId="+sender+"&routeId=3&mobileNos="+mobileNumber+"&smsContentType=english";
		response=restTemplate.getForEntity(requestUrl, String.class);
		System.out.println(response);
		if(response.getStatusCode()==HttpStatus.OK) {
			OTP obj=new OTP(new Timestamp(System.currentTimeMillis()), otp);
			otpCache.put(mobileNumber, obj);
		}
	}
	
	public void validateOtp(String mobileNo,int otp) {
		if(otpCache.containsKey(mobileNo)) {
			OTP otpObj=otpCache.get(mobileNo);
			Timestamp fromTime=otpObj.getOtpExpiryTime();
			Timestamp toTime=new Timestamp(System.currentTimeMillis()+TimeUnit.MINUTES.toMillis(5));
			
			if(fromTime.before(toTime)) {
				
			}
		}
	}
	
	
	public static void main(String[] args) {
		OTPService s=new OTPService();
		//s.sendOtp("");
		s.send();
	}
}
