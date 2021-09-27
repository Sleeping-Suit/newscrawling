package com.cos.newscrawling.batch;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

// 주소: https://news.naver.com/main/read.naver?mode=LSD&mid=shm&sid1=100&oid=003&aid=0000000001
public class NaverCrawTest {

	// @Test
	public void test1() {
		RestTemplate rt = new RestTemplate();
		
		String url = "https://news.naver.com/main/read.naver?mode=LSD&mid=shm&sid1=100&oid=003&aid=0000000001";
		
		String html = rt.getForObject(url, String.class);
		System.out.println(html);
		
		// Jsoup로 ArticleTitle 파싱
		Document doc = Jsoup.parse(html);
		
		Element titleElement = doc.selectFirst("#articleTitle");
		String title = titleElement.text();
		
		System.out.println(title);
	}
	
	// @Test
	public void test2() {
		for (int i = 1; i < 11; i++) {
			System.out.println(String.format("%010d", i));
		}
	}
}
