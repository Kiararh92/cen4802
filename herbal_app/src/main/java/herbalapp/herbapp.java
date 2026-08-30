package herbalapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class herbapp {

    private final List<String> herbs = List.of(
            "Lemongrass - A simple herb often used to relieve stress",
            "Lavender - Commonly used to reduce anxiety and improve sleep quality",
            "Pine needle - can act as an antidepressant",
            "Yarrow - Commonly used to treat wounds and soothe an upset stomach",
            "Kava - Acts as a powerful relaxant, aids with anxiety and insomnia"
            );


    private final Random random = new Random();

    @GetMapping("/herb/random")
    public String ranHerb() {
        int index = random.nextInt(herbs.size());
        return herbs.get(index);
    }
}

