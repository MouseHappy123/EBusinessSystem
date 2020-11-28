package com.demo.dao;

import java.util.List;

import com.demo.model.Statistics;


/**
 * dao��ӿ�- ������� ͳ�Ʊ��� ����
 * @author MouseHappy
 */
public interface StatisticsDao {
	/**
	 * ��ȡͳ�Ʊ���
	 * @return List<Statistics>
	 */
	List<Statistics> getStatistics();
}
