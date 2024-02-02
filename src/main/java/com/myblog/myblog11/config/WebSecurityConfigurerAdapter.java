package com.myblog.myblog11.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public abstract class WebSecurityConfigurerAdapter {
    protected abstract void configure(HttpSecurity http) throws Exception;
}
