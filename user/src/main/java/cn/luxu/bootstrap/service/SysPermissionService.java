package cn.luxu.bootstrap.service;

import cn.luxu.dto.Page;
import cn.luxu.model.SysPermission;

import java.util.Map;
import java.util.Set;

public interface SysPermissionService {

	/**
	 * 根绝角色ids获取权限集合
	 * 
	 * @param roleIds
	 * @return
	 */
	Set<SysPermission> findByRoleIds(Set<Long> roleIds);

	void save(SysPermission sysPermission);

	void update(SysPermission sysPermission);

	void delete(Long id);

	Page<SysPermission> findPermissions(Map<String, Object> params);
}
