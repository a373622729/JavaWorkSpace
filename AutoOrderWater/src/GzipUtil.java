/*
 * Copyright (c) 2017 XDWY503.
 */

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpMethodBase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;

/**
 * Created by ios on 17/4/20.
 */
public class GzipUtil {
    /**
     * 解压传递过来的ResponseBodyAsString
     *
     * @param method
     * @return
     * @throws IOException
     */
    public static String unGzipResponseBodyAsString(HttpMethodBase method) throws IOException {
        GZIPInputStream gzin;

        if (method.getResponseBody() != null) {
            Header header = method.getResponseHeader("Content-Encoding");
            if (header != null && header.getValue().toLowerCase().contains("gzip")) {
                InputStream is = method.getResponseBodyAsStream();
                gzin = new GZIPInputStream(is);
                InputStreamReader isr = new InputStreamReader(gzin, method.getResponseCharSet());
                BufferedReader    br  = new BufferedReader(isr);
                StringBuffer      sb  = new StringBuffer();
                String            tempbf;
                while ((tempbf = br.readLine()) != null) {
                    sb.append(tempbf);
                    sb.append("\r\n");
                }
                isr.close();
                gzin.close();
                return sb.toString();
            } else {
                return method.getResponseBodyAsString();
            }
        } else {
            return null;
        }
    }
}

