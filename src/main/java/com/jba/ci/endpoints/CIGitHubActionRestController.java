package com.jba.ci.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author judebarnabasantony
 *
 */

@RestController
@RequestMapping("/api/v1/ci")
public class CIGitHubActionRestController {

	private static final String JUDE_S_GIT_HUB_ACTION_CI_EXAMPLE = "Jude's GitHub Action CI Example";

	@GetMapping("/health")
    public String health() {
        return JUDE_S_GIT_HUB_ACTION_CI_EXAMPLE;
    }
}
