package com.guige.account.pojo.dto;

import com.guige.account.pojo.entity.Role;
import com.guige.account.pojo.entity.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Anwei.S
 * @CreateDate 2017年2月14日 上午10:31:23
 * @Description:
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class UserDto extends User implements UserDetails {
	List<Role> roles = new ArrayList<>();


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> auths = new ArrayList<>();
		List<Role> roles = this.getRoles();
		for (Role role : roles) {
			auths.add(new SimpleGrantedAuthority(role.getRoleName()));
		}
		return auths;
	}

	@Override
	public String getUsername() {
		return getMobile();
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
		return true;
	}
}
