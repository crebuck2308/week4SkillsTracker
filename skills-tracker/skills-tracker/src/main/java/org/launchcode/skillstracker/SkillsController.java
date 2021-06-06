package org.launchcode.skillstracker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    //Handles requests at path localhost:8080
    @GetMapping
    public String skillsTracker() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Python</li>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "</ol>";
    }

    //@ localhost:8080/form - add form that allows user to enter name
    //choose favorite, second/third favorite languages
    //use select elements for each of the rankings
    @GetMapping("form")
    public String skillsTrackerForm() {
        return "<html>" +
                "<body>" +
                "<form action= '/form' method= 'post'>" +
                "<label>Name:</label>" +
                "<input type= 'text' name= 'name'>" +


                "<p>" +
                "<label for= 'favorite-select'>My FAVORITE language:</label>" +
                "<select name='favorite' id= 'favorite-language'>" +
                "<option value= ''>--Please select an option--</option>" +
                "<option value= 'Python'>Python</option>" +
                "<option value= 'JavaScript'>JavaScript</option>" +
                "<option value= 'Java'>Java</option>" +
                "</select>" +
                "</p>" +

                "<p>" +
                "<label for= 'second-favorite'>My SECOND favorite language:</label>" +
                "<select name= 'second' id= 'second-favorite'>" +
                "<option value= ''>--Please select an option--</option>" +
                "<option value= 'Python'>Python</option>" +
                "<option value= 'JavaScript'>JavaScript</option>" +
                "<option value= 'Java'>Java</option>" +
                "</select>" +
                "</p>" +

                "<p>" +
                "<label for= 'third-favorite'>My THIRD favorite language:</label>" +
                "<select name= 'third' id= 'third-favorite'>" +
                "<option value= ''>--Please select an option--</option>" +
                "<option value= 'Python'>Python</option>" +
                "<option value= 'JavaScript'>JavaScript</option>" +
                "<option value= 'Java'>Java</option>" +
                "</select>" +
                "</p>" +
                "<input type= 'submit' value= 'Submit' method= 'post'>" +
                "</form>" +
                "</html>";
    }

    //also @localhost:8080/form - use @PostMapping and @RequestParam to update the HTML
    //w/ and h1  stating the user's name and an ol showing the 3 programming languages
    @PostMapping("form")

    public String skillsTrackerPostMapping(@RequestParam String name, String favorite, String second, String third){

        return "<html>" +
                "<form>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol type='1'>" +
                "<li>" +favorite+ "</li>" +
                "<li>"+second+"</li>" +
                "<li>"+third+"</li>";

    }
}
