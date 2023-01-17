package com.fungiblestory.writer.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

// Master Table

@Entity
@Table(name = "Role")
public class Role implements Serializable {

	private static final long serialVersionUID = 8197093792215103614L;

	@Column(name = "RoleId", updatable = false, nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long RoleId;

	@Column(name = "RoleName", updatable = false, nullable = false)
	private String RoleName;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "role")
	private User user;

	public Long getRoleId() {
		return RoleId;
	}

	public void setRoleId(Long roleId) {
		RoleId = roleId;
	}

	public String getRoleName() {
		return RoleName;
	}

	public void setRoleName(String roleName) {
		RoleName = roleName;
	}

	@Override
	public String toString() {
		return "Role [RoleId=" + RoleId + ", RoleName=" + RoleName + ", user=" + user + "]";
	}

}
