package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.SomeService;

public class SomeController {

    private final SomeService someService;

    public SomeController(SomeService someService) {
        this.someService = someService;
    }
}
