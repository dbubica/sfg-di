package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nGreetingService")
@Profile({"NL", "default"})
public class I18nNedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hallo Wereld - NL";
    }
}
