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
            "Kava - Acts as a powerful relaxant, aids with anxiety and insomnia",
            "Chamomile - Promotes sleep and reduces mild levels of anxiety",
            "Holy Basil - Helps manage physical and mental stress",
            "Valerian Root - Commonly used to treat insomnia, restlessness, and deep nervous tension"
            );


    private final Random random = new Random();

    @GetMapping("/herb")
    public String home() {
        return """
            <body style='background-color: #2c3e50; font-size: 18px; '>
                <h1>Home Page</h1>
                <a href=' /herb/all'><button>View All Herbs</button></a>
                <a href=' /herb/random'><button>Random Herb</button></a>
            </body>
            """;
    }

    @GetMapping("/herb/random")
    public String ranHerb() {
        int index = random.nextInt(herbs.size());
        String herb = herbs.get(index);

        return "<body style='background-color: #2c3e50; font-size: 18px;'>" +
                "<h1>Random Herb:</h1>" +
                "<p>" + herb + "</p>" +
                "<a href=' /herb'><button>Homepage</button></a>" +
                "</body>";
    }

    @GetMapping("/herb/all")
    public String getAllHerbs() {

        StringBuilder html = new StringBuilder();

        html.append("<body style='background-color: #2c3e50; font-size: 18px; color: black;'>");
        html.append("<h1>All Herbs:</h1>");
        html.append("<ul>");

        for (String herb : herbs) {
            html.append("<li>").append(herb).append("</li>");
        }

        html.append("</ul>");
        html.append("<a href=' /herb'><button>Homepage</button></a>");
        html.append("</body>");

        return html.toString();
    }

}

