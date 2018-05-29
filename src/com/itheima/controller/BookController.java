package com.itheima.controller;

import com.itheima.dao.BookDao;

import com.itheima.po.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BookController {



    @RequestMapping(value = "/findBookByCondiction")
    public String findBookByCondiction(Model model,Book book)throws Exception {


        BookDao mybatisTest = new BookDao();
        List<Book> books = mybatisTest.findBookByCondiction(book);
        model.addAttribute("books", books);
        return "index.jsp";

    }
}
