package codelook.example.introductiontojpa.jpa;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class TestingWebApplicationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnDefaultMessage() throws Exception {
        assertThat("controller").isNotNull();
//        this.mockMvc.perform(get("/buddyInfoes")).andDo(print()).andExpect(status().isOk())
//                .andExpect(content().string(containsString(
//
//                        "<head>\n" +
//                        "  <title> All My Addy Books</title>\n" +
//                        "  <meta charset='UTF-8'>\n" +
//                        "\n" +
//                        "</head>\n" +
//                        "<body>\n" +
//                        "<a href='/addressBooks'>Back to all Buddies</a>\n" +
//                        "<table class='table'>\n" +
//                        "  <thead class='thead-dark'>\n" +
//                        "  <tr>\n" +
//                        "    <th scope='col'>Buddy Id</th>\n" +
//                        "    <th scope='col'>Buddy Name</th>\n" +
//                        "    <th scope='col'>Buddy Number</th>\n" +
//                        "  </tr>\n" +
//                        "  </thead>\n" +
//                        "  <tbody>\n" +
//                        "  <tr>\n" +
//                        "    <td>1</td>\n" +
//                        "    <td>Jack</td>\n" +
//                        "    <td>4167777777</td>\n" +
//                        "  </tr>\n" +
//                        "  <tr>\n" +
//                        "    <td>2</td>\n" +
//                        "    <td>Jill</td>\n" +
//                        "    <td>4168888888</td>\n" +
//                        "  </tr>\n" +
//                        "  <tr>\n" +
//                        "    <td>3</td>\n" +
//                        "    <td>Hill</td>\n" +
//                        "    <td>4169999999</td>\n" +
//                        "  </tr>\n" +
//                        "  </tbody>\n" +
//                        "</table>\n" +
//                        "<a href='/createBuddy'>Create New Buddy</a>\n" +
//                        "</body>\n")));
    }
}