package com.buyun.mall.security.auth.client.config;

import org.springframework.beans.factory.annotation.Value;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName ServiceAuthConfig
 * @Description 服务授权配置
 * @Author hmily
 * @Date 2020/5/11 17:00
 * @Version 1.0
 */
public class ServiceAuthConfig {

    private byte[] pubKeyByte;
    @Value("${auth.client.id:null}")
    private String clientId;
    @Value("${auth.client.secret}")
    private String clientSecret;
    @Value("${auth.client.token-header}")
    private String tokenHeader;
    @Value("${spring.application.name}")
    private String applicationName;

    public String getTokenHeader() {
        return tokenHeader;
    }

    public void setTokenHeader(String tokenHeader) {
        this.tokenHeader = tokenHeader;
    }

    public String getClientId() {
        return "null".equals(clientId)?applicationName:clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getToken(HttpServletRequest request){
        return request.getHeader(this.getTokenHeader());
    }

    public byte[] getPubKeyByte() {
        return pubKeyByte;
    }

    public void setPubKeyByte(byte[] pubKeyByte) {
        this.pubKeyByte = pubKeyByte;
    }
}
