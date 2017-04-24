/*
 * Copyright (c) 2017 XDWY503.
 */

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.cookie.CookiePolicy;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ios on 17/4/18.
 */
public class AutoOrder {
    private static final String WEB_LOGIN_COOKIE_STR = "webLogin=15353573285|9EA777EBCD6D7B618BF6300F092B454A";
    private static final String AID                  = "187688";
    private static final String PRODUCT_NO           = "5ED60113712761F2"; //五加仑08精品矿物质水
    private String     sessionCookieStr;
    private HttpClient httpClient;

    private static AutoOrder autoOrder = new AutoOrder();

    private AutoOrder() {
        httpClient = new HttpClient();
        httpClient.getParams().setCookiePolicy(CookiePolicy.BROWSER_COMPATIBILITY);
    }

    public static AutoOrder getInstance() {
        return autoOrder;
    }

    public static void main(String[] args) {
        AutoOrder autoOrder = new AutoOrder();
        autoOrder.getDate();
//        autoOrder.getTime("2017/4/21");
//        autoOrder.lastOrder();
    }


    private boolean addCar() {
        String     url  = "http://www.lianqi.net/User/AddCar/" + PRODUCT_NO;

        GetMethod get = new GetMethod(url);

        get.setRequestHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        get.setRequestHeader("Accept-Encoding", "gzip");
        get.setRequestHeader("Accept-Language", "zh-CN,zh;q=0.8");
        get.setRequestHeader("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36");
        get.setRequestHeader("Connection", "keep-alive");
        get.setRequestHeader("Upgrade-Insecure-Requests", "1");
        get.setRequestHeader("Host", "www.lianqi.net");
        get.setRequestHeader("Referer", "http://www.lianqi.net/");
        get.setRequestHeader("Cookie",  sessionCookieStr + "; " + WEB_LOGIN_COOKIE_STR);
        get.getParams().setContentCharset("UTF-8");
        int status = 0;
        try {
            status = httpClient.executeMethod(get);
        } catch (HttpException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            get.releaseConnection();
        }
        return status == 200;
    }

    private boolean confirmOrder() {
        String     url  = "http://www.lianqi.net/User/ConfirmOrder";

        GetMethod get = new GetMethod(url);

        get.setRequestHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        get.setRequestHeader("Accept-Encoding", "gzip");
        get.setRequestHeader("Accept-Language", "zh-CN,zh;q=0.8");
        get.setRequestHeader("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36");
        get.setRequestHeader("Connection", "keep-alive");
        get.setRequestHeader("Upgrade-Insecure-Requests", "1");
        get.setRequestHeader("Host", "www.lianqi.net");
        get.setRequestHeader("Referer", "http://www.lianqi.net/User/ShoppingCar");
        get.setRequestHeader("Pragma", "no-cache");
        get.setRequestHeader("Cache-Control", "no-cache");
        get.setRequestHeader("Cookie",  sessionCookieStr + "; " + WEB_LOGIN_COOKIE_STR);
        get.getParams().setContentCharset("UTF-8");

        int status = 0;
        try {
            status = httpClient.executeMethod(get);
        } catch (HttpException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            get.releaseConnection();
        }
        return status == 200;
    }

    private boolean saveOrder(String date, String time) {
        String     url  = "http://www.lianqi.net/User/SaveOrder";

        GetMethod get = new GetMethod(url);

        get.setRequestHeader("Accept", "*/*");
        get.setRequestHeader("Accept-Encoding", "gzip");
        get.setRequestHeader("Accept-Language", "zh-CN,zh;q=0.8");
        get.setRequestHeader("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36");
        get.setRequestHeader("Connection", "keep-alive");
        get.setRequestHeader("Upgrade-Insecure-Requests", "1");
        get.setRequestHeader("Host", "www.lianqi.net");
        get.setRequestHeader("Referer", "http://www.lianqi.net/User/ConfirmOrder");
        get.setRequestHeader("Cookie",  sessionCookieStr + "; " + WEB_LOGIN_COOKIE_STR);

        NameValuePair remark = new NameValuePair("remark", "");
        NameValuePair chooseDate = new NameValuePair("date", date);
        NameValuePair chooseTime = new NameValuePair("time", time);
        NameValuePair aid = new NameValuePair("aid", AID);
        NameValuePair telNum = new NameValuePair("telNum", "15353573285");
        NameValuePair year = new NameValuePair("year", "undefined");
        NameValuePair mounth = new NameValuePair("mounth", "undefined");
        NameValuePair day = new NameValuePair("day", "undefined");
        NameValuePair hour = new NameValuePair("hour", "undefined");
        NameValuePair minute = new NameValuePair("minute", "undefined");


        get.setQueryString(new NameValuePair[]{remark, chooseDate, chooseTime, aid, telNum, year, mounth, day, hour, minute});
        get.getParams().setContentCharset("UTF-8");

        int status = 0;
        try {
            status = httpClient.executeMethod(get);
            String body = GzipUtil.unGzipResponseBodyAsString(get);
            System.out.println(body);
        } catch (HttpException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            get.releaseConnection();
        }
        return status == 200;
    }

    /**
     * 必须在getDate之后调用
     * @return
     */
    public String lastOrder() {
        String     url  = "http://www.lianqi.net/User/Orders";
        GetMethod get = new GetMethod(url);

        get.setRequestHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        get.setRequestHeader("Accept-Encoding", "gzip, deflate, sdch");
        get.setRequestHeader("Accept-Language", "zh-CN,zh;q=0.8");
        get.setRequestHeader("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36");
        get.setRequestHeader("Connection", "keep-alive");
        get.setRequestHeader("Upgrade-Insecure-Requests", "1");
        get.setRequestHeader("Host", "www.lianqi.net");
        get.setRequestHeader("Referer", "http://www.lianqi.net/User/ShoppingCar");

        //这里一定要sessionCookie在前才行
        get.setRequestHeader("Cookie", sessionCookieStr + "; " + WEB_LOGIN_COOKIE_STR);
        get.getParams().setContentCharset("UTF-8");

        String lastOrderTime = "";
        try {
            int status = httpClient.executeMethod(get);
            String body = GzipUtil.unGzipResponseBodyAsString(get);
            assert body != null;
            lastOrderTime = parseLastOrderTime(body);
            //System.out.println(body);

        } catch (HttpException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            get.releaseConnection();
        }
        return lastOrderTime;
    }

    /**
     * 解析出上次订水的时间
     * @param body 返回的html
     * @return 上次订水的时间
     */
    private String parseLastOrderTime(String body) {
        int begin = body.indexOf("<tr class=\"Order2_20\"");
        int end = body.indexOf("<tr class=\"Order2_21\"");
        body = body.substring(begin, end);
        String[] tds = body.split("</td>");
        String td = tds[3].trim().replace("<td>","").replace("<br>", "  ");
        return td;
    }


    /**
     * 获取可以配送的日期
     * @return 可以配送的日期的List
     */
    public List<String> getDate() {
        String     url  = "http://www.lianqi.net/PublicAjax/GetDate";
        PostMethod post = new PostMethod(url);

        post.setRequestHeader("Accept", "*/*");
        post.setRequestHeader("Accept-Encoding", "gzip");
        post.setRequestHeader("Accept-Language", "zh-CN,zh;q=0.8");
        post.setRequestHeader("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36");
        post.setRequestHeader("Connection", "keep-alive");
        post.setRequestHeader("Upgrade-Insecure-Requests", "1");
        post.setRequestHeader("Content-Length", "0");
        post.setRequestHeader("Host", "www.lianqi.net");
        post.setRequestHeader("Origin", "http://www.lianqi.net");
        post.setRequestHeader("Referer", "http://www.lianqi.net/User/ConfirmOrder");
        post.setRequestHeader("X-Requested-With", "XMLHttpRequest");

        post.setRequestHeader("Cookie", WEB_LOGIN_COOKIE_STR);

        NameValuePair aid = new NameValuePair("aid", AID);
        NameValuePair k   = new NameValuePair("k", getKey());

        post.setQueryString(new NameValuePair[]{aid, k});
        post.getParams().setContentCharset("UTF-8");

        List<String> dateList = new ArrayList<String>();
        try {
            int status = httpClient.executeMethod(post);
            String body = GzipUtil.unGzipResponseBodyAsString(post);
            if (body != null) {
                String[] bodys = body.split(",");
                Collections.addAll(dateList, bodys);
            }
//            System.out.println(body);
            sessionCookieStr = post.getResponseHeader("Set-Cookie").getValue().split(";")[0];
        } catch (HttpException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            post.releaseConnection();
        }
        return dateList;
    }

    /**
     * 必须在getDate后调用
     * 获得这个日期可以配送的时间,
     * @param date 格式 yyyy/MM/dd
     */
    public List<String> getTime(String date) {

        String     url  = "http://www.lianqi.net/PublicAjax/GetTime";

        GetMethod get = new GetMethod(url);

        get.setRequestHeader("Accept", "*/*");
        get.setRequestHeader("Accept-Encoding", "gzip");
        get.setRequestHeader("Accept-Language", "zh-CN,zh;q=0.8");
        get.setRequestHeader("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36");
        get.setRequestHeader("Connection", "keep-alive");
        get.setRequestHeader("Upgrade-Insecure-Requests", "1");
        get.setRequestHeader("Content-Length", "0");
        get.setRequestHeader("Host", "www.lianqi.net");
        get.setRequestHeader("Referer", "http://www.lianqi.net/User/ConfirmOrder");
        get.setRequestHeader("X-Requested-With", "XMLHttpRequest");

        get.setRequestHeader("Cookie",  sessionCookieStr + "; " + WEB_LOGIN_COOKIE_STR);

        NameValuePair chooseDate = new NameValuePair("chooseDate", date);
        NameValuePair aid = new NameValuePair("aid", AID);
        NameValuePair isWeiXin = new NameValuePair("isWeiXin", "undefined");
        NameValuePair k   = new NameValuePair("k", getKey());

        get.setQueryString(new NameValuePair[]{chooseDate, aid, isWeiXin, k});
        get.getParams().setContentCharset("UTF-8");

        List<String> timeList = new ArrayList<String>();
        try {
            int status = httpClient.executeMethod(get);
            String body = GzipUtil.unGzipResponseBodyAsString(get);

            assert body != null;
            String[] bodys = body.split("</option>");
            for (int i = 1; i < bodys.length - 1; i++) {
                String time;
                if (bodys[i].contains("已约满")) {
                    continue;
                } else {
                    time = bodys[i].substring(bodys[i].length() - 11);
                }
                timeList.add(time);
            }

        } catch (HttpException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            get.releaseConnection();
        }
        return timeList;
    }

    private String getKey() {
        double numKey = Math.random();
        return String.valueOf(Math.round(numKey * 10000));
    }

    public boolean orderWater(String date, String time) {
        System.out.println("date:" + date + ", time:" + time);

        if (addCar())
            if (confirmOrder())
                return saveOrder(date, time);
        return false;
    }
}
