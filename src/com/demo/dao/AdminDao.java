package com.demo.dao;

import com.demo.model.Admin;

/**
 * dao��ӿ�-�����ݿ⣺�����Ĳ���
 * @author MouseHappy
 */
public interface AdminDao {

	/**
	 * ��ȡһ������
	 * @param id
	 * @return Admin
	 */
	Admin find(int id);

	/**
	 * �����¼��֤
	 * @param username
	 * @param password
	 * @return Admin
	 */
	Admin find(String username, String password);

}
