package tests.classwork.api;

import java.io.IOException;

public class RunnerParser {

    public static void main(String[] args) throws IOException {

        JsonParser jsonParser = new JsonParser();
        jsonParser.toJson();
        jsonParser.fromJson();
    }
}
