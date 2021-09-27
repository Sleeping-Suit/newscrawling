package com.cos.newscrawling.batch;

import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

// 주소: https://news.naver.com/main/read.naver?mode=LSD&mid=shm&sid1=100&oid=003&aid=0000000001
public class NaverCrawTest {

	@Test
	public void test1() {
		RestTemplate rt = new RestTemplate();
		
		String url = "https://news.naver.com/main/read.naver?mode=LSD&mid=shm&sid1=100&oid=003&aid=0000000001";
		
		String html = rt.getForObject(url, String.class);
		System.out.println(html);
	}
}
