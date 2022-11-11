package de.neuefische.ffmjava221.aws.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fish")
@RequiredArgsConstructor
public class FishController {

    @GetMapping
    String get() {
        return "altefische";
    }

}
