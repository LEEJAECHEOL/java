package sms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsData {
	private int id; // 번호
	private String text; //	내용
	private String to;	// 받는 사
	private int errorCode;	// 에러코
	private String sendTime;	// 보낸시
}
