package org.springframework.samples.petclinic.vets;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")  // ← Add this annotation to use test profile
class VetsServiceApplicationTest {  // ← Change to class (not public)

    @Test
    void contextLoads() {  // ← Better test name
        // This test verifies that the Spring context loads successfully
        // with the test profile (no external dependencies)
        // No need to call main() method directly
    }
}