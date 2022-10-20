package com.storemanagement.storemanagement.model;

import org.springframework.security.core.GrantedAuthority;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
public class Role implements UserDetails{

	    private String userName;
	    private String passwords;
	    private boolean active;
	    private List<GrantedAuthority> authorities;

	    public Role(User bean) {
	        this.userName = bean.getUserName();
	        this.passwords = bean.getPasswords();
	        this.active = bean.isActive();
	        this.authorities = Arrays.stream(bean.getRoles().split(","))
	                    .map(SimpleGrantedAuthority::new)
	                    .collect(Collectors.toList());
	    }

	    @Override
	    public Collection<? extends GrantedAuthority> getAuthorities() {
	        return authorities;
	    }

	    @Override
	    public String getPassword() {
	        return passwords;
	    }

	    @Override
	    public String getUsername() {
	        return userName;
	    }

	    @Override
	    public boolean isAccountNonExpired() {
	        return true;
	    }

	    @Override
	    public boolean isAccountNonLocked() {
	        return true;
	    }

	    @Override
	    public boolean isCredentialsNonExpired() {
	        return true;
	    }

	    @Override
	    public boolean isEnabled() {
	        return active;
	    }
	}


