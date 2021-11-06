package com.example.springboottest.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName HtmlParseUtil.java
 * @Description TODO
 * @createTime 2021年09月18日 16:14:00
 */
public class HtmlParseUtil {

    public static void main(String[] args) throws IOException {
        HashMap<Object, Object> map = new HashMap<>();
        String url = "https://search.jd.com/Search?keyword=java";
        Document document = Jsoup.parse(new URL(url), 30000);
        Element element = document.getElementById("J_goodsList");
        Elements elements = element.getElementsByTag("li");
        for (Element el : elements) {
            String title = el.getElementsByClass("p-name").eq(0).text();
            String price = el.getElementsByClass("p-price").eq(0).text();
            System.out.println(title);
            System.out.println(price);
        }
    }

    public List<Object> parseGoods(String keyword){
        return null;
    }

}
