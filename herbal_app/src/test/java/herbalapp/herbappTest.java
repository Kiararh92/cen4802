package herbalapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class herbappTest {

    @Test
    void ranHerb() {
        herbapp app = new herbapp();
        String html = app.ranHerb();

        String extracted = html.substring(html.indexOf("<p>") + 3, html.indexOf("</p"));
        assertTrue(app.getAllHerbs().contains(extracted),
                "Random herb should be one of the herbs in the list");
    }

    @Test
    void testAllHerbs() {
        herbapp app  = new herbapp();
        assertEquals(8, app.getAllHerbs().size(),
                "Herb List should contain 8 items.");
    }
}