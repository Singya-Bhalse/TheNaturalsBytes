//package com.userexprior.controller;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.Date;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import com.userexprior.service.EmployeeService;
//
//@Component
//public class ReadJsonFile {
//
//	@Autowired
//	EmployeeService employeeService;
//
////	@Scheduled(fixedRate=60*60*1000)
//	public void save() {
//		System.out.println(new Date());
//		try (Stream<Path> walk = Files.walk(Paths.get("F:\\EmployeeActivitiesToBeProcessed"))) {
//			List<String> result = walk.filter(Files::isRegularFile).map(x -> x.toString())
//					.filter(f -> f.endsWith(".json")).collect(Collectors.toList());
//			employeeService.save(result);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//}
//
