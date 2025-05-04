package iogithub.rafaelferreirac.arquiteturaspring;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	//	SpringApplication.run(ArquiteturaspringApplication.class, args);
		SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
		builder.bannerMode(Mode.OFF);
		
		builder.profiles("producao", "homologação");
		builder.run(args);
	} 

}
