package com.xworkz.service.transformer;

import com.xworkz.service.tranformers.dto.TransformerDTO;
import com.xworkz.transformer.service.TransformerService;
import com.xworkz.transformer.service.TransformerServiceImpl;

public class TransformerTester {

	public static void main(String[] args) {

		TransformerDTO dto = new TransformerDTO("Dhanya", "Shimoga", "Silent", "Sometimes", "Always", "Sometimes",
				"Painting,Sleeping,Eating,Travelling");

		TransformerService service = new TransformerServiceImpl();
		boolean save = service.validateAndSave(dto);
		System.out.println(save);

	}

}
