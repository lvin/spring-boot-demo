package com.example.demo;

import com.example.demo.learning.cglib.Dao;
import com.example.demo.learning.cglib.DaoFilter;
import com.example.demo.learning.cglib.DaoProxy;
import com.example.demo.service.A;
import com.wensen.ExampleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
	private A a;

    @Autowired
	private ExampleService exampleService;

    @Test
	public void printATest() {
		System.out.println("=========================");
		a.printA();
		System.out.println("=========================");
	}

	@Test
	public void contextLoads() {
	}

	@Test
	public void cglibTest() {
		DaoProxy daoProxy = new DaoProxy();
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(Dao.class);
		enhancer.setCallbacks(new Callback[]{daoProxy});
		enhancer.setCallbackFilter(new DaoFilter());

		Dao dao = (Dao)enhancer.create();
		dao.update();
		dao.select();
	}

	@Test
	public void exampleTest() {
		exampleService.func();
	}




}
