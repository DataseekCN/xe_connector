package info.dataseek.xe_connector.controller;

import java.util.LinkedList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

@RestController
@RequestMapping("/etsyInfo")
public class EtsyInfoController {
	public static Logger logger = LoggerFactory.getLogger(EtsyInfoController.class);
	//TODO
	private String apiKey = "78qwl864ty5269f469svn6md";
	private String urlHead = "https://openapi.etsy.com/v2";
	
	@RequestMapping("/getShop")
    public void getShop() {		
    	String shopName = "DataseekDevs";
    	String url = urlHead + "/shops/" + shopName;
    	try {
    		//添加get方式的参数
        	URIBuilder uriBuilder = new URIBuilder(url);
        	List<NameValuePair> list = new LinkedList<>();
            BasicNameValuePair param1 = new BasicNameValuePair("api_key", apiKey);
            list.add(param1);
            uriBuilder.setParameters(list);
            //调用及返回处理
    		HttpGet httpGet = new HttpGet(uriBuilder.build());
    		CloseableHttpClient httpclient = HttpClients.createDefault();
    		HttpResponse response = httpclient.execute(httpGet);
    		HttpEntity entity = response.getEntity();
    		String body = EntityUtils.toString(entity);
    		JSONObject jsonResult = JSONObject.parseObject(body);
    		JSONArray resultAy = jsonResult.getJSONArray("results");
    		System.out.println("shop_id=" + resultAy.getJSONObject(0).getString("shop_id"));
    	}
    	catch (Exception ex) {
    		System.out.println("getShop error.");
    		logger.debug("getShop error.", ex);
    	}
		

    }
	
    @RequestMapping("/findAllShopListingsActive")
    public void findAllShopListingsActive() {
    	String shopId = "20515463";
    	CloseableHttpClient httpclient = HttpClients.createDefault();
    	String url = urlHead + "/shops/" + shopId + "/listings/active";
    	try {
    		//添加get方式的参数
        	URIBuilder uriBuilder = new URIBuilder(url);
        	List<NameValuePair> list = new LinkedList<>();
            BasicNameValuePair param1 = new BasicNameValuePair("api_key", apiKey);
            list.add(param1);
            uriBuilder.setParameters(list);
            //调用及返回处理
    		HttpGet httpGet = new HttpGet(uriBuilder.build());
    		HttpResponse response = httpclient.execute(httpGet);
    		HttpEntity entity = response.getEntity();
    		String body = EntityUtils.toString(entity);
    		JSONObject jsonResult = JSONObject.parseObject(body);
    		JSONArray resultAy = jsonResult.getJSONArray("results");
    		System.out.println("user_id=" + resultAy.getJSONObject(0).getString("user_id"));
    	}
    	catch (Exception ex) {
    		System.out.println("findAllShopListingsActive error.");
    		logger.debug("findAllShopListingsActive error.", ex);
    	}
		

    }
}
