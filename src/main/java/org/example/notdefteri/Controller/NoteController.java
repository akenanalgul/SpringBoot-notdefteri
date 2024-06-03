package org.example.notdefteri.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class NoteController {
    private List<String> notes = new ArrayList<>();

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("notes", notes);
        return "index";
    }

    @PostMapping("/addNote")
    public String addNote(@RequestParam("note") String note, Model model) {
        notes.add(note);
        model.addAttribute("notes", notes);
        return "index";
    }
}
