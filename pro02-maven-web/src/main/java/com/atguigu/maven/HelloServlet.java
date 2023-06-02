package com.atguigu.maven;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;

/*
main 目录下的Java类： HelloServlet 
compile 范围引入的依赖： pro01-maven-java
pro01-maven-java 中的类： Calculator
*/ 

// 验证目标： 通过 import语句将要测试的类引入当前类，看是否编译通过
// 这个范围的依赖对当前类有效

import com.atguigu.maven.Calculator;


public class HelloServlet extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.getWriter().write("hello maven web");

    }

}
