package com.huboot.business.base_model.login.sso.client.secruity.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.huboot.business.base_model.login.sso.client.dto.BaseUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class JwtUser implements UserDetails {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final String gid;//全局id(ssoId)
	
    private final String account;
    
    private final String password;
    
    private final BaseUser.UserStatus status;
    
    private final Collection<? extends GrantedAuthority> authorities;

    public JwtUser(
            String gid,
            String account,
            String password,
            BaseUser.UserStatus status,
            Collection<? extends GrantedAuthority> authorities) {
        this.gid = gid;
        this.account = account;
        this.password = password;
        this.status = status;
        this.authorities = authorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @JsonIgnore
    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return account;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isEnabled() {
        return true;
    }

	public String getGid() {
		return gid;
	}

	public String getAccount() {
		return account;
	}

	public BaseUser.UserStatus getStatus() {
		return status;
	}

	
}
