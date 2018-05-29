package com.itheima.dao;
import java.util.List;

import com.itheima.po.Book;
import com.itheima.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * ���ų��������
 */
public class BookDao {
	/**
	 * ���ݿͻ���Ų�ѯ�ͻ���Ϣ
	 */


	public List<Book> findBookByCondiction(Book book) throws Exception {
		SqlSession sqlSession = MybatisUtils.getSession();
		// 4��SqlSessionִ��ӳ���ļ��ж����SQL��������ӳ����
		List<Book> books = sqlSession.selectList("com.itheima.mapper.BookMapper.findBookByCondiction", book);
		// 5���ر�SqlSession
		sqlSession.close();
		return books;
	}

}
