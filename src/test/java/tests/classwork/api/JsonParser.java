package tests.classwork.api;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class JsonParser {

    ObjectMapper objectMapper = new ObjectMapper();

    public void toJson() throws IOException {
        Recipe recipe = new Recipe("Salad", Arrays.asList(new Ingredient("Tomato", 2), new Ingredient("Cucumber", 1)), 3);
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/test/resources/temp/recipe.json"), recipe);
        String string = objectMapper.writeValueAsString(recipe);
    }

    public void fromJson() throws IOException {
        Recipe recipe = objectMapper
                .readValue(new File("src/test/resources/recipefiles/recipe.json"), Recipe.class);
        System.out.println(recipe);
    }
}
