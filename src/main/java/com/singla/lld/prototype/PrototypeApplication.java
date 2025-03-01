package com.singla.lld.prototype;

import com.singla.lld.prototype.model.Room;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrototypeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PrototypeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Room r = Room.builder()
				.id("1")
				.type("double")
				.number("101")
				.beds(2).build();

		Room r2 = r.clone();
		r2.setNumber("102");

		//even of we are updating "r2" but it doesn't affect "r"
		// shows we are actually cloning it not just using reference.
		System.out.println(r);
		System.out.println(r2);
	}
}
