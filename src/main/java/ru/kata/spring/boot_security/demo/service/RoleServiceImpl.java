package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.dao.RoleDao;
import ru.kata.spring.boot_security.demo.models.Role;

@Service
public class RoleServiceImpl implements RoleService {
    private RoleDao roleDao;
    @Autowired
    RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }
    @Transactional
    @Override
    public Role getRole(String roleName) {
        return roleDao.getRole(roleName);
    }
}
