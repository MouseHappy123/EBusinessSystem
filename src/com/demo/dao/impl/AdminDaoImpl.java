package com.demo.dao.impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.demo.utils.JdbcUtils;
import com.demo.dao.AdminDao;
import com.demo.model.Admin;

/**
 * dao��ʵ��-�����ݿ⣺�����Ĳ���
 * @author MouseHappy
 */
public class AdminDaoImpl implements AdminDao {
	/** (non-Javadoc)
	 * @see com.demo.dao.AdminDao#find(java.lang.Integer)
	 */
	@Override
	public Admin find(int id){
		try{
			QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
			String sql = "select * from admin where id=?";// SQL���
			return (Admin)runner.query(sql, id, new BeanHandler(Admin.class));// ִ��SQL��䣬��ʹ��BeanHandler���߽����תΪPOJO����
		} catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
	/** (non-Javadoc)
	 * @see com.demo.dao.AdminDao#find(java.lang.String, java.lang.String)
	 */
	@Override
	public Admin find(String username, String password){
		try{
			QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());// JDBC�ĵ����ߣ����ݿ�����࣬DBUtils���ߣ�����Ϊc3p0���ӳ�
			String sql = "select * from admin where username=? and password=?";// SQL���
			Object params[] = {username, password};// ���������װΪ��������
			return (Admin)runner.query(sql, params, new BeanHandler(Admin.class));// ִ��SQL��䣬��ʹ��BeanHandler���߽����תΪPOJO����
		} catch(Exception e){
			throw new RuntimeException(e);
		}
	}
}
