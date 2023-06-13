package com.demo.springmongoadvance.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springmongoadvance.entity.User;
import com.demo.springmongoadvance.repos.OrderRepository;

@RestController
@RequestMapping("shop")
public class OrderController {

	private OrderRepository orderRepository;

	public OrderController(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}
	
	@PostMapping("/add")
	public String addOrders(@RequestBody User user) {
		
		System.out.println("new orders is placed");
		orderRepository.save(user);
		return "Order is placed";
	}
	
	@GetMapping("/getName/{name}")
	public List<User> getUsersByName(@PathVariable String name) {			
		return orderRepository.findByName(name);
	}
	@GetMapping("/getCity/{city}")
	public List<User> getUsersByCity(@PathVariable String city) {			
		return orderRepository.findByCity(city);
	}
}
