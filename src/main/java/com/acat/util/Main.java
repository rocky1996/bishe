package com.acat.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {

    public static void main(String[] args){

        System.out.println(Main.getWebIp());

    }


    public static String getWebIp() {
        try {

            URL url = new URL("http://iframe.ip138.com/ic.asp");

            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

            String s = "";

            StringBuffer sb = new StringBuffer("");

            String webContent = "";

            while ((s = br.readLine()) != null) {
                sb.append(s + "\r\n");

            }

            br.close();
            webContent = sb.toString();
            int start = webContent.indexOf("[")+1;
            int end = webContent.indexOf("]");
            webContent = webContent.substring(start,end);

            return webContent;

        } catch (Exception e) {
            e.printStackTrace();
            return "error";

        }
    }
}
