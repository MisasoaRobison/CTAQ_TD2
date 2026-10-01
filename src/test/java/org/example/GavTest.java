package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GavTest{

  @Test
  void test_verify_group(){
    Gav gav = Gav.parse("org.acme:lib-a:1.0.0");
    assertEquals("org.acme", gav.group());
  }

  @Test
  void test_verify_GroupArtefactVersion(){
    Gav gav = Gav.parse("org.other:lib-c:3.0.0");
    assertEquals("org.other", gav.group());
    assertEquals("lib-c", gav.artefact());
    assertEquals("3.0.0", gav.version());
  }
  
}
