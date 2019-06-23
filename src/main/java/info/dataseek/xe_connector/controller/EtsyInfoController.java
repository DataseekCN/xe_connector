package info.dataseek.xe_connector.controller;

import java.util.LinkedList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

@RestController
@RequestMapping("/etsyInfo")
public class EtsyInfoController {
	public static Logger logger = LoggerFactory.getLogger(EtsyInfoController.class);
	public String apiKey = "1lsoolvyaayk4ce4evshlabj";

    @RequestMapping("/findAllShopListingsActive")
    public void findAllShopListingsActive() {
    	//TODO
    	//String shopId = "";
    	//String urlHead = "";
    	String shopId = "20286785";
    	String urlHead = "https://openapi.etsy.com/v2";
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
    		System.out.println("333=:" + jsonResult.getString("count"));
    	}
    	catch (Exception ex) {
    		System.out.println("findAllShopListingsActive error.");
    		logger.debug("findAllShopListingsActive error.", ex);
    	}
		

    }
}
