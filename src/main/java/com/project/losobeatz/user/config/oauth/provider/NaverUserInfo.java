package com.project.losobeatz.user.config.oauth.provider;

import java.util.Map;

public class NaverUserInfo implements OAuth2Userinfo{

    private Map<String, Object> attributes;

    // {id=z2jYtag9bG58Bl6x5XncIZGEESX1E7l909W3Zka7KYk, email=kitewrld@naver.com, name=김준원}}
    public NaverUserInfo(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String getProviderId() {
        return (String) attributes.get("id");
    }

    @Override
    public String getProvider() {
        return "naver";
    }

    @Override
    public String getEmail() {
        return (String) attributes.get("email");
    }

    @Override
    public String getName() {
        return (String) attributes.get("name");
    }
}
