package herbalapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class herbappTest {

    @Test
    void testHomePageNavigationButtons(){
        herbapp app = new herbapp();
        String html = app.home();

        assertTrue(html.contains("/herb/all"));
        assertTrue(html.contains("/herb/random"));
    }

    @Test
    void testReturnHomeButtons(){
        herbapp app = new herbapp();
        String html = app.home();

        assertTrue(app.ranHerb().contains("/herb"));
        assertTrue(app.getAllHerbs().contains("/herb"));
    }

    @Test
    void ranHerb() {
        herbapp app = new herbapp();
        String html = app.ranHerb();

        String extracted = html.substring(html.indexOf("<p>") + 3, html.indexOf("</p"));
        assertTrue(app.getAllHerbs().contains(extracted),
                "Random herb should be one of the herbs in the list");
    }

    @Test
    void testAllHerbsHtml() {
        herbapp app = new herbapp();
        String html = app.getAllHerbs();

        assertTrue(html.contains("<ul>"));
        assertTrue(html.contains("<li>"));
        assertTrue(html.contains("Lemongrass"));
    }

}