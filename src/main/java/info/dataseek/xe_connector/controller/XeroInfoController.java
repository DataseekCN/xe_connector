package info.dataseek.xe_connector.controller;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;

@RestController
@RequestMapping("/xeroInfo")
public class XeroInfoController {
	public static Logger logger = LoggerFactory.getLogger(XeroInfoController.class);
	//TODO
	private String apiKey = "78qwl864ty5269f469svn6md";
	private String urlHead = "https://api.xero.com/api.xro/2.0/Items";
	
	@RequestMapping("/postItems")
    public void getShop() {		
    	try {
    	    //post json
    		JSONObject jsonParam = new JSONObject();
    		jsonParam.put("Code", "Merino-2011-LG");
    		jsonParam.put("Name", "Full Tracked Item");
    		jsonParam.put("Description", "2011 Merino Sweater - LARGE");
    		jsonParam.put("PurchaseDescription", "2011 Merino Sweater - LARGE");
    		JSONObject jsonParam1 = new JSONObject();
    		jsonParam1.put("UnitPrice", "149.0000");
    		jsonParam1.put("AccountCode", "300");
    		JSONObject jsonParam2 = new JSONObject();
    		jsonParam2.put("UnitPrice", "299.0000");
    		jsonParam2.put("AccountCode", "200");
    		jsonParam.put("PurchaseDetails", jsonParam1);
    		jsonParam.put("SalesDetails", jsonParam2);
    		
    		HttpPost httpPost = new HttpPost(urlHead);
    		StringEntity jentity = new StringEntity(jsonParam.toString(),"utf-8");//解决中文乱码问题    
    		jentity.setContentEncoding("UTF-8");    
    		jentity.setContentType("application/json");
    		httpPost.setEntity(jentity);

    		//oauth认证处理
    		OAuthConsumer consumer = new CommonsHttpOAuthConsumer("LDBRBHR5AG9V6SMCUEC2LA7CSEKS5D", 
    				"JGU0GUUSARB79MSZWH8RE7UWUGFUJI");
    		consumer.setTokenWithSecret("LL9KEVAV3NIXPC0YOGYUGORN0Y9JMH", "W9IASQOIDOFO6TYD9A2YIUMXWPJYYO");
    		consumer.sign(httpPost);
    		
            //调用及返回处理
    		CloseableHttpClient httpclient = HttpClients.createDefault();
    		HttpResponse response = httpclient.execute(httpPost);
    		HttpEntity entity = response.getEntity();
    		String body = EntityUtils.toString(entity);
    		
            Document document = DocumentHelper.parseText(body);
            Element root = document.getRootElement();
    		System.out.println("Status=" + root.elementText("Status"));
    	}
    	catch (Exception ex) {
    		System.out.println("postItems error.");
    		logger.debug("postItems error.", ex);
    	}
		

    }

}
