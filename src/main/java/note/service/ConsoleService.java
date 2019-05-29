package note.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleService {
    private BufferedReader reader;

    public ConsoleService() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String askQuestion(String question) throws IOException {
        return askQuestion(question, false);
    }

    public String askQuestion(String question, boolean isMultiLine) throws IOException {
        System.out.println(question);
        StringBuilder text = new StringBuilder();
        String line;
        do {
            line = reader.readLine();
            text.append(line).append("\n");
        } while (!line.equals("") && isMultiLine);
        return text.toString().trim();
    }
}
