package com.itheima.dao;
import java.util.List;

import com.itheima.po.Book;
import com.itheima.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * 入门程序测试类
 */
public class BookDao {
	/**
	 * 根据客户编号查询客户信息
	 */


	public List<Book> findBookByCondiction(Book book) throws Exception {
		SqlSession sqlSession = MybatisUtils.getSession();
		// 4、SqlSession执行映射文件中定义的SQL，并返回映射结果
		List<Book> books = sqlSession.selectList("com.itheima.mapper.BookMapper.findBookByCondiction", book);
		// 5、关闭SqlSession
		sqlSession.close();
		return books;
	}

}
